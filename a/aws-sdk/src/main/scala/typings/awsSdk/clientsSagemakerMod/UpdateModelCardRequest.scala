package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelCardRequest extends StObject {
  
  /**
    * The updated model card content. Content must be in model card JSON schema and provided as a string. When updating model card content, be sure to include the full content and not just updated content.
    */
  var Content: js.UndefOr[ModelCardContent] = js.undefined
  
  /**
    * The name of the model card to update.
    */
  var ModelCardName: EntityName
  
  /**
    * The approval status of the model card within your organization. Different organizations might have different criteria for model card review and approval.    Draft: The model card is a work in progress.    PendingReview: The model card is pending review.    Approved: The model card is approved.    Archived: The model card is archived. No more updates should be made to the model card, but it can still be exported.  
    */
  var ModelCardStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelCardStatus] = js.undefined
}
object UpdateModelCardRequest {
  
  inline def apply(ModelCardName: EntityName): UpdateModelCardRequest = {
    val __obj = js.Dynamic.literal(ModelCardName = ModelCardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelCardRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateModelCardRequest] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ModelCardContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardStatus(value: ModelCardStatus): Self = StObject.set(x, "ModelCardStatus", value.asInstanceOf[js.Any])
    
    inline def setModelCardStatusUndefined: Self = StObject.set(x, "ModelCardStatus", js.undefined)
  }
}
