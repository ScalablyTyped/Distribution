package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrialComponentRequest extends StObject {
  
  /**
    * The name of the component to delete.
    */
  var TrialComponentName: ExperimentEntityName
}
object DeleteTrialComponentRequest {
  
  inline def apply(TrialComponentName: ExperimentEntityName): DeleteTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrialComponentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTrialComponentRequest] (val x: Self) extends AnyVal {
    
    inline def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
  }
}
