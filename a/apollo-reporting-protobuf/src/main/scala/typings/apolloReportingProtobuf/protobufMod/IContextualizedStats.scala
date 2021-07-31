package typings.apolloReportingProtobuf.protobufMod

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
  
  @scala.inline
  def apply(): IContextualizedStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedStats]
  }
  
  @scala.inline
  implicit class IContextualizedStatsMutableBuilder[Self <: IContextualizedStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: IStatsContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setPerTypeStat(value: StringDictionary[ITypeStat]): Self = StObject.set(x, "perTypeStat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerTypeStatNull: Self = StObject.set(x, "perTypeStat", null)
    
    @scala.inline
    def setPerTypeStatUndefined: Self = StObject.set(x, "perTypeStat", js.undefined)
    
    @scala.inline
    def setQueryLatencyStats(value: IQueryLatencyStats): Self = StObject.set(x, "queryLatencyStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryLatencyStatsNull: Self = StObject.set(x, "queryLatencyStats", null)
    
    @scala.inline
    def setQueryLatencyStatsUndefined: Self = StObject.set(x, "queryLatencyStats", js.undefined)
  }
}
