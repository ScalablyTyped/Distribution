package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRecommendation extends StObject {
  
  /**
    * The name of the Application Component.
    */
  var appComponentName: EntityId
  
  /**
    * The list of recommendations.
    */
  var configRecommendations: ConfigRecommendationList
  
  /**
    * The recommendation status.
    */
  var recommendationStatus: RecommendationComplianceStatus
}
object ComponentRecommendation {
  
  inline def apply(
    appComponentName: EntityId,
    configRecommendations: ConfigRecommendationList,
    recommendationStatus: RecommendationComplianceStatus
  ): ComponentRecommendation = {
    val __obj = js.Dynamic.literal(appComponentName = appComponentName.asInstanceOf[js.Any], configRecommendations = configRecommendations.asInstanceOf[js.Any], recommendationStatus = recommendationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentRecommendation] (val x: Self) extends AnyVal {
    
    inline def setAppComponentName(value: EntityId): Self = StObject.set(x, "appComponentName", value.asInstanceOf[js.Any])
    
    inline def setConfigRecommendations(value: ConfigRecommendationList): Self = StObject.set(x, "configRecommendations", value.asInstanceOf[js.Any])
    
    inline def setConfigRecommendationsVarargs(value: ConfigRecommendation*): Self = StObject.set(x, "configRecommendations", js.Array(value*))
    
    inline def setRecommendationStatus(value: RecommendationComplianceStatus): Self = StObject.set(x, "recommendationStatus", value.asInstanceOf[js.Any])
  }
}
