package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTrialComponentRequest extends StObject {
  
  /**
    * The name of the component to disassociate from the trial.
    */
  var TrialComponentName: ExperimentEntityName
  
  /**
    * The name of the trial to disassociate from.
    */
  var TrialName: ExperimentEntityName
}
object DisassociateTrialComponentRequest {
  
  inline def apply(TrialComponentName: ExperimentEntityName, TrialName: ExperimentEntityName): DisassociateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTrialComponentRequest]
  }
  
  extension [Self <: DisassociateTrialComponentRequest](x: Self) {
    
    inline def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
    
    inline def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
