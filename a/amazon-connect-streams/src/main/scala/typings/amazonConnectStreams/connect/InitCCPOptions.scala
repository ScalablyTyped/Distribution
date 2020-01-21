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
  /*
    * Options specifying softphone configuration.
    */
  var softphone: js.UndefOr[SoftPhoneOptions] = js.undefined
}

object InitCCPOptions {
  @scala.inline
  def apply(ccpUrl: String, loginPopup: js.UndefOr[Boolean] = js.undefined, softphone: SoftPhoneOptions = null): InitCCPOptions = {
    val __obj = js.Dynamic.literal(ccpUrl = ccpUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(loginPopup)) __obj.updateDynamic("loginPopup")(loginPopup.asInstanceOf[js.Any])
    if (softphone != null) __obj.updateDynamic("softphone")(softphone.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitCCPOptions]
  }
}

