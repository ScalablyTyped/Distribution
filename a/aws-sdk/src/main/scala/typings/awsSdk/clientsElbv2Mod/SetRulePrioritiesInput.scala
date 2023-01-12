package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRulePrioritiesInput extends StObject {
  
  /**
    * The rule priorities.
    */
  var RulePriorities: RulePriorityList
}
object SetRulePrioritiesInput {
  
  inline def apply(RulePriorities: RulePriorityList): SetRulePrioritiesInput = {
    val __obj = js.Dynamic.literal(RulePriorities = RulePriorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRulePrioritiesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetRulePrioritiesInput] (val x: Self) extends AnyVal {
    
    inline def setRulePriorities(value: RulePriorityList): Self = StObject.set(x, "RulePriorities", value.asInstanceOf[js.Any])
    
    inline def setRulePrioritiesVarargs(value: RulePriorityPair*): Self = StObject.set(x, "RulePriorities", js.Array(value*))
  }
}
