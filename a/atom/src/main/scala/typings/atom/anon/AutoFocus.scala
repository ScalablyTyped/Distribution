package typings.atom.anon

import typings.atom.mod.FocusableHTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFocus[T] extends js.Object {
  var autoFocus: js.UndefOr[Boolean | FocusableHTMLElement] = js.undefined
  var item: T
  var priority: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AutoFocus {
  @scala.inline
  def apply[T](
    item: T,
    autoFocus: Boolean | FocusableHTMLElement = null,
    priority: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AutoFocus[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (autoFocus != null) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocus[T]]
  }
}

