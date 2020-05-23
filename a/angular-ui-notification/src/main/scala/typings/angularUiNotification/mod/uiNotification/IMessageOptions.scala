package typings.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageOptions extends js.Object {
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var positionX: js.UndefOr[XPosition] = js.undefined
  var positionY: js.UndefOr[YPosition] = js.undefined
  var replaceMessage: js.UndefOr[Boolean] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[MessageType] = js.undefined
}

object IMessageOptions {
  @scala.inline
  def apply(
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    message: String = null,
    positionX: XPosition = null,
    positionY: YPosition = null,
    replaceMessage: js.UndefOr[Boolean] = js.undefined,
    templateUrl: String = null,
    title: String = null,
    `type`: MessageType = null
  ): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (positionX != null) __obj.updateDynamic("positionX")(positionX.asInstanceOf[js.Any])
    if (positionY != null) __obj.updateDynamic("positionY")(positionY.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceMessage)) __obj.updateDynamic("replaceMessage")(replaceMessage.get.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageOptions]
  }
}

