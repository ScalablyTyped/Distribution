package typings
package antdLib.libAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  /** Trigger when animation ending of Alert */
  var afterClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var banner: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Whether Alert can be closed */
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /** Close text to show */
  var closeText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional content of Alert */
  var description: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var iconType: js.UndefOr[java.lang.String] = js.undefined
  /** Content of Alert */
  var message: reactLib.reactMod.ReactNs.ReactNode
  /** Callback when close Alert */
  var onClose: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLAnchorElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to show icon */
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Type of Alert styles, options:`success`, `info`, `warning`, `error`
    */
  var `type`: js.UndefOr[
    antdLib.antdLibStrings.success | antdLib.antdLibStrings.info | antdLib.antdLibStrings.warning | antdLib.antdLibStrings.error
  ] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    message: reactLib.reactMod.ReactNs.ReactNode,
    afterClose: () => scala.Unit = null,
    banner: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    closeText: reactLib.reactMod.ReactNs.ReactNode = null,
    description: reactLib.reactMod.ReactNs.ReactNode = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    iconType: java.lang.String = null,
    onClose: reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLAnchorElement] = null,
    prefixCls: java.lang.String = null,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    `type`: antdLib.antdLibStrings.success | antdLib.antdLibStrings.info | antdLib.antdLibStrings.warning | antdLib.antdLibStrings.error = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (!js.isUndefined(banner)) __obj.updateDynamic("banner")(banner)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
}

