package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBreak extends Object {
  /**
    * The label describing the given class break for use in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#ClassBreak)
    */
  var label: String = js.native
  /**
    * The upper bound of the class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#ClassBreak)
    */
  var maxValue: Double = js.native
  /**
    * The lower bound of the class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#ClassBreak)
    */
  var minValue: Double = js.native
}

object ClassBreak {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    maxValue: Double,
    minValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ClassBreak = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ClassBreak]
  }
  @scala.inline
  implicit class ClassBreakOps[Self <: ClassBreak] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
  }
  
}

