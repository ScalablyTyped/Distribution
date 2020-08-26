package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramConfig extends Object {
  /**
    * Indicates the average value of the dataset. When set, a solid line on the histogram will render at the location of the average value along with a label defaulting to the value set here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var average: js.UndefOr[Double] = js.native
  /**
    * Function for styling bars representing histogram bins. This can be used to style bins or add custom interaction to them. For example, you can use this function to color bins that match the colors on the slider's track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.native
  /**
    * The bins of the histogram. This is an array of objects indicating the range and count of data in each bin. This value is typically retrieved from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  /**
    * Function that fires each time a data line is created. You can use this to style individual [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#dataLines) on the data axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.native
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLines: js.UndefOr[js.Array[HistogramConfigDataLines]] = js.native
  /**
    * Indicates the standard deviation of the dataset. When set, data lines are on the histogram at the locations of the standard deviations above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviation: js.UndefOr[Double] = js.native
  /**
    * Indicates the standard deviation of the dataset. When set, data lines are on the histogram at the locations of the standard deviations above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviationCount: js.UndefOr[Double] = js.native
}

object HistogramConfig {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): HistogramConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[HistogramConfig]
  }
  @scala.inline
  implicit class HistogramConfigOps[Self <: HistogramConfig] (val x: Self) extends AnyVal {
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
    def setAverage(value: Double): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    @scala.inline
    def setBarCreatedFunction(value: (/* index */ Double, /* element */ js.Any) => Unit): Self = this.set("barCreatedFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBarCreatedFunction: Self = this.set("barCreatedFunction", js.undefined)
    @scala.inline
    def setBinsVarargs(value: Bin*): Self = this.set("bins", js.Array(value :_*))
    @scala.inline
    def setBins(value: js.Array[Bin]): Self = this.set("bins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBins: Self = this.set("bins", js.undefined)
    @scala.inline
    def setDataLineCreatedFunction(
      value: (/* lineElement */ js.Any, /* labelElement */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit
    ): Self = this.set("dataLineCreatedFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDataLineCreatedFunction: Self = this.set("dataLineCreatedFunction", js.undefined)
    @scala.inline
    def setDataLinesVarargs(value: HistogramConfigDataLines*): Self = this.set("dataLines", js.Array(value :_*))
    @scala.inline
    def setDataLines(value: js.Array[HistogramConfigDataLines]): Self = this.set("dataLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLines: Self = this.set("dataLines", js.undefined)
    @scala.inline
    def setStandardDeviation(value: Double): Self = this.set("standardDeviation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardDeviation: Self = this.set("standardDeviation", js.undefined)
    @scala.inline
    def setStandardDeviationCount(value: Double): Self = this.set("standardDeviationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardDeviationCount: Self = this.set("standardDeviationCount", js.undefined)
  }
  
}

