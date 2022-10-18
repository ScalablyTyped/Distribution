package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalSpecification extends StObject {
  
  /**
    * Determines whether a conditional branch is active. When active is false, the conditions are not evaluated.
    */
  var active: BoxedBoolean
  
  /**
    * A list of conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true.
    */
  var conditionalBranches: ConditionalBranches
  
  /**
    * The conditional branch that should be followed when the conditions for other branches are not satisfied. A conditional branch is made up of a condition, a response and a next step.
    */
  var defaultBranch: DefaultConditionalBranch
}
object ConditionalSpecification {
  
  inline def apply(
    active: BoxedBoolean,
    conditionalBranches: ConditionalBranches,
    defaultBranch: DefaultConditionalBranch
  ): ConditionalSpecification = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], conditionalBranches = conditionalBranches.asInstanceOf[js.Any], defaultBranch = defaultBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalSpecification]
  }
  
  extension [Self <: ConditionalSpecification](x: Self) {
    
    inline def setActive(value: BoxedBoolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setConditionalBranches(value: ConditionalBranches): Self = StObject.set(x, "conditionalBranches", value.asInstanceOf[js.Any])
    
    inline def setConditionalBranchesVarargs(value: ConditionalBranch*): Self = StObject.set(x, "conditionalBranches", js.Array(value*))
    
    inline def setDefaultBranch(value: DefaultConditionalBranch): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
  }
}
