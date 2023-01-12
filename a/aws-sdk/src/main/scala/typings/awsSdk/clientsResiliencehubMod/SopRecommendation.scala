package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SopRecommendation extends StObject {
  
  /**
    * The application component name.
    */
  var appComponentName: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The description of the SOP recommendation.
    */
  var description: js.UndefOr[String500] = js.undefined
  
  /**
    * The recommendation items.
    */
  var items: js.UndefOr[RecommendationItemList] = js.undefined
  
  /**
    * The name of the SOP recommendation.
    */
  var name: js.UndefOr[DocumentName] = js.undefined
  
  /**
    * The prerequisite for the SOP recommendation.
    */
  var prerequisite: js.UndefOr[String500] = js.undefined
  
  /**
    * Identifier for the SOP recommendation.
    */
  var recommendationId: Uuid
  
  /**
    * The reference identifier for the SOP recommendation.
    */
  var referenceId: SpecReferenceId
  
  /**
    * The service type.
    */
  var serviceType: SopServiceType
}
object SopRecommendation {
  
  inline def apply(recommendationId: Uuid, referenceId: SpecReferenceId, serviceType: SopServiceType): SopRecommendation = {
    val __obj = js.Dynamic.literal(recommendationId = recommendationId.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SopRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SopRecommendation] (val x: Self) extends AnyVal {
    
    inline def setAppComponentName(value: EntityId): Self = StObject.set(x, "appComponentName", value.asInstanceOf[js.Any])
    
    inline def setAppComponentNameUndefined: Self = StObject.set(x, "appComponentName", js.undefined)
    
    inline def setDescription(value: String500): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setItems(value: RecommendationItemList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RecommendationItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrerequisite(value: String500): Self = StObject.set(x, "prerequisite", value.asInstanceOf[js.Any])
    
    inline def setPrerequisiteUndefined: Self = StObject.set(x, "prerequisite", js.undefined)
    
    inline def setRecommendationId(value: Uuid): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
    
    inline def setReferenceId(value: SpecReferenceId): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    inline def setServiceType(value: SopServiceType): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
  }
}
