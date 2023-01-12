package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationRequest extends StObject {
  
  /**
    * An internal ID that represents a unique user session of the application. This entityID is checked against any override rules assigned for this feature.
    */
  var entityId: EntityId
  
  /**
    * A JSON block of attributes that you can optionally pass in. This JSON block is included in the evaluation events sent to Evidently from the user session. 
    */
  var evaluationContext: js.UndefOr[JsonValue] = js.undefined
  
  /**
    * The name of the feature being evaluated.
    */
  var feature: FeatureName
}
object EvaluationRequest {
  
  inline def apply(entityId: EntityId, feature: FeatureName): EvaluationRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationRequest] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContext(value: JsonValue): Self = StObject.set(x, "evaluationContext", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContextUndefined: Self = StObject.set(x, "evaluationContext", js.undefined)
    
    inline def setFeature(value: FeatureName): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
