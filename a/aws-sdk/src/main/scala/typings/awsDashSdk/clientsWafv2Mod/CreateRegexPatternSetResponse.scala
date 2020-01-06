package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegexPatternSetResponse extends js.Object {
  /**
    * High-level information about a RegexPatternSet, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a RegexPatternSet, and the ARN, that you provide to the RegexPatternSetReferenceStatement to use the pattern set in a Rule.
    */
  var Summary: js.UndefOr[RegexPatternSetSummary] = js.native
}

object CreateRegexPatternSetResponse {
  @scala.inline
  def apply(Summary: RegexPatternSetSummary = null): CreateRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    if (Summary != null) __obj.updateDynamic("Summary")(Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegexPatternSetResponse]
  }
}

