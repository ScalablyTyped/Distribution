package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormSection extends StObject {
  
  /**
    * The instructions of the section.
    */
  var Instructions: js.UndefOr[EvaluationFormQuestionInstructions] = js.undefined
  
  /**
    * The items of the section.
    */
  var Items: js.UndefOr[EvaluationFormItemsList] = js.undefined
  
  /**
    * The identifier of the section. An identifier must be unique within the evaluation form.
    */
  var RefId: ReferenceId
  
  /**
    * The title of the section.
    */
  var Title: EvaluationFormSectionTitle
  
  /**
    * The scoring weight of the section.
    */
  var Weight: js.UndefOr[EvaluationFormItemWeight] = js.undefined
}
object EvaluationFormSection {
  
  inline def apply(RefId: ReferenceId, Title: EvaluationFormSectionTitle): EvaluationFormSection = {
    val __obj = js.Dynamic.literal(RefId = RefId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormSection] (val x: Self) extends AnyVal {
    
    inline def setInstructions(value: EvaluationFormQuestionInstructions): Self = StObject.set(x, "Instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "Instructions", js.undefined)
    
    inline def setItems(value: EvaluationFormItemsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: EvaluationFormItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setRefId(value: ReferenceId): Self = StObject.set(x, "RefId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: EvaluationFormSectionTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: EvaluationFormItemWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
