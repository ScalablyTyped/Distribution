package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEmailIdentityDkimAttributesRequest extends js.Object {
  /**
    * The email identity that you want to change the DKIM settings for.
    */
  var EmailIdentity: Identity = js.native
  /**
    * Sets the DKIM signing configuration for the identity. When you set this value true, then the messages that Amazon Pinpoint sends from the identity are DKIM-signed. When you set this value to false, then the messages that Amazon Pinpoint sends from the identity aren't DKIM-signed.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.native
}

object PutEmailIdentityDkimAttributesRequest {
  @scala.inline
  def apply(EmailIdentity: Identity, SigningEnabled: js.UndefOr[Boolean] = js.undefined): PutEmailIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    if (!js.isUndefined(SigningEnabled)) __obj.updateDynamic("SigningEnabled")(SigningEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityDkimAttributesRequest]
  }
}

