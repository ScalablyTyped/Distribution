package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a rule that can be applies to a number of objects.
  *
  * A rule consists of a sequence of RuleTerms describing the objects to which the rule should be applied, the {@link RuleAction} which should be used on
  * the matching objects, and a parameter.
  */
trait Rule extends js.Object {
  /**
    * the action to perform on the matching objects.
    *
    * The value can be one of the {@link RuleAction} constants.
    */
  var Action: scala.Double
  /**
    * Some RuleActions require a parameter.
    *
    * {{table here, see documentation}}
    */
  var Parameter: java.lang.String
  /** the rule terms describing the objects to which the rule should be applied. */
  var Terms: stdLib.SafeArray[RuleTerm]
}

object Rule {
  @scala.inline
  def apply(Action: scala.Double, Parameter: java.lang.String, Terms: stdLib.SafeArray[RuleTerm]): Rule = {
    val __obj = js.Dynamic.literal(Action = Action, Parameter = Parameter, Terms = Terms)
  
    __obj.asInstanceOf[Rule]
  }
}

