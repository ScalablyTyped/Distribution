package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a rule that can be applies to a number of objects.
  *
  * A rule consists of a sequence of RuleTerms describing the objects to which the rule should be applied, the {@link RuleAction} which should be used on
  * the matching objects, and a parameter.
  */
trait Rule extends StObject {
  
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
  
  inline def apply(Action: Double, Parameter: String, Terms: SafeArray[RuleTerm]): Rule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Parameter = Parameter.asInstanceOf[js.Any], Terms = Terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setAction(value: Double): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: String): Self = StObject.set(x, "Parameter", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: SafeArray[RuleTerm]): Self = StObject.set(x, "Terms", value.asInstanceOf[js.Any])
  }
}
