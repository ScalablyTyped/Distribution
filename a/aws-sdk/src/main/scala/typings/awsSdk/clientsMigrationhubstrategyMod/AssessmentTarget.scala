package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentTarget extends StObject {
  
  /**
    * Condition of an assessment.
    */
  var condition: Condition
  
  /**
    * Name of an assessment.
    */
  var name: String
  
  /**
    * Values of an assessment.
    */
  var values: AssessmentTargetValues
}
object AssessmentTarget {
  
  inline def apply(condition: Condition, name: String, values: AssessmentTargetValues): AssessmentTarget = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssessmentTarget] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: AssessmentTargetValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
