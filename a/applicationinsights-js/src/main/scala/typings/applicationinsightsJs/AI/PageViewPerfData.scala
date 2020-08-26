package typings.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageViewPerfData extends PageViewData {
  var domProcessing: String = js.native
  var networkConnect: String = js.native
  var perfTotal: String = js.native
  var receivedResponse: String = js.native
  var sentRequest: String = js.native
}

object PageViewPerfData {
  @scala.inline
  def apply(
    domProcessing: String,
    duration: String,
    measurements: js.Any,
    name: String,
    networkConnect: String,
    perfTotal: String,
    properties: js.Any,
    receivedResponse: String,
    referrer: String,
    referrerData: String,
    sentRequest: String,
    url: String,
    ver: Double
  ): PageViewPerfData = {
    val __obj = js.Dynamic.literal(domProcessing = domProcessing.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkConnect = networkConnect.asInstanceOf[js.Any], perfTotal = perfTotal.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], receivedResponse = receivedResponse.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerData = referrerData.asInstanceOf[js.Any], sentRequest = sentRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageViewPerfData]
  }
  @scala.inline
  implicit class PageViewPerfDataOps[Self <: PageViewPerfData] (val x: Self) extends AnyVal {
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
    def setDomProcessing(value: String): Self = this.set("domProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkConnect(value: String): Self = this.set("networkConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerfTotal(value: String): Self = this.set("perfTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceivedResponse(value: String): Self = this.set("receivedResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setSentRequest(value: String): Self = this.set("sentRequest", value.asInstanceOf[js.Any])
  }
  
}

