package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
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
  var Action: Double
  /**
    * Some RuleActions require a parameter.
    *
    * {{table here, see documentation}}
    */
  var Parameter: String
  /** the rule terms describing the objects to which the rule should be applied. */
  var Terms: SafeArray[RuleTerm]
}

object Rule {
  @scala.inline
  def apply(Action: Double, Parameter: String, Terms: SafeArray[RuleTerm]): Rule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Parameter = Parameter.asInstanceOf[js.Any], Terms = Terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

