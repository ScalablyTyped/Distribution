package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateXssMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateXssMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeToken] = js.undefined
  /**
    * An XssMatchSet.
    */
  var XssMatchSet: js.UndefOr[typings.awsDashSdk.clientsWafMod.XssMatchSet] = js.undefined
}

object CreateXssMatchSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, XssMatchSet: XssMatchSet = null): CreateXssMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (XssMatchSet != null) __obj.updateDynamic("XssMatchSet")(XssMatchSet)
    __obj.asInstanceOf[CreateXssMatchSetResponse]
  }
}

