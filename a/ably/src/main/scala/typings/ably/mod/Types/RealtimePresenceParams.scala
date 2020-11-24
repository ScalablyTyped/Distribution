package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimePresenceParams extends js.Object {
  
  var clientId: js.UndefOr[String] = js.native
  
  var connectionId: js.UndefOr[String] = js.native
  
  var waitForSync: js.UndefOr[Boolean] = js.native
}
object RealtimePresenceParams {
  
  @scala.inline
  def apply(): RealtimePresenceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimePresenceParams]
  }
  
  @scala.inline
  implicit class RealtimePresenceParamsOps[Self <: RealtimePresenceParams] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setConnectionId(value: String): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = this.set("waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForSync: Self = this.set("waitForSync", js.undefined)
  }
}
