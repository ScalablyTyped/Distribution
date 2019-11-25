package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageBasicCardButtonAction extends js.Object {
  var url: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageBasicCardButtonAction {
  @scala.inline
  def apply(url: String = null): DialogflowV1MessageBasicCardButtonAction = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageBasicCardButtonAction]
  }
}

