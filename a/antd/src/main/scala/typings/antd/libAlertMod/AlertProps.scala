package typings.antd.libAlertMod

import typings.antd.antdStrings.error
import typings.antd.antdStrings.info
import typings.antd.antdStrings.success
import typings.antd.antdStrings.warning
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  /** Trigger when animation ending of Alert */
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var banner: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** Whether Alert can be closed */
  var closable: js.UndefOr[Boolean] = js.undefined
  /** Close text to show */
  var closeText: js.UndefOr[ReactNode] = js.undefined
  /** Additional content of Alert */
  var description: js.UndefOr[ReactNode] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var iconType: js.UndefOr[String] = js.undefined
  /** Content of Alert */
  var message: ReactNode
  /** Callback when close Alert */
  var onClose: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  /** Whether to show icon */
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Type of Alert styles, options:`success`, `info`, `warning`, `error`
    */
  var `type`: js.UndefOr[success | info | warning | error] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    afterClose: () => Unit = null,
    banner: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeText: ReactNode = null,
    description: ReactNode = null,
    icon: ReactNode = null,
    iconType: String = null,
    message: ReactNode = null,
    onClose: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    `type`: success | info | warning | error = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (!js.isUndefined(banner)) __obj.updateDynamic("banner")(banner)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
}

