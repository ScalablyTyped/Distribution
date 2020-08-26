package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1Metadata extends js.Object {
  var intentId: js.UndefOr[String] = js.native
  var intentName: js.UndefOr[String] = js.native
  var nluResponseTime: js.UndefOr[Double] = js.native
  var webhookForSlotFillingUsed: js.UndefOr[String] = js.native
  var webhookUsed: js.UndefOr[String] = js.native
}

object DialogflowV1Metadata {
  @scala.inline
  def apply(): DialogflowV1Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Metadata]
  }
  @scala.inline
  implicit class DialogflowV1MetadataOps[Self <: DialogflowV1Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIntentId(value: String): Self = this.set("intentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntentId: Self = this.set("intentId", js.undefined)
    @scala.inline
    def setIntentName(value: String): Self = this.set("intentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntentName: Self = this.set("intentName", js.undefined)
    @scala.inline
    def setNluResponseTime(value: Double): Self = this.set("nluResponseTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNluResponseTime: Self = this.set("nluResponseTime", js.undefined)
    @scala.inline
    def setWebhookForSlotFillingUsed(value: String): Self = this.set("webhookForSlotFillingUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebhookForSlotFillingUsed: Self = this.set("webhookForSlotFillingUsed", js.undefined)
    @scala.inline
    def setWebhookUsed(value: String): Self = this.set("webhookUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebhookUsed: Self = this.set("webhookUsed", js.undefined)
  }
  
}

