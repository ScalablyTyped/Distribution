package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionConfig extends js.Object {
  /**
    * Lists the hyperparameter names and ranges.
    */
  var algorithmHyperParameters: js.UndefOr[HyperParameters] = js.native
  /**
    * The AutoMLConfig object containing a list of recipes to search when AutoML is performed.
    */
  var autoMLConfig: js.UndefOr[AutoMLConfig] = js.native
  /**
    * Only events with a value greater than or equal to this threshold are used for training a model.
    */
  var eventValueThreshold: js.UndefOr[EventValueThreshold] = js.native
  /**
    * Lists the feature transformation parameters.
    */
  var featureTransformationParameters: js.UndefOr[FeatureTransformationParameters] = js.native
  /**
    * Describes the properties for hyperparameter optimization (HPO).
    */
  var hpoConfig: js.UndefOr[HPOConfig] = js.native
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
    if (algorithmHyperParameters != null) __obj.updateDynamic("algorithmHyperParameters")(algorithmHyperParameters.asInstanceOf[js.Any])
    if (autoMLConfig != null) __obj.updateDynamic("autoMLConfig")(autoMLConfig.asInstanceOf[js.Any])
    if (eventValueThreshold != null) __obj.updateDynamic("eventValueThreshold")(eventValueThreshold.asInstanceOf[js.Any])
    if (featureTransformationParameters != null) __obj.updateDynamic("featureTransformationParameters")(featureTransformationParameters.asInstanceOf[js.Any])
    if (hpoConfig != null) __obj.updateDynamic("hpoConfig")(hpoConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionConfig]
  }
}

