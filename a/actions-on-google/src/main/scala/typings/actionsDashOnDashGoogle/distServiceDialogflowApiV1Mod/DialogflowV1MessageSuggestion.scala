package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageSuggestion extends js.Object {
  var title: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageSuggestion {
  @scala.inline
  def apply(title: String = null): DialogflowV1MessageSuggestion = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageSuggestion]
  }
}

