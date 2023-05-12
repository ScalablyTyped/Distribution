package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityRuleResult extends StObject {
  
  /**
    * A description of the data quality rule.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * An evaluation message.
    */
  var EvaluationMessage: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The name of the data quality rule.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * A pass or fail status for the rule.
    */
  var Result: js.UndefOr[DataQualityRuleResultStatus] = js.undefined
}
object DataQualityRuleResult {
  
  inline def apply(): DataQualityRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityRuleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityRuleResult] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEvaluationMessage(value: DescriptionString): Self = StObject.set(x, "EvaluationMessage", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMessageUndefined: Self = StObject.set(x, "EvaluationMessage", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResult(value: DataQualityRuleResultStatus): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
