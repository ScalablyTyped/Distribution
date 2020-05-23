package typings.antd.operationMod

import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.rtl
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOperationProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var leftActive: js.UndefOr[Boolean] = js.undefined
  var leftArrowText: js.UndefOr[String] = js.undefined
  var moveToLeft: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var moveToRight: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var rightActive: js.UndefOr[Boolean] = js.undefined
  var rightArrowText: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TransferOperationProps {
  @scala.inline
  def apply(
    className: String = null,
    direction: ltr | rtl = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    leftActive: js.UndefOr[Boolean] = js.undefined,
    leftArrowText: String = null,
    moveToLeft: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    moveToRight: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    rightActive: js.UndefOr[Boolean] = js.undefined,
    rightArrowText: String = null,
    style: CSSProperties = null
  ): TransferOperationProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftActive)) __obj.updateDynamic("leftActive")(leftActive.get.asInstanceOf[js.Any])
    if (leftArrowText != null) __obj.updateDynamic("leftArrowText")(leftArrowText.asInstanceOf[js.Any])
    if (moveToLeft != null) __obj.updateDynamic("moveToLeft")(js.Any.fromFunction1(moveToLeft))
    if (moveToRight != null) __obj.updateDynamic("moveToRight")(js.Any.fromFunction1(moveToRight))
    if (!js.isUndefined(rightActive)) __obj.updateDynamic("rightActive")(rightActive.get.asInstanceOf[js.Any])
    if (rightArrowText != null) __obj.updateDynamic("rightArrowText")(rightArrowText.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferOperationProps]
  }
}

