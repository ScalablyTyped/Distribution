package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorRampColorsForClassBreaks extends Object {
  /**
    * An array of 1 to 10 colors intended for displaying as a ramp with distinct or unique colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var colors: js.Array[Color_] = js.native
  /**
    * The number of classes or colors used in the ramp of discrete colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var numClasses: Double = js.native
}

object ColorRampColorsForClassBreaks {
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ColorRampColorsForClassBreaks = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numClasses = numClasses.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ColorRampColorsForClassBreaks]
  }
  @scala.inline
  implicit class ColorRampColorsForClassBreaksOps[Self <: ColorRampColorsForClassBreaks] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: Color_ *): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[Color_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumClasses(value: Double): Self = this.set("numClasses", value.asInstanceOf[js.Any])
  }
  
}

