package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionContext extends js.Object {
  /**
    * The system-generated unique ID that corresponds to an action's execution.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined
  /**
    * The name of the action within the context of a job.
    */
  var name: js.UndefOr[ActionName] = js.undefined
}

object ActionContext {
  @scala.inline
  def apply(actionExecutionId: ActionExecutionId = null, name: ActionName = null): ActionContext = {
    val __obj = js.Dynamic.literal()
    if (actionExecutionId != null) __obj.updateDynamic("actionExecutionId")(actionExecutionId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ActionContext]
  }
}

