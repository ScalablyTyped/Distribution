package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Argument
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Status")
@js.native
class Status protected () extends js.Object {
  /** @hidden */
  def this(raw: js.Array[GoogleActionsV2Argument]) = this()
  /** @public */
  var input: ArgumentsStatus = js.native
  /** @public */
  var list: js.Array[js.UndefOr[GoogleRpcStatus]] = js.native
  /** @public */
  def get(name: String): js.UndefOr[GoogleRpcStatus] = js.native
}

