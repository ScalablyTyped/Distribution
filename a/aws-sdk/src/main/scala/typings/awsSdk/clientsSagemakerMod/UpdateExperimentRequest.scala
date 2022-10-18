package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExperimentRequest extends StObject {
  
  /**
    * The description of the experiment.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.undefined
  
  /**
    * The name of the experiment as displayed. The name doesn't need to be unique. If DisplayName isn't specified, ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The name of the experiment to update.
    */
  var ExperimentName: ExperimentEntityName
}
object UpdateExperimentRequest {
  
  inline def apply(ExperimentName: ExperimentEntityName): UpdateExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExperimentRequest]
  }
  
  extension [Self <: UpdateExperimentRequest](x: Self) {
    
    inline def setDescription(value: ExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
  }
}
