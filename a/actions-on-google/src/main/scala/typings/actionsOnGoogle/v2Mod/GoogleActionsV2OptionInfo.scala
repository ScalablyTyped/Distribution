package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OptionInfo extends js.Object {
  /**
    * A unique key that will be sent back to the agent if this response is given.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * A list of synonyms that can also be used to trigger this item in dialog.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
}

object GoogleActionsV2OptionInfo {
  @scala.inline
  def apply(key: String = null, synonyms: js.Array[String] = null): GoogleActionsV2OptionInfo = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OptionInfo]
  }
}

