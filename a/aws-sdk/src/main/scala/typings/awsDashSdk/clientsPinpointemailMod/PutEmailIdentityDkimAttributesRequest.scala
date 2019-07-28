package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEmailIdentityDkimAttributesRequest extends js.Object {
  /**
    * The email identity that you want to change the DKIM settings for.
    */
  var EmailIdentity: Identity
  /**
    * Sets the DKIM signing configuration for the identity. When you set this value true, then the messages that Amazon Pinpoint sends from the identity are DKIM-signed. When you set this value to false, then the messages that Amazon Pinpoint sends from the identity aren't DKIM-signed.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.undefined
}

object PutEmailIdentityDkimAttributesRequest {
  @scala.inline
  def apply(EmailIdentity: Identity, SigningEnabled: js.UndefOr[Enabled] = js.undefined): PutEmailIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity)
    if (!js.isUndefined(SigningEnabled)) __obj.updateDynamic("SigningEnabled")(SigningEnabled)
    __obj.asInstanceOf[PutEmailIdentityDkimAttributesRequest]
  }
}

