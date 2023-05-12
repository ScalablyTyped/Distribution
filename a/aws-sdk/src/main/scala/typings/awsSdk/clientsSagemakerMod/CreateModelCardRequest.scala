package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelCardRequest extends StObject {
  
  /**
    * The content of the model card. Content must be in model card JSON schema and provided as a string.
    */
  var Content: ModelCardContent
  
  /**
    * The unique name of the model card.
    */
  var ModelCardName: EntityName
  
  /**
    * The approval status of the model card within your organization. Different organizations might have different criteria for model card review and approval.    Draft: The model card is a work in progress.    PendingReview: The model card is pending review.    Approved: The model card is approved.    Archived: The model card is archived. No more updates should be made to the model card, but it can still be exported.  
    */
  var ModelCardStatus: typings.awsSdk.clientsSagemakerMod.ModelCardStatus
  
  /**
    * An optional Key Management Service key to encrypt, decrypt, and re-encrypt model card content for regulated workloads with highly sensitive data.
    */
  var SecurityConfig: js.UndefOr[ModelCardSecurityConfig] = js.undefined
  
  /**
    * Key-value pairs used to manage metadata for model cards.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateModelCardRequest {
  
  inline def apply(Content: ModelCardContent, ModelCardName: EntityName, ModelCardStatus: ModelCardStatus): CreateModelCardRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ModelCardName = ModelCardName.asInstanceOf[js.Any], ModelCardStatus = ModelCardStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelCardRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelCardRequest] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ModelCardContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardStatus(value: ModelCardStatus): Self = StObject.set(x, "ModelCardStatus", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfig(value: ModelCardSecurityConfig): Self = StObject.set(x, "SecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigUndefined: Self = StObject.set(x, "SecurityConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
