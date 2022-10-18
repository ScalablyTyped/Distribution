package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRecommendation extends StObject {
  
  /**
    * The application component name.
    */
  var appComponentName: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The current compliance against the resiliency policy before applying the configuration change.
    */
  var compliance: js.UndefOr[AssessmentCompliance] = js.undefined
  
  /**
    * The cost for the application.
    */
  var cost: js.UndefOr[Cost] = js.undefined
  
  /**
    * The optional description for an app.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The architecture type.
    */
  var haArchitecture: js.UndefOr[HaArchitecture] = js.undefined
  
  /**
    * The name of the recommendation configuration.
    */
  var name: EntityName
  
  /**
    * The type of optimization.
    */
  var optimizationType: ConfigRecommendationOptimizationType
  
  /**
    * The expected compliance against the resiliency policy after applying the configuration change.
    */
  var recommendationCompliance: js.UndefOr[RecommendationCompliance] = js.undefined
  
  /**
    * The reference identifier for the recommendation configuration.
    */
  var referenceId: SpecReferenceId
  
  /**
    * List of the suggested configuration changes.
    */
  var suggestedChanges: js.UndefOr[SuggestedChangesList] = js.undefined
}
object ConfigRecommendation {
  
  inline def apply(
    name: EntityName,
    optimizationType: ConfigRecommendationOptimizationType,
    referenceId: SpecReferenceId
  ): ConfigRecommendation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optimizationType = optimizationType.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigRecommendation]
  }
  
  extension [Self <: ConfigRecommendation](x: Self) {
    
    inline def setAppComponentName(value: EntityId): Self = StObject.set(x, "appComponentName", value.asInstanceOf[js.Any])
    
    inline def setAppComponentNameUndefined: Self = StObject.set(x, "appComponentName", js.undefined)
    
    inline def setCompliance(value: AssessmentCompliance): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
    
    inline def setCost(value: Cost): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHaArchitecture(value: HaArchitecture): Self = StObject.set(x, "haArchitecture", value.asInstanceOf[js.Any])
    
    inline def setHaArchitectureUndefined: Self = StObject.set(x, "haArchitecture", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptimizationType(value: ConfigRecommendationOptimizationType): Self = StObject.set(x, "optimizationType", value.asInstanceOf[js.Any])
    
    inline def setRecommendationCompliance(value: RecommendationCompliance): Self = StObject.set(x, "recommendationCompliance", value.asInstanceOf[js.Any])
    
    inline def setRecommendationComplianceUndefined: Self = StObject.set(x, "recommendationCompliance", js.undefined)
    
    inline def setReferenceId(value: SpecReferenceId): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    inline def setSuggestedChanges(value: SuggestedChangesList): Self = StObject.set(x, "suggestedChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedChangesUndefined: Self = StObject.set(x, "suggestedChanges", js.undefined)
    
    inline def setSuggestedChangesVarargs(value: EntityDescription*): Self = StObject.set(x, "suggestedChanges", js.Array(value*))
  }
}
