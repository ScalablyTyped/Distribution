package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRegexPatternSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  /**
    * A RegexPatternSet that contains no objects.
    */
  var RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined
}

object CreateRegexPatternSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, RegexPatternSet: RegexPatternSet = null): CreateRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (RegexPatternSet != null) __obj.updateDynamic("RegexPatternSet")(RegexPatternSet)
    __obj.asInstanceOf[CreateRegexPatternSetResponse]
  }
}

