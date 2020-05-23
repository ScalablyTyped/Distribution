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
trait RuleSet extends js.Object {
  /** is a flag indicating whether the rules apply to folders, too. */
  var HandleFolder: Boolean
  /** contains a number of rules. */
  var Rules: SafeArray[Rule]
}

object RuleSet {
  @scala.inline
  def apply(HandleFolder: Boolean, Rules: SafeArray[Rule]): RuleSet = {
    val __obj = js.Dynamic.literal(HandleFolder = HandleFolder.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSet]
  }
}

