package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationRule extends StObject {
  
  /**
    * The name of the experiment or launch.
    */
  var name: js.UndefOr[RuleName] = js.undefined
  
  /**
    * This value is aws.evidently.splits if this is an evaluation rule for a launch, and it is aws.evidently.onlineab if this is an evaluation rule for an experiment.
    */
  var `type`: RuleType
}
object EvaluationRule {
  
  inline def apply(`type`: RuleType): EvaluationRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationRule] (val x: Self) extends AnyVal {
    
    inline def setName(value: RuleName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
