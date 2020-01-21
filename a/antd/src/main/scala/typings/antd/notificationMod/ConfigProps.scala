package typings.antd.notificationMod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProps extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var closeIcon: js.UndefOr[ReactNode] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var placement: js.UndefOr[NotificationPlacement] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object ConfigProps {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    closeIcon: ReactNode = null,
    duration: Int | Double = null,
    getContainer: () => HTMLElement = null,
    placement: NotificationPlacement = null,
    top: Int | Double = null
  ): ConfigProps = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigProps]
  }
}

