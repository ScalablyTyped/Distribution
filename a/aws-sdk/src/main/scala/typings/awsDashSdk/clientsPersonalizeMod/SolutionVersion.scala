package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionVersion extends js.Object {
  /**
    * The date and time (in Unix time) that this version of the solution was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group providing the training data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The event type (for example, 'click' or 'like') that is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.native
  /**
    * If training a solution version fails, the reason for the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.native
  /**
    * When true, Amazon Personalize searches for the most optimal recipe according to the solution configuration. When false (the default), Amazon Personalize uses recipeArn.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.native
  /**
    * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.native
  /**
    * The ARN of the recipe used in the solution.
    */
  var recipeArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.native
  /**
    * Describes the configuration properties for the solution.
    */
  var solutionConfig: js.UndefOr[SolutionConfig] = js.native
  /**
    * The ARN of the solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the solution version. A solution version can be in one of the following states:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The time used to train the model. You are billed for the time it takes to train a model. This field is visible only after Amazon Personalize successfully trains a model.
    */
  var trainingHours: js.UndefOr[TrainingHours] = js.native
  /**
    * The scope of training used to create the solution version. The FULL option trains the solution version based on the entirety of the input solution's training data, while the UPDATE option processes only the training data that has changed since the creation of the last solution version. Choose UPDATE when you want to start recommending items added to the dataset without retraining the model.  The UPDATE option can only be used after you've created a solution version with the FULL option and the training solution uses the native-recipe-hrnn-coldstart. 
    */
  var trainingMode: js.UndefOr[TrainingMode] = js.native
}

object SolutionVersion {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    datasetGroupArn: Arn = null,
    eventType: EventType = null,
    failureReason: FailureReason = null,
    lastUpdatedDateTime: _Date = null,
    performAutoML: js.UndefOr[scala.Boolean] = js.undefined,
    performHPO: js.UndefOr[scala.Boolean] = js.undefined,
    recipeArn: Arn = null,
    solutionArn: Arn = null,
    solutionConfig: SolutionConfig = null,
    solutionVersionArn: Arn = null,
    status: Status = null,
    trainingHours: Int | Double = null,
    trainingMode: TrainingMode = null
  ): SolutionVersion = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(performAutoML)) __obj.updateDynamic("performAutoML")(performAutoML.asInstanceOf[js.Any])
    if (!js.isUndefined(performHPO)) __obj.updateDynamic("performHPO")(performHPO.asInstanceOf[js.Any])
    if (recipeArn != null) __obj.updateDynamic("recipeArn")(recipeArn.asInstanceOf[js.Any])
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn.asInstanceOf[js.Any])
    if (solutionConfig != null) __obj.updateDynamic("solutionConfig")(solutionConfig.asInstanceOf[js.Any])
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trainingHours != null) __obj.updateDynamic("trainingHours")(trainingHours.asInstanceOf[js.Any])
    if (trainingMode != null) __obj.updateDynamic("trainingMode")(trainingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionVersion]
  }
}

