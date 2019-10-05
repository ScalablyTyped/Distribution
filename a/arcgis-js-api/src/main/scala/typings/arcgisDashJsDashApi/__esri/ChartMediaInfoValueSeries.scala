package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartMediaInfoValueSeries extends Accessor {
  /**
    * String value indicating the tooltip for a series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html#tooltipField)
    */
  var tooltipField: String = js.native
  /**
    * Numerical value indicating the x-value for the chart series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html#x)
    */
  var x: Double = js.native
  /**
    * Numerical value indicating the y-value for the chart series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html#y)
    */
  var y: Double = js.native
}

@JSGlobal("__esri.ChartMediaInfoValueSeries")
@js.native
object ChartMediaInfoValueSeries extends TopLevel[ChartMediaInfoValueSeriesConstructor]

