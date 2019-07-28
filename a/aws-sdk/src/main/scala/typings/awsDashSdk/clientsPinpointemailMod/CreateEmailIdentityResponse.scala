package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEmailIdentityResponse extends js.Object {
  /**
    * An object that contains information about the DKIM attributes for the identity. This object includes the tokens that you use to create the CNAME records that are required to complete the DKIM verification process.
    */
  var DkimAttributes: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.DkimAttributes] = js.undefined
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.IdentityType] = js.undefined
  /**
    * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
}

object CreateEmailIdentityResponse {
  @scala.inline
  def apply(
    DkimAttributes: DkimAttributes = null,
    IdentityType: IdentityType = null,
    VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
  ): CreateEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (DkimAttributes != null) __obj.updateDynamic("DkimAttributes")(DkimAttributes)
    if (IdentityType != null) __obj.updateDynamic("IdentityType")(IdentityType.asInstanceOf[js.Any])
    if (!js.isUndefined(VerifiedForSendingStatus)) __obj.updateDynamic("VerifiedForSendingStatus")(VerifiedForSendingStatus)
    __obj.asInstanceOf[CreateEmailIdentityResponse]
  }
}

