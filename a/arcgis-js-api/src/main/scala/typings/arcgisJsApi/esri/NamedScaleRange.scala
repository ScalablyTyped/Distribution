package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedScaleRange extends Object {
  /**
    * The named scale range, such as "room" or "metropolitan area"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#NamedScaleRange)
    */
  var id: String = js.native
  /**
    * The maximum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#NamedScaleRange)
    */
  var maxScale: Double = js.native
  /**
    * The minimum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#NamedScaleRange)
    */
  var minScale: Double = js.native
}

object NamedScaleRange {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    maxScale: Double,
    minScale: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): NamedScaleRange = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], maxScale = maxScale.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[NamedScaleRange]
  }
  @scala.inline
  implicit class NamedScaleRangeOps[Self <: NamedScaleRange] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinScale(value: Double): Self = this.set("minScale", value.asInstanceOf[js.Any])
  }
  
}

