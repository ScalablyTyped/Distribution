package typings.atom

import typings.atom.mod.FocusableHTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoFocus[T] extends js.Object {
  var autoFocus: js.UndefOr[Boolean | FocusableHTMLElement] = js.undefined
  var item: T
  var priority: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoFocus {
  @scala.inline
  def apply[T](
    item: T,
    autoFocus: Boolean | FocusableHTMLElement = null,
    priority: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoFocus[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (autoFocus != null) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoFocus[T]]
  }
}

