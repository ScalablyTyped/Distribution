package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSVoipSandboxChannelRequest extends js.Object {
  /**
    * The bundle id used for APNs Tokens.
    */
  var BundleId: js.UndefOr[__string] = js.undefined
  /**
    * The distribution certificate from Apple.
    */
  var Certificate: js.UndefOr[__string] = js.undefined
  /**
    * The default authentication method used for APNs.
    */
  var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * The certificate private key.
    */
  var PrivateKey: js.UndefOr[__string] = js.undefined
  /**
    * The team id used for APNs Tokens.
    */
  var TeamId: js.UndefOr[__string] = js.undefined
  /**
    * The token key used for APNs Tokens.
    */
  var TokenKey: js.UndefOr[__string] = js.undefined
  /**
    * The token key used for APNs Tokens.
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

