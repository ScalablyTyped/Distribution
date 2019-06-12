package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolutionConfig extends js.Object {
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
    * Describes the properties for hyperparameter optimization (HPO). For use with the bring-your-own-recipe feature. Not used with Amazon Personalize predefined recipes.
    */
  var hpoConfig: js.UndefOr[HPOConfig] = js.undefined
}

object SolutionConfig {
  @scala.inline
  def apply(
    algorithmHyperParameters: HyperParameters = null,
    autoMLConfig: AutoMLConfig = null,
    eventValueThreshold: EventValueThreshold = null,
    featureTransformationParameters: FeatureTransformationParameters = null,
    hpoConfig: HPOConfig = null
  ): SolutionConfig = {
    val __obj = js.Dynamic.literal()
    if (algorithmHyperParameters != null) __obj.updateDynamic("algorithmHyperParameters")(algorithmHyperParameters)
    if (autoMLConfig != null) __obj.updateDynamic("autoMLConfig")(autoMLConfig)
    if (eventValueThreshold != null) __obj.updateDynamic("eventValueThreshold")(eventValueThreshold)
    if (featureTransformationParameters != null) __obj.updateDynamic("featureTransformationParameters")(featureTransformationParameters)
    if (hpoConfig != null) __obj.updateDynamic("hpoConfig")(hpoConfig)
    __obj.asInstanceOf[SolutionConfig]
  }
}

