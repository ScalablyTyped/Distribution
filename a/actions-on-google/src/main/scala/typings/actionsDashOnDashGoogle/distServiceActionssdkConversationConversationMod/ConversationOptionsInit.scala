package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationOptionsInit[TConvData, TUserStorage] extends js.Object {
  /** @public */
  var data: js.UndefOr[TConvData] = js.undefined
  /** @public */
  var storage: js.UndefOr[TUserStorage] = js.undefined
}

object ConversationOptionsInit {
  @scala.inline
  def apply[TConvData, TUserStorage](data: TConvData = null, storage: TUserStorage = null): ConversationOptionsInit[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationOptionsInit[TConvData, TUserStorage]]
  }
}

