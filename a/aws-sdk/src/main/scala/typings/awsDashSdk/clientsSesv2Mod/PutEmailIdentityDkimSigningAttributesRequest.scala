package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEmailIdentityDkimSigningAttributesRequest extends js.Object {
  /**
    * The email identity that you want to configure DKIM for.
    */
  var EmailIdentity: Identity = js.native
  /**
    * An object that contains information about the private key and selector that you want to use to configure DKIM for the identity. This object is only required if you want to configure Bring Your Own DKIM (BYODKIM) for the identity.
    */
  var SigningAttributes: js.UndefOr[DkimSigningAttributes] = js.native
  /**
    * The method that you want to use to configure DKIM for the identity. There are two possible values:    AWS_SES – Configure DKIM for the identity by using Easy DKIM.    EXTERNAL – Configure DKIM for the identity by using Bring Your Own DKIM (BYODKIM).  
    */
  var SigningAttributesOrigin: DkimSigningAttributesOrigin = js.native
}

object PutEmailIdentityDkimSigningAttributesRequest {
  @scala.inline
  def apply(
    EmailIdentity: Identity,
    SigningAttributesOrigin: DkimSigningAttributesOrigin,
    SigningAttributes: DkimSigningAttributes = null
  ): PutEmailIdentityDkimSigningAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any], SigningAttributesOrigin = SigningAttributesOrigin.asInstanceOf[js.Any])
    if (SigningAttributes != null) __obj.updateDynamic("SigningAttributes")(SigningAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityDkimSigningAttributesRequest]
  }
}

