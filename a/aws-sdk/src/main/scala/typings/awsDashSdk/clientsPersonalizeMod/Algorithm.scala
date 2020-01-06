package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var algorithmArn: js.UndefOr[Arn] = js.native
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var algorithmImage: js.UndefOr[AlgorithmImage] = js.native
  /**
    * The date and time (in Unix time) that the algorithm was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.native
  /**
    * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  var defaultHyperParameterRanges: js.UndefOr[DefaultHyperParameterRanges] = js.native
  /**
    * Specifies the default hyperparameters.
    */
  var defaultHyperParameters: js.UndefOr[HyperParameters] = js.native
  /**
    * Specifies the default maximum number of training jobs and parallel training jobs.
    */
  var defaultResourceConfig: js.UndefOr[ResourceConfig] = js.native
  /**
    * The date and time (in Unix time) that the algorithm was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.native
  /**
    * The name of the algorithm.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role.
    */
  var roleArn: js.UndefOr[Arn] = js.native
  /**
    * The training input mode.
    */
  var trainingInputMode: js.UndefOr[TrainingInputMode] = js.native
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
    if (algorithmArn != null) __obj.updateDynamic("algorithmArn")(algorithmArn.asInstanceOf[js.Any])
    if (algorithmImage != null) __obj.updateDynamic("algorithmImage")(algorithmImage.asInstanceOf[js.Any])
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (defaultHyperParameterRanges != null) __obj.updateDynamic("defaultHyperParameterRanges")(defaultHyperParameterRanges.asInstanceOf[js.Any])
    if (defaultHyperParameters != null) __obj.updateDynamic("defaultHyperParameters")(defaultHyperParameters.asInstanceOf[js.Any])
    if (defaultResourceConfig != null) __obj.updateDynamic("defaultResourceConfig")(defaultResourceConfig.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (trainingInputMode != null) __obj.updateDynamic("trainingInputMode")(trainingInputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
}

