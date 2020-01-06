package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityInfo extends js.Object {
  /**
    * The address or domain of the identity.
    */
  var IdentityName: js.UndefOr[Identity] = js.native
  /**
    * The email identity type. The identity type can be one of the following:    EMAIL_ADDRESS – The identity is an email address.    DOMAIN – The identity is a domain.    MANAGED_DOMAIN – The identity is a domain that is managed by AWS.  
    */
  var IdentityType: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.IdentityType] = js.native
  /**
    * Indicates whether or not you can send email from the identity. In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can send email from an identity, you have to demostrate that you own the identity, and that you authorize Amazon Pinpoint to send email from that identity.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}

object IdentityInfo {
  @scala.inline
  def apply(
    IdentityName: Identity = null,
    IdentityType: IdentityType = null,
    SendingEnabled: js.UndefOr[Boolean] = js.undefined
  ): IdentityInfo = {
    val __obj = js.Dynamic.literal()
    if (IdentityName != null) __obj.updateDynamic("IdentityName")(IdentityName.asInstanceOf[js.Any])
    if (IdentityType != null) __obj.updateDynamic("IdentityType")(IdentityType.asInstanceOf[js.Any])
    if (!js.isUndefined(SendingEnabled)) __obj.updateDynamic("SendingEnabled")(SendingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityInfo]
  }
}

