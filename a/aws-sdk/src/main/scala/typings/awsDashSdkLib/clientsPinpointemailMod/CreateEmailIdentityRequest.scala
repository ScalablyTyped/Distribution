package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEmailIdentityRequest extends js.Object {
  /**
    * The email address or domain that you want to verify.
    */
  var EmailIdentity: Identity
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateEmailIdentityRequest {
  @scala.inline
  def apply(EmailIdentity: Identity, Tags: TagList = null): CreateEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateEmailIdentityRequest]
  }
}

