package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateFeatureRequest extends StObject {
  
  /**
    * An internal ID that represents a unique user of the application. This entityID is checked against any override rules assigned for this feature.
    */
  var entityId: EntityId
  
  /**
    * A JSON object of attributes that you can optionally pass in as part of the evaluation event sent to Evidently from the user session. Evidently can use this value to match user sessions with defined audience segments. For more information, see Use segments to focus your audience.  &lt;p&gt;If you include this parameter, the value must be a JSON object. A JSON array is not supported.&lt;/p&gt; 
    */
  var evaluationContext: js.UndefOr[JsonValue] = js.undefined
  
  /**
    * The name of the feature being evaluated.
    */
  var feature: FeatureName
  
  /**
    * The name or ARN of the project that contains this feature.
    */
  var project: ProjectRef
}
object EvaluateFeatureRequest {
  
  inline def apply(entityId: EntityId, feature: FeatureName, project: ProjectRef): EvaluateFeatureRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateFeatureRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluateFeatureRequest] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContext(value: JsonValue): Self = StObject.set(x, "evaluationContext", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContextUndefined: Self = StObject.set(x, "evaluationContext", js.undefined)
    
    inline def setFeature(value: FeatureName): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
