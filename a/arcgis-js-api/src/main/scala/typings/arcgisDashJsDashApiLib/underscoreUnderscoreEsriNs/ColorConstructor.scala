package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorConstructor
  extends org.scalablytyped.runtime.Instantiable1[
      (/* color */ js.Any) | (/* color */ js.Array[scala.Double]) | (/* color */ java.lang.String), 
      Color
    ] {
  /**
    * Creates a new color object by passing either a hex, rgba, or named color value.
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
  def blendColors(start: Color, end: Color, weight: scala.Double): Color = js.native
  def blendColors(start: Color, end: Color, weight: scala.Double, out: Color): Color = js.native
  /**
    * Creates a Color instance using a 3 or 4 element array, mapping each element in sequence to the rgb(a) values of the color. Optionally accepts a Color object to update with the color value and return instead of creating a new object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromArray)
    *
    * @param a The input array.
    * @param obj A previously allocated Color object to reuse for the result.
    *
    */
  def fromArray(a: js.Array[scala.Double]): Color = js.native
  def fromArray(a: js.Array[scala.Double], obj: Color): Color = js.native
  /**
    * Creates a Color instance from a hex string with a '#' prefix. Supports 12-bit #rgb shorthand. Optionally accepts a Color object to update with the parsed value and return instead of creating a new object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromHex)
    *
    * @param color The input color in a hex string.
    * @param obj A previously allocated Color object to reuse for the result.
    *
    */
  def fromHex(color: java.lang.String): Color = js.native
  def fromHex(color: java.lang.String, obj: Color): Color = js.native
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
  def fromRgb(color: java.lang.String): Color = js.native
  def fromRgb(color: java.lang.String, out: Color): Color = js.native
  /**
    * Creates a Color instance by parsing a generic string. Accepts hex, rgb, and rgba style color values. Optionally accepts a Color object to update with the parsed value and return instead of creating a new object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromString)
    *
    * @param str The input value.
    * @param obj A previously allocated Color object to reuse for the result.
    *
    */
  def fromString(str: java.lang.String): Color = js.native
  def fromString(str: java.lang.String, obj: Color): Color = js.native
}

