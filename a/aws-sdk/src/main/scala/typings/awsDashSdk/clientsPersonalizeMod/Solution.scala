package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Solution extends js.Object {
  /**
    * When performAutoML is true, specifies the best recipe found.
    */
  var autoMLResult: js.UndefOr[AutoMLResult] = js.undefined
  /**
    * The creation date and time (in Unix time) of the solution.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The event type (for example, 'click' or 'like') that is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.undefined
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * Describes the latest version of the solution, including the status and the ARN.
    */
  var latestSolutionVersion: js.UndefOr[SolutionVersionSummary] = js.undefined
  /**
    * The name of the solution.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list specified in the solution configuration (recipeArn must not be specified). When false (the default), Amazon Personalize uses recipeArn for training.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.undefined
  /**
    * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.undefined
  /**
    * The ARN of the recipe used to create the solution.
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
    * The status of the solution. A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object Solution {
  @scala.inline
  def apply(
    autoMLResult: AutoMLResult = null,
    creationDateTime: _Date = null,
    datasetGroupArn: Arn = null,
    eventType: EventType = null,
    lastUpdatedDateTime: _Date = null,
    latestSolutionVersion: SolutionVersionSummary = null,
    name: Name = null,
    performAutoML: js.UndefOr[PerformAutoML] = js.undefined,
    performHPO: js.UndefOr[PerformHPO] = js.undefined,
    recipeArn: Arn = null,
    solutionArn: Arn = null,
    solutionConfig: SolutionConfig = null,
    status: Status = null
  ): Solution = {
    val __obj = js.Dynamic.literal()
    if (autoMLResult != null) __obj.updateDynamic("autoMLResult")(autoMLResult)
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn)
    if (eventType != null) __obj.updateDynamic("eventType")(eventType)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (latestSolutionVersion != null) __obj.updateDynamic("latestSolutionVersion")(latestSolutionVersion)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(performAutoML)) __obj.updateDynamic("performAutoML")(performAutoML)
    if (!js.isUndefined(performHPO)) __obj.updateDynamic("performHPO")(performHPO)
    if (recipeArn != null) __obj.updateDynamic("recipeArn")(recipeArn)
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn)
    if (solutionConfig != null) __obj.updateDynamic("solutionConfig")(solutionConfig)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Solution]
  }
}

