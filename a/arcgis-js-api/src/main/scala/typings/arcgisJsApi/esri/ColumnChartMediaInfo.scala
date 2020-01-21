package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnChartMediaInfo
  extends JSONSupport
     with MediaInfo
     with ChartMediaInfo {
  /**
    * Indicates the type of chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ColumnChartMediaInfo.html#type)
    *
    * @default column-chart
    */
  val `type`: String
}

@JSGlobal("__esri.ColumnChartMediaInfo")
@js.native
object ColumnChartMediaInfo extends TopLevel[ColumnChartMediaInfoConstructor]

