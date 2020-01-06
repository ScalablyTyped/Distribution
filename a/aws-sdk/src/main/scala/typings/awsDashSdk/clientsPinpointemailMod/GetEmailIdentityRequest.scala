package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailIdentityRequest extends js.Object {
  /**
    * The email identity that you want to retrieve details for.
    */
  var EmailIdentity: Identity = js.native
}

object GetEmailIdentityRequest {
  @scala.inline
  def apply(EmailIdentity: Identity): GetEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetEmailIdentityRequest]
  }
}

