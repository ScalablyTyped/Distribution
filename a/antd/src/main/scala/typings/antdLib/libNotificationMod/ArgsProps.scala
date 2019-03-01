package typings
package antdLib.libNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var btn: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var duration: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var message: reactLib.reactMod.ReactNs.ReactNode
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var placement: js.UndefOr[NotificationPlacement] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  val `type`: js.UndefOr[IconType] = js.undefined
}

object ArgsProps {
  @scala.inline
  def apply(
    message: reactLib.reactMod.ReactNs.ReactNode,
    btn: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    description: reactLib.reactMod.ReactNs.ReactNode = null,
    duration: scala.Int | scala.Double = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    key: java.lang.String = null,
    onClick: js.Function0[scala.Unit] = null,
    onClose: js.Function0[scala.Unit] = null,
    placement: NotificationPlacement = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    `type`: IconType = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (btn != null) __obj.updateDynamic("btn")(btn.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArgsProps]
  }
}

