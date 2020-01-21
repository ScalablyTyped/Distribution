package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("__esri.BarChartMediaInfo")
@js.native
object BarChartMediaInfo extends TopLevel[BarChartMediaInfoConstructor]

