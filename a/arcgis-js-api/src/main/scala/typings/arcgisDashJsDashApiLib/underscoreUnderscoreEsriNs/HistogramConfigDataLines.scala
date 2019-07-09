package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramConfigDataLines
  extends stdLib.Object {
  /**
    * The label associated with the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var label: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The value on the data axis of the histogram where a line will be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object HistogramConfigDataLines {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    label: java.lang.String | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): HistogramConfigDataLines = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramConfigDataLines]
  }
}

