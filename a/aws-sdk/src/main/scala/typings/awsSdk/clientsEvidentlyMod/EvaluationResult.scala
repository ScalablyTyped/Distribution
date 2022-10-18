package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResult extends StObject {
  
  /**
    * If this user was assigned to a launch or experiment, this field lists the launch or experiment name.
    */
  var details: js.UndefOr[JsonValue] = js.undefined
  
  /**
    * An internal ID that represents a unique user session of the application.
    */
  var entityId: EntityId
  
  /**
    * The name of the feature being evaluated.
    */
  var feature: FeatureName
  
  /**
    * The name or ARN of the project that contains the feature being evaluated.
    */
  var project: js.UndefOr[Arn] = js.undefined
  
  /**
    * Specifies the reason that the user session was assigned this variation. Possible values include DEFAULT, meaning the user was served the default variation; LAUNCH_RULE_MATCH, if the user session was enrolled in a launch; or EXPERIMENT_RULE_MATCH, if the user session was enrolled in an experiment.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The value assigned to this variation to differentiate it from the other variations of this feature.
    */
  var value: js.UndefOr[VariableValue] = js.undefined
  
  /**
    * The name of the variation that was served to the user session.
    */
  var variation: js.UndefOr[String] = js.undefined
}
object EvaluationResult {
  
  inline def apply(entityId: EntityId, feature: FeatureName): EvaluationResult = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResult]
  }
  
  extension [Self <: EvaluationResult](x: Self) {
    
    inline def setDetails(value: JsonValue): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setFeature(value: FeatureName): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setProject(value: Arn): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setValue(value: VariableValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
