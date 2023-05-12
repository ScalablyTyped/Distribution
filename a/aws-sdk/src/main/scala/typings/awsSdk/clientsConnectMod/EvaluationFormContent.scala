package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormContent extends StObject {
  
  /**
    * The description of the evaluation form.
    */
  var Description: js.UndefOr[EvaluationFormDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the evaluation form resource.
    */
  var EvaluationFormArn: ARN
  
  /**
    * The unique identifier for the evaluation form.
    */
  var EvaluationFormId: ResourceId
  
  /**
    * A version of the evaluation form.
    */
  var EvaluationFormVersion: VersionNumber
  
  /**
    * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each. Questions must be contained in a section.
    */
  var Items: EvaluationFormItemsList
  
  /**
    * A scoring strategy of the evaluation form.
    */
  var ScoringStrategy: js.UndefOr[EvaluationFormScoringStrategy] = js.undefined
  
  /**
    * A title of the evaluation form.
    */
  var Title: EvaluationFormTitle
}
object EvaluationFormContent {
  
  inline def apply(
    EvaluationFormArn: ARN,
    EvaluationFormId: ResourceId,
    EvaluationFormVersion: VersionNumber,
    Items: EvaluationFormItemsList,
    Title: EvaluationFormTitle
  ): EvaluationFormContent = {
    val __obj = js.Dynamic.literal(EvaluationFormArn = EvaluationFormArn.asInstanceOf[js.Any], EvaluationFormId = EvaluationFormId.asInstanceOf[js.Any], EvaluationFormVersion = EvaluationFormVersion.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormContent] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: EvaluationFormDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEvaluationFormArn(value: ARN): Self = StObject.set(x, "EvaluationFormArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormId(value: ResourceId): Self = StObject.set(x, "EvaluationFormId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormVersion(value: VersionNumber): Self = StObject.set(x, "EvaluationFormVersion", value.asInstanceOf[js.Any])
    
    inline def setItems(value: EvaluationFormItemsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: EvaluationFormItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setScoringStrategy(value: EvaluationFormScoringStrategy): Self = StObject.set(x, "ScoringStrategy", value.asInstanceOf[js.Any])
    
    inline def setScoringStrategyUndefined: Self = StObject.set(x, "ScoringStrategy", js.undefined)
    
    inline def setTitle(value: EvaluationFormTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
