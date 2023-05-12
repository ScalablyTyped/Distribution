package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmRecommendation extends StObject {
  
  /**
    * The Application Component for the CloudWatch alarm recommendation.
    */
  var appComponentName: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The description of the recommendation.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The list of CloudWatch alarm recommendations.
    */
  var items: js.UndefOr[RecommendationItemList] = js.undefined
  
  /**
    * The name of the alarm recommendation.
    */
  var name: String500
  
  /**
    * The prerequisite for the alarm recommendation.
    */
  var prerequisite: js.UndefOr[String500] = js.undefined
  
  /**
    * The identifier of the alarm recommendation.
    */
  var recommendationId: Uuid
  
  /**
    * The reference identifier of the alarm recommendation.
    */
  var referenceId: SpecReferenceId
  
  /**
    * The type of alarm recommendation.
    */
  var `type`: AlarmType
}
object AlarmRecommendation {
  
  inline def apply(name: String500, recommendationId: Uuid, referenceId: SpecReferenceId, `type`: AlarmType): AlarmRecommendation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], recommendationId = recommendationId.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlarmRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlarmRecommendation] (val x: Self) extends AnyVal {
    
    inline def setAppComponentName(value: EntityId): Self = StObject.set(x, "appComponentName", value.asInstanceOf[js.Any])
    
    inline def setAppComponentNameUndefined: Self = StObject.set(x, "appComponentName", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setItems(value: RecommendationItemList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RecommendationItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String500): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrerequisite(value: String500): Self = StObject.set(x, "prerequisite", value.asInstanceOf[js.Any])
    
    inline def setPrerequisiteUndefined: Self = StObject.set(x, "prerequisite", js.undefined)
    
    inline def setRecommendationId(value: Uuid): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
    
    inline def setReferenceId(value: SpecReferenceId): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: AlarmType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
