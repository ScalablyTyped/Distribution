package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLJobConfig extends StObject {
  
  /**
    * The configuration for generating a candidate for an AutoML job (optional). 
    */
  var CandidateGenerationConfig: js.UndefOr[AutoMLCandidateGenerationConfig] = js.undefined
  
  /**
    * How long an AutoML job is allowed to run, or how many candidates a job is allowed to generate.
    */
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.undefined
  
  /**
    * The configuration for splitting the input training dataset. Type: AutoMLDataSplitConfig
    */
  var DataSplitConfig: js.UndefOr[AutoMLDataSplitConfig] = js.undefined
  
  /**
    * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot choose for you based on the dataset size by selecting AUTO. In AUTO mode, Autopilot chooses ENSEMBLING for datasets smaller than 100 MB, and HYPERPARAMETER_TUNING for larger ones. The ENSEMBLING mode uses a multi-stack ensemble model to predict classification and regression tasks directly from your dataset. This machine learning mode combines several base models to produce an optimal predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A multi-stack ensemble model can provide better performance over a single model by combining the predictive capabilities of multiple models. See Autopilot algorithm support for a list of algorithms supported by ENSEMBLING mode. The HYPERPARAMETER_TUNING (HPO) mode uses the best hyperparameters to train the best version of a model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO finds the best hyperparameters according to your objective metric. See Autopilot algorithm support for a list of algorithms supported by HYPERPARAMETER_TUNING mode.
    */
  var Mode: js.UndefOr[AutoMLMode] = js.undefined
  
  /**
    * The security configuration for traffic encryption or Amazon VPC settings.
    */
  var SecurityConfig: js.UndefOr[AutoMLSecurityConfig] = js.undefined
}
object AutoMLJobConfig {
  
  inline def apply(): AutoMLJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLJobConfig] (val x: Self) extends AnyVal {
    
    inline def setCandidateGenerationConfig(value: AutoMLCandidateGenerationConfig): Self = StObject.set(x, "CandidateGenerationConfig", value.asInstanceOf[js.Any])
    
    inline def setCandidateGenerationConfigUndefined: Self = StObject.set(x, "CandidateGenerationConfig", js.undefined)
    
    inline def setCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = StObject.set(x, "CompletionCriteria", value.asInstanceOf[js.Any])
    
    inline def setCompletionCriteriaUndefined: Self = StObject.set(x, "CompletionCriteria", js.undefined)
    
    inline def setDataSplitConfig(value: AutoMLDataSplitConfig): Self = StObject.set(x, "DataSplitConfig", value.asInstanceOf[js.Any])
    
    inline def setDataSplitConfigUndefined: Self = StObject.set(x, "DataSplitConfig", js.undefined)
    
    inline def setMode(value: AutoMLMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setSecurityConfig(value: AutoMLSecurityConfig): Self = StObject.set(x, "SecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigUndefined: Self = StObject.set(x, "SecurityConfig", js.undefined)
  }
}
