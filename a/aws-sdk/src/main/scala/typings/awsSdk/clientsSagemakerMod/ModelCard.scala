package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelCard extends StObject {
  
  /**
    * The content of the model card. Content uses the model card JSON schema and provided as a string.
    */
  var Content: js.UndefOr[ModelCardContent] = js.undefined
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The date and time that the model card was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The date and time that the model card was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model card.
    */
  var ModelCardArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelCardArn] = js.undefined
  
  /**
    * The unique name of the model card.
    */
  var ModelCardName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The approval status of the model card within your organization. Different organizations might have different criteria for model card review and approval.    Draft: The model card is a work in progress.    PendingReview: The model card is pending review.    Approved: The model card is approved.    Archived: The model card is archived. No more updates should be made to the model card, but it can still be exported.  
    */
  var ModelCardStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelCardStatus] = js.undefined
  
  /**
    * The version of the model card.
    */
  var ModelCardVersion: js.UndefOr[Integer] = js.undefined
  
  /**
    * The unique name (ID) of the model.
    */
  var ModelId: js.UndefOr[String] = js.undefined
  
  /**
    * The risk rating of the model. Different organizations might have different criteria for model card risk ratings. For more information, see Risk ratings.
    */
  var RiskRating: js.UndefOr[String] = js.undefined
  
  /**
    * The security configuration used to protect model card data.
    */
  var SecurityConfig: js.UndefOr[ModelCardSecurityConfig] = js.undefined
  
  /**
    * Key-value pairs used to manage metadata for the model card.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ModelCard {
  
  inline def apply(): ModelCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelCard] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ModelCardContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelCardArn(value: ModelCardArn): Self = StObject.set(x, "ModelCardArn", value.asInstanceOf[js.Any])
    
    inline def setModelCardArnUndefined: Self = StObject.set(x, "ModelCardArn", js.undefined)
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardNameUndefined: Self = StObject.set(x, "ModelCardName", js.undefined)
    
    inline def setModelCardStatus(value: ModelCardStatus): Self = StObject.set(x, "ModelCardStatus", value.asInstanceOf[js.Any])
    
    inline def setModelCardStatusUndefined: Self = StObject.set(x, "ModelCardStatus", js.undefined)
    
    inline def setModelCardVersion(value: Integer): Self = StObject.set(x, "ModelCardVersion", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersionUndefined: Self = StObject.set(x, "ModelCardVersion", js.undefined)
    
    inline def setModelId(value: String): Self = StObject.set(x, "ModelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "ModelId", js.undefined)
    
    inline def setRiskRating(value: String): Self = StObject.set(x, "RiskRating", value.asInstanceOf[js.Any])
    
    inline def setRiskRatingUndefined: Self = StObject.set(x, "RiskRating", js.undefined)
    
    inline def setSecurityConfig(value: ModelCardSecurityConfig): Self = StObject.set(x, "SecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigUndefined: Self = StObject.set(x, "SecurityConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
