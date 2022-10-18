package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineExperimentConfig extends StObject {
  
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
}
object PipelineExperimentConfig {
  
  inline def apply(): PipelineExperimentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExperimentConfig]
  }
  
  extension [Self <: PipelineExperimentConfig](x: Self) {
    
    inline def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    inline def setExperimentNameUndefined: Self = StObject.set(x, "ExperimentName", js.undefined)
    
    inline def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
    
    inline def setTrialNameUndefined: Self = StObject.set(x, "TrialName", js.undefined)
  }
}
