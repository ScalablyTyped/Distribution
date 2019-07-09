package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramDataLines
  extends stdLib.Object {
  /**
    * The label associated with the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines)
    */
  var label: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The value on the data axis of the histogram where a line will be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#dataLines)
    */
  var value: scala.Double
}

object HistogramDataLines {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    value: scala.Double,
    label: java.lang.String | scala.Double = null
  ): HistogramDataLines = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramDataLines]
  }
}

