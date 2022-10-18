package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperimentResponse extends StObject {
  
  /**
    * A structure containing the configuration details of the experiment that you created.
    */
  var experiment: Experiment
}
object CreateExperimentResponse {
  
  inline def apply(experiment: Experiment): CreateExperimentResponse = {
    val __obj = js.Dynamic.literal(experiment = experiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperimentResponse]
  }
  
  extension [Self <: CreateExperimentResponse](x: Self) {
    
    inline def setExperiment(value: Experiment): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
  }
}
