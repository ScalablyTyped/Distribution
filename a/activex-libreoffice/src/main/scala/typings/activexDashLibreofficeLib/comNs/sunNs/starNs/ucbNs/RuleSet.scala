package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

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
  var HandleFolder: scala.Boolean
  /** contains a number of rules. */
  var Rules: activexDashInteropLib.SafeArray[Rule]
}

object RuleSet {
  @scala.inline
  def apply(HandleFolder: scala.Boolean, Rules: activexDashInteropLib.SafeArray[Rule]): RuleSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HandleFolder")(HandleFolder)
    __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[RuleSet]
  }
}

