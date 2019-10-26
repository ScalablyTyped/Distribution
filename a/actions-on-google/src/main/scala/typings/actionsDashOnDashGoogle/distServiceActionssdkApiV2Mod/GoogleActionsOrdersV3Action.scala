package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3Action extends js.Object {
  /**
    * Metadata associated with an action.
    */
  var actionMetadata: js.UndefOr[GoogleActionsOrdersV3ActionActionMetadata] = js.undefined
  /**
    * Action to take.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
  /**
    * Title or label of the action, displayed to the user.
    * Max allowed length is 100 chars.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Required: Type of action.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3ActionType] = js.undefined
}

object GoogleActionsOrdersV3Action {
  @scala.inline
  def apply(
    actionMetadata: GoogleActionsOrdersV3ActionActionMetadata = null,
    openUrlAction: GoogleActionsV2UiElementsOpenUrlAction = null,
    title: String = null,
    `type`: GoogleActionsOrdersV3ActionType = null
  ): GoogleActionsOrdersV3Action = {
    val __obj = js.Dynamic.literal()
    if (actionMetadata != null) __obj.updateDynamic("actionMetadata")(actionMetadata)
    if (openUrlAction != null) __obj.updateDynamic("openUrlAction")(openUrlAction)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GoogleActionsOrdersV3Action]
  }
}

