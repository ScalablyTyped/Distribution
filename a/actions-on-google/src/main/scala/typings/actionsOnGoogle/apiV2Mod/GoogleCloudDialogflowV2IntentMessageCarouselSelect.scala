package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageCarouselSelect extends js.Object {
  var items: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageCarouselSelect {
  @scala.inline
  def apply(items: js.Array[GoogleCloudDialogflowV2IntentMessageCarouselSelectItem] = null): GoogleCloudDialogflowV2IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCarouselSelect]
  }
}

