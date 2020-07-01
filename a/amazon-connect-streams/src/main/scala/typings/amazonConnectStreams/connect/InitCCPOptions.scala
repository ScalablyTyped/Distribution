package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitCCPOptions extends js.Object {
  /**
    * The URL of the CCP.
    * This is the page you would normally navigate to in order to use the CCP in a standalone page, it is different for each instance.
    */
  val ccpUrl: String
  /**
    * Set to `false` to disable the login popup which is shown when the user's authentication expires.
    * @default true
    */
  val loginPopup: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to `true` in conjunction with the `loginPopup` parameter to automatically close the login Popup window once the authentication step has completed.
    * If the login page opened in a new tab, this parameter will also auto-close that tab.
    * @default false
    */
  val loginPopupAutoClose: js.UndefOr[Boolean] = js.undefined
  /** Allows custom URL to be used to initiate the ccp, as in the case of SAML authentication. */
  val loginUrl: js.UndefOr[String] = js.undefined
  /**
    * Amazon connect instance region. Only required for chat channel.
    * @example "us-west-2"
    */
  val region: js.UndefOr[String] = js.undefined
  /** Allows you to specify some settings surrounding the softphone feature of Connect. */
  val softphone: js.UndefOr[SoftPhoneOptions] = js.undefined
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

