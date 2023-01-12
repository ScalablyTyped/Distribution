package typings.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContextualizedStats extends StObject {
  
  /** ContextualizedStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.undefined
  
  /** ContextualizedStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.undefined
  
  /** ContextualizedStats queryLatencyStats */
  var queryLatencyStats: js.UndefOr[IQueryLatencyStats | Null] = js.undefined
}
object IContextualizedStats {
  
  inline def apply(): IContextualizedStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IContextualizedStats] (val x: Self) extends AnyVal {
    
    inline def setContext(value: IStatsContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setPerTypeStat(value: StringDictionary[ITypeStat]): Self = StObject.set(x, "perTypeStat", value.asInstanceOf[js.Any])
    
    inline def setPerTypeStatNull: Self = StObject.set(x, "perTypeStat", null)
    
    inline def setPerTypeStatUndefined: Self = StObject.set(x, "perTypeStat", js.undefined)
    
    inline def setQueryLatencyStats(value: IQueryLatencyStats): Self = StObject.set(x, "queryLatencyStats", value.asInstanceOf[js.Any])
    
    inline def setQueryLatencyStatsNull: Self = StObject.set(x, "queryLatencyStats", null)
    
    inline def setQueryLatencyStatsUndefined: Self = StObject.set(x, "queryLatencyStats", js.undefined)
  }
}
