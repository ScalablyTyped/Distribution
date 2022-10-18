package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExperimentRequest extends StObject {
  
  /**
    * The name of the experiment to delete.
    */
  var ExperimentName: ExperimentEntityName
}
object DeleteExperimentRequest {
  
  inline def apply(ExperimentName: ExperimentEntityName): DeleteExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExperimentRequest]
  }
  
  extension [Self <: DeleteExperimentRequest](x: Self) {
    
    inline def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
  }
}
