package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEmailIdentityRequest extends js.Object {
  /**
    * The identity (that is, the email address or domain) that you want to delete.
    */
  var EmailIdentity: Identity = js.native
}

object DeleteEmailIdentityRequest {
  @scala.inline
  def apply(EmailIdentity: Identity): DeleteEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEmailIdentityRequest]
  }
}

