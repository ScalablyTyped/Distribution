package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegexPatternSetResponse extends js.Object {
  /**
    * Information about the RegexPatternSet that you specified in the GetRegexPatternSet request, including the identifier of the pattern set and the regular expression patterns you want AWS WAF to search for. 
    */
  var RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined
}

object GetRegexPatternSetResponse {
  @scala.inline
  def apply(RegexPatternSet: RegexPatternSet = null): GetRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    if (RegexPatternSet != null) __obj.updateDynamic("RegexPatternSet")(RegexPatternSet)
    __obj.asInstanceOf[GetRegexPatternSetResponse]
  }
}

