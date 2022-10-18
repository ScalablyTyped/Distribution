package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExperimentResponse extends StObject {
  
  /**
    * A structure containing the configuration details of the experiment that was updated.
    */
  var experiment: Experiment
}
object UpdateExperimentResponse {
  
  inline def apply(experiment: Experiment): UpdateExperimentResponse = {
    val __obj = js.Dynamic.literal(experiment = experiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExperimentResponse]
  }
  
  extension [Self <: UpdateExperimentResponse](x: Self) {
    
    inline def setExperiment(value: Experiment): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
  }
}
