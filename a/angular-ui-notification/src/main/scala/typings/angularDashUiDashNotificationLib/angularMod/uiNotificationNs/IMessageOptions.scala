package typings
package angularDashUiDashNotificationLib.angularMod.uiNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageOptions extends js.Object {
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var positionX: js.UndefOr[XPosition] = js.undefined
  var positionY: js.UndefOr[YPosition] = js.undefined
  var replaceMessage: js.UndefOr[scala.Boolean] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[MessageType] = js.undefined
}

object IMessageOptions {
  @scala.inline
  def apply(
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    positionX: XPosition = null,
    positionY: YPosition = null,
    replaceMessage: js.UndefOr[scala.Boolean] = js.undefined,
    templateUrl: java.lang.String = null,
    title: java.lang.String = null,
    `type`: MessageType = null
  ): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (positionX != null) __obj.updateDynamic("positionX")(positionX)
    if (positionY != null) __obj.updateDynamic("positionY")(positionY)
    if (!js.isUndefined(replaceMessage)) __obj.updateDynamic("replaceMessage")(replaceMessage)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMessageOptions]
  }
}

