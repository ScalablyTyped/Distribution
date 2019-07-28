package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCustomActionTypeOutput extends js.Object {
  /**
    * Returns information about the details of an action type.
    */
  var actionType: ActionType
  /**
    * Specifies the tags applied to the custom action.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateCustomActionTypeOutput {
  @scala.inline
  def apply(actionType: ActionType, tags: TagList = null): CreateCustomActionTypeOutput = {
    val __obj = js.Dynamic.literal(actionType = actionType)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateCustomActionTypeOutput]
  }
}

