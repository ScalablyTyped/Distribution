package typings.apolloReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStatsContext extends js.Object {
  
  /** StatsContext clientName */
  var clientName: js.UndefOr[String | Null] = js.native
  
  /** StatsContext clientReferenceId */
  var clientReferenceId: js.UndefOr[String | Null] = js.native
  
  /** StatsContext clientVersion */
  var clientVersion: js.UndefOr[String | Null] = js.native
}
object IStatsContext {
  
  @scala.inline
  def apply(): IStatsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatsContext]
  }
  
  @scala.inline
  implicit class IStatsContextOps[Self <: IStatsContext] (val x: Self) extends AnyVal {
    
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
    def setClientName(value: String): Self = this.set("clientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientName: Self = this.set("clientName", js.undefined)
    
    @scala.inline
    def setClientNameNull: Self = this.set("clientName", null)
    
    @scala.inline
    def setClientReferenceId(value: String): Self = this.set("clientReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientReferenceId: Self = this.set("clientReferenceId", js.undefined)
    
    @scala.inline
    def setClientReferenceIdNull: Self = this.set("clientReferenceId", null)
    
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVersion: Self = this.set("clientVersion", js.undefined)
    
    @scala.inline
    def setClientVersionNull: Self = this.set("clientVersion", null)
  }
}
