package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a rule that can be applies to a number of objects.
  *
  * A rule consists of a sequence of RuleTerms describing the objects to which the rule should be applied, the {@link RuleAction} which should be used on
  * the matching objects, and a parameter.
  */
@js.native
trait Rule extends js.Object {
  
  /**
    * the action to perform on the matching objects.
    *
    * The value can be one of the {@link RuleAction} constants.
    */
  var Action: Double = js.native
  
  /**
    * Some RuleActions require a parameter.
    *
    * {{table here, see documentation}}
    */
  var Parameter: String = js.native
  
  /** the rule terms describing the objects to which the rule should be applied. */
  var Terms: SafeArray[RuleTerm] = js.native
}
object Rule {
  
  @scala.inline
  def apply(Action: Double, Parameter: String, Terms: SafeArray[RuleTerm]): Rule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Parameter = Parameter.asInstanceOf[js.Any], Terms = Terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Double): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: String): Self = this.set("Parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerms(value: SafeArray[RuleTerm]): Self = this.set("Terms", value.asInstanceOf[js.Any])
  }
}
