package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.AI.PageViewPerfData
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.DomProcessing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageViewPerformance
  extends PageViewPerfData
     with ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_PageViewPerformance: DomProcessing
  var durationMs: js.Any
  /**
    * Field indicating whether this instance of PageViewPerformance is valid and should be sent
    */
  var isValid: js.Any
  /**
    * Gets the total duration (PLT) in milliseconds. Check getIsValid() before using this method.
    */
  def getDurationMs(): Double
  /**
    * Indicates whether this instance of PageViewPerformance is valid and should be sent
    */
  def getIsValid(): Boolean
}

object PageViewPerformance {
  @scala.inline
  def apply(
    aiDataContract: DomProcessing,
    domProcessing: String,
    duration: String,
    durationMs: js.Any,
    getDurationMs: () => Double,
    getIsValid: () => Boolean,
    isValid: js.Any,
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
  ): PageViewPerformance = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], domProcessing = domProcessing.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], durationMs = durationMs.asInstanceOf[js.Any], getDurationMs = js.Any.fromFunction0(getDurationMs), getIsValid = js.Any.fromFunction0(getIsValid), isValid = isValid.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkConnect = networkConnect.asInstanceOf[js.Any], perfTotal = perfTotal.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], receivedResponse = receivedResponse.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerData = referrerData.asInstanceOf[js.Any], sentRequest = sentRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageViewPerformance]
  }
}

