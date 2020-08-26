package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixelBlockStatistics extends Object {
  /**
    * The maximum pixel value in the [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics)
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * The minimum pixel value in the [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics)
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * Value representing areas of no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics)
    */
  var noDataValue: js.UndefOr[Double] = js.native
}

object PixelBlockStatistics {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PixelBlockStatistics = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PixelBlockStatistics]
  }
  @scala.inline
  implicit class PixelBlockStatisticsOps[Self <: PixelBlockStatistics] (val x: Self) extends AnyVal {
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
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setNoDataValue(value: Double): Self = this.set("noDataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDataValue: Self = this.set("noDataValue", js.undefined)
  }
  
}

