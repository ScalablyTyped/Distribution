package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitCCPOptions extends js.Object {
  /*
    * The URL for the Connect CCP.
    */
  var ccpUrl: String
  /*
    * Whether to display the login view.
    */
  var loginPopup: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to false.
    * Set to true to automatically close the loginPopup window after authentication.
    */
  var loginPopupAutoClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows custom URL to be used to initiate the ccp, as in the case of SAML authentication.
    */
  var loginUrl: js.UndefOr[String] = js.undefined
  /**
    * Amazon connect instance region
    * Only required for chat channel
    */
  var region: js.UndefOr[String] = js.undefined
  /*
    * Options specifying softphone configuration.
    */
  var softphone: js.UndefOr[SoftPhoneOptions] = js.undefined
}

object InitCCPOptions {
  @scala.inline
  def apply(
    ccpUrl: String,
    loginPopup: js.UndefOr[Boolean] = js.undefined,
    loginPopupAutoClose: js.UndefOr[Boolean] = js.undefined,
    loginUrl: String = null,
    region: String = null,
    softphone: SoftPhoneOptions = null
  ): InitCCPOptions = {
    val __obj = js.Dynamic.literal(ccpUrl = ccpUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(loginPopup)) __obj.updateDynamic("loginPopup")(loginPopup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loginPopupAutoClose)) __obj.updateDynamic("loginPopupAutoClose")(loginPopupAutoClose.get.asInstanceOf[js.Any])
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (softphone != null) __obj.updateDynamic("softphone")(softphone.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitCCPOptions]
  }
}

