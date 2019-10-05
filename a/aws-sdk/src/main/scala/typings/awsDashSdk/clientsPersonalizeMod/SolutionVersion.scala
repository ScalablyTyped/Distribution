package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolutionVersion extends js.Object {
  /**
    * The date and time (in Unix time) that this version of the solution was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset group providing the training data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The event type (for example, 'click' or 'like') that is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.undefined
  /**
    * If training a solution version fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * When true, Amazon Personalize performs a search for the most optimal recipe according to the solution configuration. When false (the default), Amazon Personalize uses recipeArn.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.undefined
  /**
    * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.undefined
  /**
    * The ARN of the recipe used in the solution.
    */
  var recipeArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.undefined
  /**
    * Describes the configuration properties for the solution.
    */
  var solutionConfig: js.UndefOr[SolutionConfig] = js.undefined
  /**
    * The ARN of the solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the solution version. A solution version can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
  /**
    * The time used to train the model. 
    */
  var trainingHours: js.UndefOr[TrainingHours] = js.undefined
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
    trainingHours: Int | Double = null
  ): SolutionVersion = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn)
    if (eventType != null) __obj.updateDynamic("eventType")(eventType)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (!js.isUndefined(performAutoML)) __obj.updateDynamic("performAutoML")(performAutoML)
    if (!js.isUndefined(performHPO)) __obj.updateDynamic("performHPO")(performHPO)
    if (recipeArn != null) __obj.updateDynamic("recipeArn")(recipeArn)
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn)
    if (solutionConfig != null) __obj.updateDynamic("solutionConfig")(solutionConfig)
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn)
    if (status != null) __obj.updateDynamic("status")(status)
    if (trainingHours != null) __obj.updateDynamic("trainingHours")(trainingHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionVersion]
  }
}

