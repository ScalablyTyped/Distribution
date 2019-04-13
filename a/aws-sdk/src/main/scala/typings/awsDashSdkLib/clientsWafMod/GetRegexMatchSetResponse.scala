package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegexMatchSetResponse extends js.Object {
  /**
    * Information about the RegexMatchSet that you specified in the GetRegexMatchSet request. For more information, see RegexMatchTuple.
    */
  var RegexMatchSet: js.UndefOr[RegexMatchSet] = js.undefined
}

object GetRegexMatchSetResponse {
  @scala.inline
  def apply(RegexMatchSet: RegexMatchSet = null): GetRegexMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (RegexMatchSet != null) __obj.updateDynamic("RegexMatchSet")(RegexMatchSet)
    __obj.asInstanceOf[GetRegexMatchSetResponse]
  }
}

