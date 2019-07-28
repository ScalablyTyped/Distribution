package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSolutionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
    */
  var datasetGroupArn: Arn
  /**
    * When your have multiple event types (using an EVENT_TYPE schema field), this parameter specifies which event type (for example, 'click' or 'like') is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.undefined
  /**
    * The name for the solution.
    */
  var name: Name
  /**
    * Whether to perform automated machine learning (AutoML). The default is false. For this case, you must specify recipeArn. When set to true, Amazon Personalize analyzes your training data and selects the optimal USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit recipeArn. Amazon Personalize determines the optimal recipe by running tests with different values for the hyperparameters. AutoML lengthens the training process as compared to selecting a specific recipe.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.undefined
  /**
    * Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is false. When performing AutoML, this parameter is always true and you should not set it to false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.undefined
  /**
    * The ARN of the recipe to use for model training. Only specified when performAutoML is false.
    */
  var recipeArn: js.UndefOr[Arn] = js.undefined
  /**
    * The configuration to use with the solution. When performAutoML is set to true, Amazon Personalize only evaluates the autoMLConfig section of the solution configuration.
    */
  var solutionConfig: js.UndefOr[SolutionConfig] = js.undefined
}

object CreateSolutionRequest {
  @scala.inline
  def apply(
    datasetGroupArn: Arn,
    name: Name,
    eventType: EventType = null,
    performAutoML: js.UndefOr[PerformAutoML] = js.undefined,
    performHPO: js.UndefOr[PerformHPO] = js.undefined,
    recipeArn: Arn = null,
    solutionConfig: SolutionConfig = null
  ): CreateSolutionRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn, name = name)
    if (eventType != null) __obj.updateDynamic("eventType")(eventType)
    if (!js.isUndefined(performAutoML)) __obj.updateDynamic("performAutoML")(performAutoML)
    if (!js.isUndefined(performHPO)) __obj.updateDynamic("performHPO")(performHPO)
    if (recipeArn != null) __obj.updateDynamic("recipeArn")(recipeArn)
    if (solutionConfig != null) __obj.updateDynamic("solutionConfig")(solutionConfig)
    __obj.asInstanceOf[CreateSolutionRequest]
  }
}

