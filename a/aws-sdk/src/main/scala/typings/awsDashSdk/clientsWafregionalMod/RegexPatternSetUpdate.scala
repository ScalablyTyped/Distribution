package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete a RegexPatternString.
    */
  var Action: ChangeAction = js.native
  /**
    * Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t.
    */
  var RegexPatternString: typings.awsDashSdk.clientsWafregionalMod.RegexPatternString = js.native
}

object RegexPatternSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, RegexPatternString: RegexPatternString): RegexPatternSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], RegexPatternString = RegexPatternString.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegexPatternSetUpdate]
  }
}

