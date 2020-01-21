package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineChartMediaInfo
  extends JSONSupport
     with MediaInfo
     with ChartMediaInfo {
  /**
    * Indicates the type of chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-LineChartMediaInfo.html#type)
    *
    * @default line-chart
    */
  val `type`: String
}

@JSGlobal("__esri.LineChartMediaInfo")
@js.native
object LineChartMediaInfo extends TopLevel[LineChartMediaInfoConstructor]

