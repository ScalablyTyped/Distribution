package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExperimentRequest extends StObject {
  
  /**
    * The name of the experiment that you want to see the details of.
    */
  var experiment: ExperimentName
  
  /**
    * The name or ARN of the project that contains the experiment.
    */
  var project: ProjectRef
}
object GetExperimentRequest {
  
  inline def apply(experiment: ExperimentName, project: ProjectRef): GetExperimentRequest = {
    val __obj = js.Dynamic.literal(experiment = experiment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExperimentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetExperimentRequest] (val x: Self) extends AnyVal {
    
    inline def setExperiment(value: ExperimentName): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
