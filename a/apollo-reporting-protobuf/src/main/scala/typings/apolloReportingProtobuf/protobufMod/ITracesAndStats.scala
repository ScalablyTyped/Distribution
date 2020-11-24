package typings.apolloReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITracesAndStats extends js.Object {
  
  /** TracesAndStats statsWithContext */
  var statsWithContext: js.UndefOr[js.Array[IContextualizedStats] | Null] = js.native
  
  /** TracesAndStats trace */
  var trace: js.UndefOr[js.Array[ITrace] | Null] = js.native
}
object ITracesAndStats {
  
  @scala.inline
  def apply(): ITracesAndStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITracesAndStats]
  }
  
  @scala.inline
  implicit class ITracesAndStatsOps[Self <: ITracesAndStats] (val x: Self) extends AnyVal {
    
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
    def setStatsWithContextVarargs(value: IContextualizedStats*): Self = this.set("statsWithContext", js.Array(value :_*))
    
    @scala.inline
    def setStatsWithContext(value: js.Array[IContextualizedStats]): Self = this.set("statsWithContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatsWithContext: Self = this.set("statsWithContext", js.undefined)
    
    @scala.inline
    def setStatsWithContextNull: Self = this.set("statsWithContext", null)
    
    @scala.inline
    def setTraceVarargs(value: ITrace*): Self = this.set("trace", js.Array(value :_*))
    
    @scala.inline
    def setTrace(value: js.Array[ITrace]): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    
    @scala.inline
    def setTraceNull: Self = this.set("trace", null)
  }
}
