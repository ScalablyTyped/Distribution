package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallerId extends js.Object {
  var app: js.UndefOr[String] = js.native
  var appArgs: js.UndefOr[String] = js.native
  var callerId: js.UndefOr[String] = js.native
  var channelId: String = js.native
  var context: js.UndefOr[String] = js.native
  var endpoint: String = js.native
  var extension: js.UndefOr[String] = js.native
  var formats: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var originator: js.UndefOr[String] = js.native
  var otherChannelId: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var variables: js.UndefOr[Containers] = js.native
}

object CallerId {
  @scala.inline
  def apply(channelId: String, endpoint: String): CallerId = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallerId]
  }
  @scala.inline
  implicit class CallerIdOps[Self <: CallerId] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setAppArgs(value: String): Self = this.set("appArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppArgs: Self = this.set("appArgs", js.undefined)
    @scala.inline
    def setCallerId(value: String): Self = this.set("callerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallerId: Self = this.set("callerId", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setFormats(value: String): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOriginator(value: String): Self = this.set("originator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginator: Self = this.set("originator", js.undefined)
    @scala.inline
    def setOtherChannelId(value: String): Self = this.set("otherChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherChannelId: Self = this.set("otherChannelId", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setVariables(value: Containers): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

