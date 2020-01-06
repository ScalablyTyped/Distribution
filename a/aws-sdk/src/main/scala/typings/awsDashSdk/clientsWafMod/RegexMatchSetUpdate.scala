package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexMatchSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete a RegexMatchTuple.
    */
  var Action: ChangeAction = js.native
  /**
    * Information about the part of a web request that you want AWS WAF to inspect and the identifier of the regular expression (regex) pattern that you want AWS WAF to search for. If you specify DELETE for the value of Action, the RegexMatchTuple values must exactly match the values in the RegexMatchTuple that you want to delete from the RegexMatchSet.
    */
  var RegexMatchTuple: typings.awsDashSdk.clientsWafMod.RegexMatchTuple = js.native
}

object RegexMatchSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, RegexMatchTuple: RegexMatchTuple): RegexMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], RegexMatchTuple = RegexMatchTuple.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegexMatchSetUpdate]
  }
}

