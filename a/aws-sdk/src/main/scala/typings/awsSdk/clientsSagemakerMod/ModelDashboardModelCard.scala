package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDashboardModelCard extends StObject {
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * A timestamp that indicates when the model card was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * A timestamp that indicates when the model card was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for a model card.
    */
  var ModelCardArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelCardArn] = js.undefined
  
  /**
    * The name of a model card.
    */
  var ModelCardName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The model card status.
    */
  var ModelCardStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelCardStatus] = js.undefined
  
  /**
    * The model card version.
    */
  var ModelCardVersion: js.UndefOr[Integer] = js.undefined
  
  /**
    * For models created in SageMaker, this is the model ARN. For models created outside of SageMaker, this is a user-customized string.
    */
  var ModelId: js.UndefOr[String] = js.undefined
  
  /**
    * A model card's risk rating. Can be low, medium, or high.
    */
  var RiskRating: js.UndefOr[String] = js.undefined
  
  /**
    * The KMS Key ID (KMSKeyId) for encryption of model card information.
    */
  var SecurityConfig: js.UndefOr[ModelCardSecurityConfig] = js.undefined
  
  /**
    * The tags associated with a model card.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ModelDashboardModelCard {
  
  inline def apply(): ModelDashboardModelCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDashboardModelCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelDashboardModelCard] (val x: Self) extends AnyVal {
    
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
