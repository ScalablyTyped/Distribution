package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdNumbers.`false`
import typings.antd.esDrawerMod.DrawerProps
import typings.antd.esDrawerMod.EventType
import typings.antd.esDrawerMod.getContainerFunc
import typings.antd.esDrawerMod.placementType
import typings.react.reactMod.CSSProperties
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, height, className, width */
object Drawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esDrawerMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    afterVisibleChange: /* visible */ Boolean => Unit = null,
    bodyStyle: CSSProperties = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    destroyOnClose: js.UndefOr[Boolean] = js.undefined,
    getContainer: String | HTMLElement | getContainerFunc | `false` = null,
    handler: TagMod[Any] = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    onClose: /* e */ EventType => Unit = null,
    placement: placementType = null,
    prefixCls: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    title: TagMod[Any] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapClassName: String = null,
    zIndex: Int | Double = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose)
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DrawerProps
}

