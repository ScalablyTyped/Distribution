package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEmailIdentityRequest extends js.Object {
  /**
    * The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint account.
    */
  var EmailIdentity: Identity
}

object DeleteEmailIdentityRequest {
  @scala.inline
  def apply(EmailIdentity: Identity): DeleteEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity)
  
    __obj.asInstanceOf[DeleteEmailIdentityRequest]
  }
}

