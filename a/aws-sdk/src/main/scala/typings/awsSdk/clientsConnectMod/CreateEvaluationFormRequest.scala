package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEvaluationFormRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * The description of the evaluation form.
    */
  var Description: js.UndefOr[EvaluationFormDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
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
object CreateEvaluationFormRequest {
  
  inline def apply(InstanceId: InstanceId, Items: EvaluationFormItemsList, Title: EvaluationFormTitle): CreateEvaluationFormRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEvaluationFormRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEvaluationFormRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: EvaluationFormDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setItems(value: EvaluationFormItemsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: EvaluationFormItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setScoringStrategy(value: EvaluationFormScoringStrategy): Self = StObject.set(x, "ScoringStrategy", value.asInstanceOf[js.Any])
    
    inline def setScoringStrategyUndefined: Self = StObject.set(x, "ScoringStrategy", js.undefined)
    
    inline def setTitle(value: EvaluationFormTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
