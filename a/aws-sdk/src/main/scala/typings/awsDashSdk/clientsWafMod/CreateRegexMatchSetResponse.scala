package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRegexMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRegexMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeToken] = js.undefined
  /**
    * A RegexMatchSet that contains no RegexMatchTuple objects.
    */
  var RegexMatchSet: js.UndefOr[typings.awsDashSdk.clientsWafMod.RegexMatchSet] = js.undefined
}

object CreateRegexMatchSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, RegexMatchSet: RegexMatchSet = null): CreateRegexMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (RegexMatchSet != null) __obj.updateDynamic("RegexMatchSet")(RegexMatchSet)
    __obj.asInstanceOf[CreateRegexMatchSetResponse]
  }
}

