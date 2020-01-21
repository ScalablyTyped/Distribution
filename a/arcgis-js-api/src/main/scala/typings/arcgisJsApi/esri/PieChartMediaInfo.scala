package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartMediaInfo
  extends JSONSupport
     with MediaInfo
     with ChartMediaInfo {
  /**
    * Indicates the type of chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-PieChartMediaInfo.html#type)
    *
    * @default pie-chart
    */
  val `type`: String
}

@JSGlobal("__esri.PieChartMediaInfo")
@js.native
object PieChartMediaInfo extends TopLevel[PieChartMediaInfoConstructor]

