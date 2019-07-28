package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var algorithmArn: js.UndefOr[Arn] = js.undefined
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var algorithmImage: js.UndefOr[AlgorithmImage] = js.undefined
  /**
    * The date and time (in Unix time) that the algorithm was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  var defaultHyperParameterRanges: js.UndefOr[DefaultHyperParameterRanges] = js.undefined
  /**
    * Specifies the default hyperparameters.
    */
  var defaultHyperParameters: js.UndefOr[HyperParameters] = js.undefined
  /**
    * Specifies the default maximum number of training jobs and parallel training jobs.
    */
  var defaultResourceConfig: js.UndefOr[ResourceConfig] = js.undefined
  /**
    * The date and time (in Unix time) that the algorithm was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the algorithm.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the role.
    */
  var roleArn: js.UndefOr[Arn] = js.undefined
  /**
    * The training input mode.
    */
  var trainingInputMode: js.UndefOr[TrainingInputMode] = js.undefined
}

object Algorithm {
  @scala.inline
  def apply(
    algorithmArn: Arn = null,
    algorithmImage: AlgorithmImage = null,
    creationDateTime: _Date = null,
    defaultHyperParameterRanges: DefaultHyperParameterRanges = null,
    defaultHyperParameters: HyperParameters = null,
    defaultResourceConfig: ResourceConfig = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    roleArn: Arn = null,
    trainingInputMode: TrainingInputMode = null
  ): Algorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithmArn != null) __obj.updateDynamic("algorithmArn")(algorithmArn)
    if (algorithmImage != null) __obj.updateDynamic("algorithmImage")(algorithmImage)
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (defaultHyperParameterRanges != null) __obj.updateDynamic("defaultHyperParameterRanges")(defaultHyperParameterRanges)
    if (defaultHyperParameters != null) __obj.updateDynamic("defaultHyperParameters")(defaultHyperParameters)
    if (defaultResourceConfig != null) __obj.updateDynamic("defaultResourceConfig")(defaultResourceConfig)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (trainingInputMode != null) __obj.updateDynamic("trainingInputMode")(trainingInputMode)
    __obj.asInstanceOf[Algorithm]
  }
}

