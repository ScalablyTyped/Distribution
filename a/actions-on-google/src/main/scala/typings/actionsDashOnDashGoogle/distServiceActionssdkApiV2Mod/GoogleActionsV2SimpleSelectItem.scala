package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2SimpleSelectItem extends js.Object {
  /**
    * Item key and synonyms.
    */
  var optionInfo: js.UndefOr[GoogleActionsV2OptionInfo] = js.undefined
  /**
    * Title of the item. It will act as synonym if it's provided.
    * Optional
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2SimpleSelectItem {
  @scala.inline
  def apply(optionInfo: GoogleActionsV2OptionInfo = null, title: String = null): GoogleActionsV2SimpleSelectItem = {
    val __obj = js.Dynamic.literal()
    if (optionInfo != null) __obj.updateDynamic("optionInfo")(optionInfo.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2SimpleSelectItem]
  }
}

