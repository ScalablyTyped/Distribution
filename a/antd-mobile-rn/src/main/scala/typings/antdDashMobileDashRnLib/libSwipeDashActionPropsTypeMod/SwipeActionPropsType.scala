package typings
package antdDashMobileDashRnLib.libSwipeDashActionPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeActionPropsType[T] extends js.Object {
  /** whether button is disabled*/
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var left: js.UndefOr[js.Array[antdDashMobileDashRnLib.Anon_ClassName[T]]] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var right: js.UndefOr[js.Array[antdDashMobileDashRnLib.Anon_ClassName[T]]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SwipeActionPropsType {
  @scala.inline
  def apply[T](
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.Array[antdDashMobileDashRnLib.Anon_ClassName[T]] = null,
    onClose: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    right: js.Array[antdDashMobileDashRnLib.Anon_ClassName[T]] = null,
    title: java.lang.String = null
  ): SwipeActionPropsType[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (left != null) __obj.updateDynamic("left")(left)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (right != null) __obj.updateDynamic("right")(right)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SwipeActionPropsType[T]]
  }
}

