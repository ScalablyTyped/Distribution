package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1Status extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var errorType: js.UndefOr[String] = js.undefined
  var webhookTimedOut: js.UndefOr[Boolean] = js.undefined
}

object DialogflowV1Status {
  @scala.inline
  def apply(
    code: Int | Double = null,
    errorType: String = null,
    webhookTimedOut: js.UndefOr[Boolean] = js.undefined
  ): DialogflowV1Status = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errorType != null) __obj.updateDynamic("errorType")(errorType.asInstanceOf[js.Any])
    if (!js.isUndefined(webhookTimedOut)) __obj.updateDynamic("webhookTimedOut")(webhookTimedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Status]
  }
}

