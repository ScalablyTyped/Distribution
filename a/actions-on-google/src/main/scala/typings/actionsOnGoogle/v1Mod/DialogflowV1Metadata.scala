package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1Metadata extends js.Object {
  var intentId: js.UndefOr[String] = js.undefined
  var intentName: js.UndefOr[String] = js.undefined
  var nluResponseTime: js.UndefOr[Double] = js.undefined
  var webhookForSlotFillingUsed: js.UndefOr[String] = js.undefined
  var webhookUsed: js.UndefOr[String] = js.undefined
}

object DialogflowV1Metadata {
  @scala.inline
  def apply(
    intentId: String = null,
    intentName: String = null,
    nluResponseTime: js.UndefOr[Double] = js.undefined,
    webhookForSlotFillingUsed: String = null,
    webhookUsed: String = null
  ): DialogflowV1Metadata = {
    val __obj = js.Dynamic.literal()
    if (intentId != null) __obj.updateDynamic("intentId")(intentId.asInstanceOf[js.Any])
    if (intentName != null) __obj.updateDynamic("intentName")(intentName.asInstanceOf[js.Any])
    if (!js.isUndefined(nluResponseTime)) __obj.updateDynamic("nluResponseTime")(nluResponseTime.get.asInstanceOf[js.Any])
    if (webhookForSlotFillingUsed != null) __obj.updateDynamic("webhookForSlotFillingUsed")(webhookForSlotFillingUsed.asInstanceOf[js.Any])
    if (webhookUsed != null) __obj.updateDynamic("webhookUsed")(webhookUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Metadata]
  }
}

