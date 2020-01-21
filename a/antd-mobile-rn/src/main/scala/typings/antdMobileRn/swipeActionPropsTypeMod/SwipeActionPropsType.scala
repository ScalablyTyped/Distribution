package typings.antdMobileRn.swipeActionPropsTypeMod

import typings.antdMobileRn.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeActionPropsType[T] extends js.Object {
  /** whether button is disabled*/
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[js.Array[AnonClassName[T]]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var right: js.UndefOr[js.Array[AnonClassName[T]]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SwipeActionPropsType {
  @scala.inline
  def apply[T](
    autoClose: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    left: js.Array[AnonClassName[T]] = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    right: js.Array[AnonClassName[T]] = null,
    title: String = null
  ): SwipeActionPropsType[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeActionPropsType[T]]
  }
}

