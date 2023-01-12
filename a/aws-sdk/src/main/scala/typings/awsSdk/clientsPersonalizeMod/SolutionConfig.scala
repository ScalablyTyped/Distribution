package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionConfig extends StObject {
  
  /**
    * Lists the hyperparameter names and ranges.
    */
  var algorithmHyperParameters: js.UndefOr[HyperParameters] = js.undefined
  
  /**
    * The AutoMLConfig object containing a list of recipes to search when AutoML is performed.
    */
  var autoMLConfig: js.UndefOr[AutoMLConfig] = js.undefined
  
  /**
    * Only events with a value greater than or equal to this threshold are used for training a model.
    */
  var eventValueThreshold: js.UndefOr[EventValueThreshold] = js.undefined
  
  /**
    * Lists the feature transformation parameters.
    */
  var featureTransformationParameters: js.UndefOr[FeatureTransformationParameters] = js.undefined
  
  /**
    * Describes the properties for hyperparameter optimization (HPO).
    */
  var hpoConfig: js.UndefOr[HPOConfig] = js.undefined
  
  /**
    * Describes the additional objective for the solution, such as maximizing streaming minutes or increasing revenue. For more information see Optimizing a solution.
    */
  var optimizationObjective: js.UndefOr[OptimizationObjective] = js.undefined
}
object SolutionConfig {
  
  inline def apply(): SolutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SolutionConfig] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmHyperParameters(value: HyperParameters): Self = StObject.set(x, "algorithmHyperParameters", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmHyperParametersUndefined: Self = StObject.set(x, "algorithmHyperParameters", js.undefined)
    
    inline def setAutoMLConfig(value: AutoMLConfig): Self = StObject.set(x, "autoMLConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoMLConfigUndefined: Self = StObject.set(x, "autoMLConfig", js.undefined)
    
    inline def setEventValueThreshold(value: EventValueThreshold): Self = StObject.set(x, "eventValueThreshold", value.asInstanceOf[js.Any])
    
    inline def setEventValueThresholdUndefined: Self = StObject.set(x, "eventValueThreshold", js.undefined)
    
    inline def setFeatureTransformationParameters(value: FeatureTransformationParameters): Self = StObject.set(x, "featureTransformationParameters", value.asInstanceOf[js.Any])
    
    inline def setFeatureTransformationParametersUndefined: Self = StObject.set(x, "featureTransformationParameters", js.undefined)
    
    inline def setHpoConfig(value: HPOConfig): Self = StObject.set(x, "hpoConfig", value.asInstanceOf[js.Any])
    
    inline def setHpoConfigUndefined: Self = StObject.set(x, "hpoConfig", js.undefined)
    
    inline def setOptimizationObjective(value: OptimizationObjective): Self = StObject.set(x, "optimizationObjective", value.asInstanceOf[js.Any])
    
    inline def setOptimizationObjectiveUndefined: Self = StObject.set(x, "optimizationObjective", js.undefined)
  }
}
