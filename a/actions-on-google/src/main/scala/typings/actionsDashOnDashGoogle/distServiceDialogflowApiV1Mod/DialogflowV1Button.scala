package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1Button extends js.Object {
  var postback: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object DialogflowV1Button {
  @scala.inline
  def apply(postback: String = null, text: String = null): DialogflowV1Button = {
    val __obj = js.Dynamic.literal()
    if (postback != null) __obj.updateDynamic("postback")(postback)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DialogflowV1Button]
  }
}

