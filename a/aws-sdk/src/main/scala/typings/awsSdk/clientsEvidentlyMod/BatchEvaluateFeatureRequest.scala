package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEvaluateFeatureRequest extends StObject {
  
  /**
    * The name or ARN of the project that contains the feature being evaluated.
    */
  var project: ProjectRef
  
  /**
    * An array of structures, where each structure assigns a feature variation to one user session.
    */
  var requests: EvaluationRequestsList
}
object BatchEvaluateFeatureRequest {
  
  inline def apply(project: ProjectRef, requests: EvaluationRequestsList): BatchEvaluateFeatureRequest = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEvaluateFeatureRequest]
  }
  
  extension [Self <: BatchEvaluateFeatureRequest](x: Self) {
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRequests(value: EvaluationRequestsList): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: EvaluationRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
