package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageOptionInfo extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
}

object DialogflowV1MessageOptionInfo {
  @scala.inline
  def apply(key: String = null, synonyms: js.Array[String] = null): DialogflowV1MessageOptionInfo = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageOptionInfo]
  }
}

