package typings.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalMessageOptions extends js.Object {
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var horizontalSpacing: js.UndefOr[Double] = js.undefined
  var maxCount: js.UndefOr[Double] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* element */ js.Any, _]] = js.undefined
  var positionX: js.UndefOr[XPosition] = js.undefined
  var positionY: js.UndefOr[YPosition] = js.undefined
  var replaceMessage: js.UndefOr[Boolean] = js.undefined
  var startRight: js.UndefOr[Double] = js.undefined
  var startTop: js.UndefOr[Double] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var verticalSpacing: js.UndefOr[Double] = js.undefined
}

object IGlobalMessageOptions {
  @scala.inline
  def apply(
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    horizontalSpacing: js.UndefOr[Double] = js.undefined,
    maxCount: js.UndefOr[Double] = js.undefined,
    onClose: /* element */ js.Any => _ = null,
    positionX: XPosition = null,
    positionY: YPosition = null,
    replaceMessage: js.UndefOr[Boolean] = js.undefined,
    startRight: js.UndefOr[Double] = js.undefined,
    startTop: js.UndefOr[Double] = js.undefined,
    templateUrl: String = null,
    verticalSpacing: js.UndefOr[Double] = js.undefined
  ): IGlobalMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalSpacing)) __obj.updateDynamic("horizontalSpacing")(horizontalSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxCount)) __obj.updateDynamic("maxCount")(maxCount.get.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (positionX != null) __obj.updateDynamic("positionX")(positionX.asInstanceOf[js.Any])
    if (positionY != null) __obj.updateDynamic("positionY")(positionY.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceMessage)) __obj.updateDynamic("replaceMessage")(replaceMessage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startRight)) __obj.updateDynamic("startRight")(startRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startTop)) __obj.updateDynamic("startTop")(startTop.get.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalSpacing)) __obj.updateDynamic("verticalSpacing")(verticalSpacing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalMessageOptions]
  }
}

