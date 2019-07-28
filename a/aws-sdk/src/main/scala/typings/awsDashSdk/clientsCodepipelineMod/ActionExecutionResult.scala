package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionExecutionResult extends js.Object {
  /**
    * The action provider's external ID for the action execution.
    */
  var externalExecutionId: js.UndefOr[ExternalExecutionId] = js.undefined
  /**
    * The action provider's summary for the action execution.
    */
  var externalExecutionSummary: js.UndefOr[ExternalExecutionSummary] = js.undefined
  /**
    * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is used when running the action.
    */
  var externalExecutionUrl: js.UndefOr[Url] = js.undefined
}

object ActionExecutionResult {
  @scala.inline
  def apply(
    externalExecutionId: ExternalExecutionId = null,
    externalExecutionSummary: ExternalExecutionSummary = null,
    externalExecutionUrl: Url = null
  ): ActionExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (externalExecutionId != null) __obj.updateDynamic("externalExecutionId")(externalExecutionId)
    if (externalExecutionSummary != null) __obj.updateDynamic("externalExecutionSummary")(externalExecutionSummary)
    if (externalExecutionUrl != null) __obj.updateDynamic("externalExecutionUrl")(externalExecutionUrl)
    __obj.asInstanceOf[ActionExecutionResult]
  }
}

