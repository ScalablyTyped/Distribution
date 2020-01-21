package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color_ extends js.Object {
  /**
    * The alpha value. This value can be any number between `0` and `1` and represents the opacity of the Color. `0` indicates the color is fully transparent and `1` indicates it is fully opaque.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#a)
    */
  var a: Double = js.native
  /**
    * The blue value. This value can range between `0` and `255`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#b)
    */
  var b: Double = js.native
  /**
    * The green value. This value can range between `0` and `255`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#g)
    */
  var g: Double = js.native
  /**
    * The red value. This value can range between `0` and `255`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#r)
    */
  var r: Double = js.native
  /**
    * Takes an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object and sets this color instance to the input value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#setColor)
    *
    * @param color The new color value. This parameter can be a string representing a named color or a hex value; an array of three or four numbers representing r, g, b, a values; or an object with r, g, b, a properties.
    *
    */
  def setColor(color: String): Color_ = js.native
  def setColor(color: js.Any): Color_ = js.native
  def setColor(color: js.Array[Double]): Color_ = js.native
  /**
    * Returns a CSS color string in rgba form representing the Color instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#toCss)
    *
    * @param includeAlpha If `true`, the alpha value will be included in the result.
    *
    */
  def toCss(): String = js.native
  def toCss(includeAlpha: Boolean): String = js.native
  /**
    * Returns a CSS color string in hexadecimal form that represents the Color instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#toHex)
    *
    *
    */
  def toHex(): String = js.native
  /**
    * Returns a JSON object with all the values from a Color instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
  /**
    * Returns a 3-component array of rgb values that represent the Color instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#toRgb)
    *
    *
    */
  def toRgb(): js.Array[Double] = js.native
  /**
    * Returns a 4-component array of rgba values that represent the Color instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#toRgba)
    *
    *
    */
  def toRgba(): js.Array[Double] = js.native
}

@JSGlobal("__esri.Color")
@js.native
object Color_ extends TopLevel[ColorConstructor]

