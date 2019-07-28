package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoFocus[T] extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var item: T
  var priority: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Anon_AutoFocus {
  @scala.inline
  def apply[T](
    item: T,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Anon_AutoFocus[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Anon_AutoFocus[T]]
  }
}

