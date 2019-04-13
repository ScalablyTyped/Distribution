package typings
package antdLib.libTransferOperationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOperationProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var leftActive: js.UndefOr[scala.Boolean] = js.undefined
  var leftArrowText: js.UndefOr[java.lang.String] = js.undefined
  var moveToLeft: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement]] = js.undefined
  var moveToRight: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement]] = js.undefined
  var rightActive: js.UndefOr[scala.Boolean] = js.undefined
  var rightArrowText: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object TransferOperationProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    leftActive: js.UndefOr[scala.Boolean] = js.undefined,
    leftArrowText: java.lang.String = null,
    moveToLeft: reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement] = null,
    moveToRight: reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement] = null,
    rightActive: js.UndefOr[scala.Boolean] = js.undefined,
    rightArrowText: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): TransferOperationProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(leftActive)) __obj.updateDynamic("leftActive")(leftActive)
    if (leftArrowText != null) __obj.updateDynamic("leftArrowText")(leftArrowText)
    if (moveToLeft != null) __obj.updateDynamic("moveToLeft")(moveToLeft)
    if (moveToRight != null) __obj.updateDynamic("moveToRight")(moveToRight)
    if (!js.isUndefined(rightActive)) __obj.updateDynamic("rightActive")(rightActive)
    if (rightArrowText != null) __obj.updateDynamic("rightArrowText")(rightArrowText)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TransferOperationProps]
  }
}

