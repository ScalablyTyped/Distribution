package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramResult extends Object {
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var bins: js.Array[Bin] = js.native
  /**
    * The maximum value returned by the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var maxValue: Double = js.native
  /**
    * The minimum value returned by the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var minValue: Double = js.native
}

object HistogramResult {
  @scala.inline
  def apply(
    bins: js.Array[Bin],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxValue: Double,
    minValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): HistogramResult = {
    val __obj = js.Dynamic.literal(bins = bins.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[HistogramResult]
  }
  @scala.inline
  implicit class HistogramResultOps[Self <: HistogramResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBinsVarargs(value: Bin*): Self = this.set("bins", js.Array(value :_*))
    @scala.inline
    def setBins(value: js.Array[Bin]): Self = this.set("bins", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
  }
  
}

