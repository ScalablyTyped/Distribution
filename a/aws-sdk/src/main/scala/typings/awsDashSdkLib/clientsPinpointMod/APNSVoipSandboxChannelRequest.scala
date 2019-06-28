package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSVoipSandboxChannelRequest extends js.Object {
  /**
    * The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
    */
  var BundleId: js.UndefOr[__string] = js.undefined
  /**
    * The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with the APNs sandbox environment by using an APNs certificate.
    */
  var Certificate: js.UndefOr[__string] = js.undefined
  /**
    * The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs sandbox environment for this channel, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the APNs VoIP sandbox channel is enabled for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with the APNs sandbox environment.
    */
  var PrivateKey: js.UndefOr[__string] = js.undefined
  /**
    * The identifier that's assigned to your Apple developer account team. This identifier is used for APNs tokens.
    */
  var TeamId: js.UndefOr[__string] = js.undefined
  /**
    * The authentication key to use for APNs tokens.
    */
  var TokenKey: js.UndefOr[__string] = js.undefined
  /**
    * The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate with the APNs sandbox environment by using APNs tokens.
    */
  var TokenKeyId: js.UndefOr[__string] = js.undefined
}

object APNSVoipSandboxChannelRequest {
  @scala.inline
  def apply(
    BundleId: __string = null,
    Certificate: __string = null,
    DefaultAuthenticationMethod: __string = null,
    Enabled: js.UndefOr[__boolean] = js.undefined,
    PrivateKey: __string = null,
    TeamId: __string = null,
    TokenKey: __string = null,
    TokenKeyId: __string = null
  ): APNSVoipSandboxChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (BundleId != null) __obj.updateDynamic("BundleId")(BundleId)
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    if (DefaultAuthenticationMethod != null) __obj.updateDynamic("DefaultAuthenticationMethod")(DefaultAuthenticationMethod)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (PrivateKey != null) __obj.updateDynamic("PrivateKey")(PrivateKey)
    if (TeamId != null) __obj.updateDynamic("TeamId")(TeamId)
    if (TokenKey != null) __obj.updateDynamic("TokenKey")(TokenKey)
    if (TokenKeyId != null) __obj.updateDynamic("TokenKeyId")(TokenKeyId)
    __obj.asInstanceOf[APNSVoipSandboxChannelRequest]
  }
}

