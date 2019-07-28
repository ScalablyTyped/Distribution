package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOutboundVoiceContactResponse extends js.Object {
  /**
    * The unique identifier of this contact within your Amazon Connect instance.
    */
  var ContactId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.ContactId] = js.undefined
}

object StartOutboundVoiceContactResponse {
  @scala.inline
  def apply(ContactId: ContactId = null): StartOutboundVoiceContactResponse = {
    val __obj = js.Dynamic.literal()
    if (ContactId != null) __obj.updateDynamic("ContactId")(ContactId)
    __obj.asInstanceOf[StartOutboundVoiceContactResponse]
  }
}

