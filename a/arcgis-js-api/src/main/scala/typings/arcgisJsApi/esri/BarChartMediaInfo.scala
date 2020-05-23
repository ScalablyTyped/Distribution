package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val `type`: String
}

object BarChartMediaInfo {
  @scala.inline
  def apply(caption: String, title: String, toJSON: () => js.Any, `type`: String, value: ChartMediaInfoValue): BarChartMediaInfo = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartMediaInfo]
  }
}

