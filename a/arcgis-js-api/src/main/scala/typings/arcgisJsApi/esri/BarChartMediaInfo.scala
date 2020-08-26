package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChartMediaInfo
  extends JSONSupport
     with MediaInfo
     with ChartMediaInfo {
  /**
    * Indicates the type of chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-BarChartMediaInfo.html#type)
    *
    * @default bar-chart
    */
  val `type`: String = js.native
}

object BarChartMediaInfo {
  @scala.inline
  def apply(
    altText: String,
    caption: String,
    title: String,
    toJSON: () => js.Any,
    `type`: String,
    value: ChartMediaInfoValue
  ): BarChartMediaInfo = {
    val __obj = js.Dynamic.literal(altText = altText.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartMediaInfo]
  }
  @scala.inline
  implicit class BarChartMediaInfoOps[Self <: BarChartMediaInfo] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

