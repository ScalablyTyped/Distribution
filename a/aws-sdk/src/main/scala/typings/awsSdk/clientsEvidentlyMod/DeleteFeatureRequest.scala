package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFeatureRequest extends StObject {
  
  /**
    * The name of the feature to delete.
    */
  var feature: FeatureName
  
  /**
    * The name or ARN of the project that contains the feature to delete.
    */
  var project: ProjectRef
}
object DeleteFeatureRequest {
  
  inline def apply(feature: FeatureName, project: ProjectRef): DeleteFeatureRequest = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFeatureRequest]
  }
  
  extension [Self <: DeleteFeatureRequest](x: Self) {
    
    inline def setFeature(value: FeatureName): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
