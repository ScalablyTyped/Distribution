package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateFeatureResponse extends StObject {
  
  /**
    * If this user was assigned to a launch or experiment, this field lists the launch or experiment name.
    */
  var details: js.UndefOr[JsonValue] = js.undefined
  
  /**
    * Specifies the reason that the user session was assigned this variation. Possible values include DEFAULT, meaning the user was served the default variation; LAUNCH_RULE_MATCH, if the user session was enrolled in a launch; EXPERIMENT_RULE_MATCH, if the user session was enrolled in an experiment; or ENTITY_OVERRIDES_MATCH, if the user's entityId matches an override rule.
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
object EvaluateFeatureResponse {
  
  inline def apply(): EvaluateFeatureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluateFeatureResponse]
  }
  
  extension [Self <: EvaluateFeatureResponse](x: Self) {
    
    inline def setDetails(value: JsonValue): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setValue(value: VariableValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
