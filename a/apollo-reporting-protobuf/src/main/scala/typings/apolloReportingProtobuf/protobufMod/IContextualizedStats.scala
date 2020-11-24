package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualizedStats extends js.Object {
  
  /** ContextualizedStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.native
  
  /** ContextualizedStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.native
  
  /** ContextualizedStats queryLatencyStats */
  var queryLatencyStats: js.UndefOr[IQueryLatencyStats | Null] = js.native
}
object IContextualizedStats {
  
  @scala.inline
  def apply(): IContextualizedStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedStats]
  }
  
  @scala.inline
  implicit class IContextualizedStatsOps[Self <: IContextualizedStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: IStatsContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    
    @scala.inline
    def setPerTypeStat(value: StringDictionary[ITypeStat]): Self = this.set("perTypeStat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerTypeStat: Self = this.set("perTypeStat", js.undefined)
    
    @scala.inline
    def setPerTypeStatNull: Self = this.set("perTypeStat", null)
    
    @scala.inline
    def setQueryLatencyStats(value: IQueryLatencyStats): Self = this.set("queryLatencyStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryLatencyStats: Self = this.set("queryLatencyStats", js.undefined)
    
    @scala.inline
    def setQueryLatencyStatsNull: Self = this.set("queryLatencyStats", null)
  }
}
