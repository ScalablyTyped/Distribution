package typings.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContextualizedQueryLatencyStats extends StObject {
  
  /** ContextualizedQueryLatencyStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.undefined
  
  /** ContextualizedQueryLatencyStats queryLatencyStats */
  var queryLatencyStats: js.UndefOr[IQueryLatencyStats | Null] = js.undefined
}
object IContextualizedQueryLatencyStats {
  
  inline def apply(): IContextualizedQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedQueryLatencyStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IContextualizedQueryLatencyStats] (val x: Self) extends AnyVal {
    
    inline def setContext(value: IStatsContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setQueryLatencyStats(value: IQueryLatencyStats): Self = StObject.set(x, "queryLatencyStats", value.asInstanceOf[js.Any])
    
    inline def setQueryLatencyStatsNull: Self = StObject.set(x, "queryLatencyStats", null)
    
    inline def setQueryLatencyStatsUndefined: Self = StObject.set(x, "queryLatencyStats", js.undefined)
  }
}
