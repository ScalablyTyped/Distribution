package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTrialComponentRequest extends StObject {
  
  /**
    * The name of the component to associated with the trial.
    */
  var TrialComponentName: ExperimentEntityName
  
  /**
    * The name of the trial to associate with.
    */
  var TrialName: ExperimentEntityName
}
object AssociateTrialComponentRequest {
  
  inline def apply(TrialComponentName: ExperimentEntityName, TrialName: ExperimentEntityName): AssociateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTrialComponentRequest]
  }
  
  extension [Self <: AssociateTrialComponentRequest](x: Self) {
    
    inline def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
    
    inline def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
