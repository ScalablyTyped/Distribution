package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerCredentialCreateEvent extends js.Object {
  var credential: Credential
}

object IdentityManagerCredentialCreateEvent {
  @scala.inline
  def apply(credential: Credential): IdentityManagerCredentialCreateEvent = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentityManagerCredentialCreateEvent]
  }
}

