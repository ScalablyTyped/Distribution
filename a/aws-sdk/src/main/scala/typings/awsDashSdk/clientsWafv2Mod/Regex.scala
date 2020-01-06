package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Regex extends js.Object {
  /**
    * The string representing the regular expression.
    */
  var RegexString: js.UndefOr[RegexPatternString] = js.native
}

object Regex {
  @scala.inline
  def apply(RegexString: RegexPatternString = null): Regex = {
    val __obj = js.Dynamic.literal()
    if (RegexString != null) __obj.updateDynamic("RegexString")(RegexString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
}

