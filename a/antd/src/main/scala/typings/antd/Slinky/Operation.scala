package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esTransferOperationMod.TransferOperationProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, disabled */
object Operation
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esTransferMod.default.asInstanceOf[js.Dynamic].selectDynamic("Operation").asInstanceOf[String | js.Object]
  def apply(
    leftActive: js.UndefOr[Boolean] = js.undefined,
    leftArrowText: String = null,
    moveToLeft: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    moveToRight: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    rightActive: js.UndefOr[Boolean] = js.undefined,
    rightArrowText: String = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leftActive)) __obj.updateDynamic("leftActive")(leftActive)
    if (leftArrowText != null) __obj.updateDynamic("leftArrowText")(leftArrowText)
    if (moveToLeft != null) __obj.updateDynamic("moveToLeft")(js.Any.fromFunction1(moveToLeft))
    if (moveToRight != null) __obj.updateDynamic("moveToRight")(js.Any.fromFunction1(moveToRight))
    if (!js.isUndefined(rightActive)) __obj.updateDynamic("rightActive")(rightActive)
    if (rightArrowText != null) __obj.updateDynamic("rightArrowText")(rightArrowText)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransferOperationProps
}

/* The following DOM/SVG props were specified: style, className, disabled */
object operation
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esTransferOperationMod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[String | js.Object]
  def apply(
    leftActive: js.UndefOr[Boolean] = js.undefined,
    leftArrowText: String = null,
    moveToLeft: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    moveToRight: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    rightActive: js.UndefOr[Boolean] = js.undefined,
    rightArrowText: String = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leftActive)) __obj.updateDynamic("leftActive")(leftActive)
    if (leftArrowText != null) __obj.updateDynamic("leftArrowText")(leftArrowText)
    if (moveToLeft != null) __obj.updateDynamic("moveToLeft")(js.Any.fromFunction1(moveToLeft))
    if (moveToRight != null) __obj.updateDynamic("moveToRight")(js.Any.fromFunction1(moveToRight))
    if (!js.isUndefined(rightActive)) __obj.updateDynamic("rightActive")(rightActive)
    if (rightArrowText != null) __obj.updateDynamic("rightArrowText")(rightArrowText)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransferOperationProps
}

