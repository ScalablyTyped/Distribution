package typings
package antdLib.libNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProps extends js.Object {
  var bottom: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var getContainer: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  var placement: js.UndefOr[NotificationPlacement] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
}

object ConfigProps {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    getContainer: () => stdLib.HTMLElement = null,
    placement: NotificationPlacement = null,
    top: scala.Int | scala.Double = null
  ): ConfigProps = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigProps]
  }
}

