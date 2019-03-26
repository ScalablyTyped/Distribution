package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Series extends Accessor {
  /**
    * String value indicating the tooltip for a series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Series.html#tooltipField)
    */
  var tooltipField: java.lang.String = js.native
  /**
    * Numerical value indicating the x-value for the chart series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Series.html#x)
    */
  var x: scala.Double = js.native
  /**
    * Numerical value indicating the y-value for the chart series.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Series.html#y)
    */
  var y: scala.Double = js.native
}

@JSGlobal("__esri.Series")
@js.native
class SeriesCls () extends Series {
  def this(properties: SeriesProperties) = this()
}

