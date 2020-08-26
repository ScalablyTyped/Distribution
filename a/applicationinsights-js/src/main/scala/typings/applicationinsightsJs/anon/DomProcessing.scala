package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomProcessing extends js.Object {
  var domProcessing: FieldType = js.native
  var duration: FieldType = js.native
  var measurements: FieldType = js.native
  var name: FieldType = js.native
  var networkConnect: FieldType = js.native
  var perfTotal: FieldType = js.native
  var properties: FieldType = js.native
  var receivedResponse: FieldType = js.native
  var sentRequest: FieldType = js.native
  var url: FieldType = js.native
  var ver: FieldType = js.native
}

object DomProcessing {
  @scala.inline
  def apply(
    domProcessing: FieldType,
    duration: FieldType,
    measurements: FieldType,
    name: FieldType,
    networkConnect: FieldType,
    perfTotal: FieldType,
    properties: FieldType,
    receivedResponse: FieldType,
    sentRequest: FieldType,
    url: FieldType,
    ver: FieldType
  ): DomProcessing = {
    val __obj = js.Dynamic.literal(domProcessing = domProcessing.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkConnect = networkConnect.asInstanceOf[js.Any], perfTotal = perfTotal.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], receivedResponse = receivedResponse.asInstanceOf[js.Any], sentRequest = sentRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomProcessing]
  }
  @scala.inline
  implicit class DomProcessingOps[Self <: DomProcessing] (val x: Self) extends AnyVal {
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
    def setDomProcessing(value: FieldType): Self = this.set("domProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: FieldType): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeasurements(value: FieldType): Self = this.set("measurements", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: FieldType): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkConnect(value: FieldType): Self = this.set("networkConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerfTotal(value: FieldType): Self = this.set("perfTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: FieldType): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceivedResponse(value: FieldType): Self = this.set("receivedResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setSentRequest(value: FieldType): Self = this.set("sentRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: FieldType): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: FieldType): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

