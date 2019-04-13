package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEmailIdentityRequest extends js.Object {
  /**
    * The email identity that you want to retrieve details for.
    */
  var EmailIdentity: Identity
}

object GetEmailIdentityRequest {
  @scala.inline
  def apply(EmailIdentity: Identity): GetEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity)
  
    __obj.asInstanceOf[GetEmailIdentityRequest]
  }
}

