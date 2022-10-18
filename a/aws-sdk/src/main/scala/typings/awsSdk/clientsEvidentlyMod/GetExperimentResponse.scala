package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExperimentResponse extends StObject {
  
  /**
    * A structure containing the configuration details of the experiment.
    */
  var experiment: js.UndefOr[Experiment] = js.undefined
}
object GetExperimentResponse {
  
  inline def apply(): GetExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExperimentResponse]
  }
  
  extension [Self <: GetExperimentResponse](x: Self) {
    
    inline def setExperiment(value: Experiment): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setExperimentUndefined: Self = StObject.set(x, "experiment", js.undefined)
  }
}
