package typings.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageViewData extends EventData {
  var duration: String = js.native
  var referrer: String = js.native
  var referrerData: String = js.native
  var url: String = js.native
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
  @scala.inline
  implicit class PageViewDataOps[Self <: PageViewData] (val x: Self) extends AnyVal {
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrerData(value: String): Self = this.set("referrerData", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

