package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleSelectQuestionRuleCategoryAutomation extends StObject {
  
  /**
    *  The category name, as defined in Rules.
    */
  var Category: SingleSelectQuestionRuleCategoryAutomationLabel
  
  /**
    * The condition to apply for the automation option. If the condition is PRESENT, then the option is applied when the contact data includes the category. Similarly, if the condition is NOT_PRESENT, then the option is applied when the contact data does not include the category.
    */
  var Condition: SingleSelectQuestionRuleCategoryAutomationCondition
  
  /**
    * The identifier of the answer option.
    */
  var OptionRefId: ReferenceId
}
object SingleSelectQuestionRuleCategoryAutomation {
  
  inline def apply(
    Category: SingleSelectQuestionRuleCategoryAutomationLabel,
    Condition: SingleSelectQuestionRuleCategoryAutomationCondition,
    OptionRefId: ReferenceId
  ): SingleSelectQuestionRuleCategoryAutomation = {
    val __obj = js.Dynamic.literal(Category = Category.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], OptionRefId = OptionRefId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleSelectQuestionRuleCategoryAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleSelectQuestionRuleCategoryAutomation] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: SingleSelectQuestionRuleCategoryAutomationLabel): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: SingleSelectQuestionRuleCategoryAutomationCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setOptionRefId(value: ReferenceId): Self = StObject.set(x, "OptionRefId", value.asInstanceOf[js.Any])
  }
}
