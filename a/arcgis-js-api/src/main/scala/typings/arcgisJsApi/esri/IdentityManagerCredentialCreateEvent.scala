package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityManagerCredentialCreateEvent extends js.Object {
  var credential: Credential = js.native
}

object IdentityManagerCredentialCreateEvent {
  @scala.inline
  def apply(credential: Credential): IdentityManagerCredentialCreateEvent = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerCredentialCreateEvent]
  }
  @scala.inline
  implicit class IdentityManagerCredentialCreateEventOps[Self <: IdentityManagerCredentialCreateEvent] (val x: Self) extends AnyVal {
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
    def setCredential(value: Credential): Self = this.set("credential", value.asInstanceOf[js.Any])
  }
  
}

