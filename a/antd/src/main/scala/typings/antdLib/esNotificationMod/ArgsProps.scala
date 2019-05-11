package typings
package antdLib.esNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var bottom: js.UndefOr[scala.Double] = js.undefined
  var btn: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var duration: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var getContainer: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var message: reactLib.reactMod.ReactNode
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var placement: js.UndefOr[NotificationPlacement] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
  val `type`: js.UndefOr[IconType] = js.undefined
}

object ArgsProps {
  @scala.inline
  def apply(
    message: reactLib.reactMod.ReactNode,
    bottom: scala.Int | scala.Double = null,
    btn: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    description: reactLib.reactMod.ReactNode = null,
    duration: scala.Int | scala.Double = null,
    getContainer: () => stdLib.HTMLElement = null,
    icon: reactLib.reactMod.ReactNode = null,
    key: java.lang.String = null,
    onClick: () => scala.Unit = null,
    onClose: () => scala.Unit = null,
    placement: NotificationPlacement = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    top: scala.Int | scala.Double = null,
    `type`: IconType = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (btn != null) __obj.updateDynamic("btn")(btn.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArgsProps]
  }
}

