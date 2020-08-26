package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.AI.PageViewData
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageView
  extends PageViewData
     with ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_PageView: Duration = js.native
}

object PageView {
  @scala.inline
  def apply(
    aiDataContract: Duration,
    duration: String,
    measurements: js.Any,
    name: String,
    properties: js.Any,
    referrer: String,
    referrerData: String,
    url: String,
    ver: Double
  ): PageView = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerData = referrerData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageView]
  }
  @scala.inline
  implicit class PageViewOps[Self <: PageView] (val x: Self) extends AnyVal {
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
    def setAiDataContract(value: Duration): Self = this.set("aiDataContract", value.asInstanceOf[js.Any])
  }
  
}

