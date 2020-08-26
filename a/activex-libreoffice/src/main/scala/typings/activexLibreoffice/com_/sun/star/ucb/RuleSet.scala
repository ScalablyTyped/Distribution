package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a set of Rules.
  *
  * A {@link RuleSet} is applied to a folder. It consists of a sequence of rules. Each rule consists of a sequence of RuleTerms describing the objects to
  * which the rule should by applied and the {@link RuleAction} which should be performed on the matching objects.
  */
@js.native
trait RuleSet extends js.Object {
  /** is a flag indicating whether the rules apply to folders, too. */
  var HandleFolder: Boolean = js.native
  /** contains a number of rules. */
  var Rules: SafeArray[Rule] = js.native
}

object RuleSet {
  @scala.inline
  def apply(HandleFolder: Boolean, Rules: SafeArray[Rule]): RuleSet = {
    val __obj = js.Dynamic.literal(HandleFolder = HandleFolder.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSet]
  }
  @scala.inline
  implicit class RuleSetOps[Self <: RuleSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandleFolder(value: Boolean): Self = this.set("HandleFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setRules(value: SafeArray[Rule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
  
}

