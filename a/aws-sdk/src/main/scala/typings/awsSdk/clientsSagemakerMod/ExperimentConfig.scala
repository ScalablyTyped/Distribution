package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentConfig extends StObject {
  
  /**
    * The name of an existing experiment to associate with the trial component.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The name of the experiment run to associate with the trial component.
    */
  var RunName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The display name for the trial component. If this key isn't specified, the display name is the trial component name.
    */
  var TrialComponentDisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The name of an existing trial to associate the trial component with. If not specified, a new trial is created.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
}
object ExperimentConfig {
  
  inline def apply(): ExperimentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentConfig] (val x: Self) extends AnyVal {
    
    inline def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    inline def setExperimentNameUndefined: Self = StObject.set(x, "ExperimentName", js.undefined)
    
    inline def setRunName(value: ExperimentEntityName): Self = StObject.set(x, "RunName", value.asInstanceOf[js.Any])
    
    inline def setRunNameUndefined: Self = StObject.set(x, "RunName", js.undefined)
    
    inline def setTrialComponentDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentDisplayNameUndefined: Self = StObject.set(x, "TrialComponentDisplayName", js.undefined)
    
    inline def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
    
    inline def setTrialNameUndefined: Self = StObject.set(x, "TrialName", js.undefined)
  }
}
