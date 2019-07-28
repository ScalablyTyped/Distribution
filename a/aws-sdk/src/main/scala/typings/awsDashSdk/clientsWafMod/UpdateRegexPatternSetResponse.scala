package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRegexPatternSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the UpdateRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeToken] = js.undefined
}

object UpdateRegexPatternSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): UpdateRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    __obj.asInstanceOf[UpdateRegexPatternSetResponse]
  }
}

