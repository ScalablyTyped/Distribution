package typings.apolloReportingProtobuf.protobufMod

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
  
  @scala.inline
  def apply(): IContextualizedQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedQueryLatencyStats]
  }
  
  @scala.inline
  implicit class IContextualizedQueryLatencyStatsMutableBuilder[Self <: IContextualizedQueryLatencyStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: IStatsContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setQueryLatencyStats(value: IQueryLatencyStats): Self = StObject.set(x, "queryLatencyStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryLatencyStatsNull: Self = StObject.set(x, "queryLatencyStats", null)
    
    @scala.inline
    def setQueryLatencyStatsUndefined: Self = StObject.set(x, "queryLatencyStats", js.undefined)
  }
}
