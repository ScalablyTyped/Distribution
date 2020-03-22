package typings.antd.drawerMod

import typings.antd.antdBooleans.`false`
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var destroyOnClose: js.UndefOr[Boolean] = js.undefined
  /** wrapper dom node style of header and body */
  var drawerStyle: js.UndefOr[CSSProperties] = js.undefined
  var footer: js.UndefOr[ReactNode] = js.undefined
  var footerStyle: js.UndefOr[CSSProperties] = js.undefined
  var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false`] = js.undefined
  var handler: js.UndefOr[ReactNode] = js.undefined
  var headerStyle: js.UndefOr[CSSProperties] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskStyle: js.UndefOr[CSSProperties] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ EventType, Unit]] = js.undefined
  var placement: js.UndefOr[placementType] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var push: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    afterVisibleChange: /* visible */ Boolean => Unit = null,
    bodyStyle: CSSProperties = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    destroyOnClose: js.UndefOr[Boolean] = js.undefined,
    drawerStyle: CSSProperties = null,
    footer: ReactNode = null,
    footerStyle: CSSProperties = null,
    getContainer: String | HTMLElement | getContainerFunc | `false` = null,
    handler: ReactNode = null,
    headerStyle: CSSProperties = null,
    height: Double | String = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    onClose: /* e */ EventType => Unit = null,
    placement: placementType = null,
    prefixCls: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: ReactNode = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    zIndex: Int | Double = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose.asInstanceOf[js.Any])
    if (drawerStyle != null) __obj.updateDynamic("drawerStyle")(drawerStyle.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

