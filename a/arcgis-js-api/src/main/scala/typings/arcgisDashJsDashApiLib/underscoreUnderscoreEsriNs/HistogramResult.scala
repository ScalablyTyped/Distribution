package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramResult
  extends stdLib.Object {
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var bins: js.Array[HistogramResultBins]
  /**
    * The maximum value returned by the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var maxValue: scala.Double
  /**
    * The minimum value returned by the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var minValue: scala.Double
}

object HistogramResult {
  @scala.inline
  def apply(
    bins: js.Array[HistogramResultBins],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    maxValue: scala.Double,
    minValue: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): HistogramResult = {
    val __obj = js.Dynamic.literal(bins = bins, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxValue = maxValue, minValue = minValue, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[HistogramResult]
  }
}

