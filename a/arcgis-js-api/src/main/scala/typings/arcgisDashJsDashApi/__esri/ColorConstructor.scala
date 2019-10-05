package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorConstructor
  extends Instantiable1[
      (/* color */ js.Any) | (/* color */ js.Array[Double]) | (/* color */ String), 
      Color
    ] {
  /**
    * Creates a new color object by passing either a hex, rgb(a), hsl(a) or [named color value](https://www.w3.org/wiki/CSS/Properties/color/keywords). Hex, hsl(a) and named color values can be passed as a string:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html)
    */
  /**
    * Creates a Color instance by blending two colors using a weight factor. Optionally accepts a Color object to update and return instead of creating a new object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#blendColors)
    *
    * @param start The start color.
    * @param end The end color.
    * @param weight The weight value is a number from 0 to 1, with 0.5 being a 50/50 blend.
    * @param out A previously allocated Color object to reuse for the result.
    *
    */
  def blendColors(start: Color, end: Color, weight: Double): Color = js.native
  def blendColors(start: Color, end: Color, weight: Double, out: Color): Color = js.native
  /**
    * Creates a Color instance using a 3 or 4 element array, mapping each element in sequence to the rgb(a) values of the color. Optionally accepts a Color object to update with the color value and return instead of creating a new object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromArray)
    *
    * @param a The input array.
    * @param obj A previously allocated Color object to reuse for the result.
    *
    */
  def fromArray(a: js.Array[Double]): Color = js.native
  def fromArray(a: js.Array[Double], obj: Color): Color = js.native
  /**
    * Creates a Color instance from a hex string with a '#' prefix. Supports 12-bit #rgb shorthand. Optionally accepts a Color object to update with the parsed value and return instead of creating a new object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromHex)
    *
    * @param color The input color in a hex string.
    * @param obj A previously allocated Color object to reuse for the result.
    *
    */
  def fromHex(color: String): Color = js.native
  def fromHex(color: String, obj: Color): Color = js.native
  /**
    * Creates a new Color instance, and initializes it with values from a JSON object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromJSON)
    *
    * @param json A JSON representation of the instance.
    *
    */
  def fromJSON(json: js.Any): Color = js.native
  /**
    * Creates a Color instance from a string of the form "rgb()" or "rgba()". Optionally accepts a Color object to update with the parsed value and return instead of creating a new object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromRgb)
    *
    * @param color The input color in a string of the form "rgb()" or "rgba()".
    * @param out A previously allocated Color object to reuse for the result.
    *
    */
  def fromRgb(color: String): Color = js.native
  def fromRgb(color: String, out: Color): Color = js.native
  /**
    * Creates a Color instance by parsing a generic string. Accepts hex, rgb, and rgba style color values. Optionally accepts a Color object to update with the parsed value and return instead of creating a new object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromString)
    *
    * @param str The input value.
    * @param obj A previously allocated Color object to reuse for the result.
    *
    */
  def fromString(str: String): Color = js.native
  def fromString(str: String, obj: Color): Color = js.native
}

