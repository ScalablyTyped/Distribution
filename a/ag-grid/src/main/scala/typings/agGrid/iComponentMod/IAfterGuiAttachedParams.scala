package typings.agGrid.iComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAfterGuiAttachedParams extends js.Object {
  def hidePopup(): Unit
}

object IAfterGuiAttachedParams {
  @scala.inline
  def apply(hidePopup: () => Unit): IAfterGuiAttachedParams = {
    val __obj = js.Dynamic.literal(hidePopup = js.Any.fromFunction0(hidePopup))
    __obj.asInstanceOf[IAfterGuiAttachedParams]
  }
}

