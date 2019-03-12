package typings
package angularDashUiDashNotificationLib.angularMod.uiNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalMessageOptions extends js.Object {
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var horizontalSpacing: js.UndefOr[scala.Double] = js.undefined
  var maxCount: js.UndefOr[scala.Double] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* element */ js.Any, _]] = js.undefined
  var positionX: js.UndefOr[XPosition] = js.undefined
  var positionY: js.UndefOr[YPosition] = js.undefined
  var replaceMessage: js.UndefOr[scala.Boolean] = js.undefined
  var startRight: js.UndefOr[scala.Double] = js.undefined
  var startTop: js.UndefOr[scala.Double] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var verticalSpacing: js.UndefOr[scala.Double] = js.undefined
}

object IGlobalMessageOptions {
  @scala.inline
  def apply(
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null,
    horizontalSpacing: scala.Int | scala.Double = null,
    maxCount: scala.Int | scala.Double = null,
    onClose: /* element */ js.Any => _ = null,
    positionX: XPosition = null,
    positionY: YPosition = null,
    replaceMessage: js.UndefOr[scala.Boolean] = js.undefined,
    startRight: scala.Int | scala.Double = null,
    startTop: scala.Int | scala.Double = null,
    templateUrl: java.lang.String = null,
    verticalSpacing: scala.Int | scala.Double = null
  ): IGlobalMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (horizontalSpacing != null) __obj.updateDynamic("horizontalSpacing")(horizontalSpacing.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (positionX != null) __obj.updateDynamic("positionX")(positionX)
    if (positionY != null) __obj.updateDynamic("positionY")(positionY)
    if (!js.isUndefined(replaceMessage)) __obj.updateDynamic("replaceMessage")(replaceMessage)
    if (startRight != null) __obj.updateDynamic("startRight")(startRight.asInstanceOf[js.Any])
    if (startTop != null) __obj.updateDynamic("startTop")(startTop.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (verticalSpacing != null) __obj.updateDynamic("verticalSpacing")(verticalSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalMessageOptions]
  }
}

