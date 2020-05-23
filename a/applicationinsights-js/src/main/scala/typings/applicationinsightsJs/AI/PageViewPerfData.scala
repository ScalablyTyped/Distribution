package typings.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageViewPerfData extends PageViewData {
  var domProcessing: String
  var networkConnect: String
  var perfTotal: String
  var receivedResponse: String
  var sentRequest: String
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
}

