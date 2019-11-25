package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageBasicCardButton extends js.Object {
  var openUrlAction: js.UndefOr[DialogflowV1MessageBasicCardButtonAction] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageBasicCardButton {
  @scala.inline
  def apply(openUrlAction: DialogflowV1MessageBasicCardButtonAction = null, title: String = null): DialogflowV1MessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    if (openUrlAction != null) __obj.updateDynamic("openUrlAction")(openUrlAction.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageBasicCardButton]
  }
}

