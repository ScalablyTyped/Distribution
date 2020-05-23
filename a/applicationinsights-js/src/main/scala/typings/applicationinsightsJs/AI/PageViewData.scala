package typings.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageViewData extends EventData {
  var duration: String
  var referrer: String
  var referrerData: String
  var url: String
}

object PageViewData {
  @scala.inline
  def apply(
    duration: String,
    measurements: js.Any,
    name: String,
    properties: js.Any,
    referrer: String,
    referrerData: String,
    url: String,
    ver: Double
  ): PageViewData = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerData = referrerData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageViewData]
  }
}

