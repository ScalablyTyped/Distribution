package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionInfo extends Object {
  /**
    * A function that takes a point and returns a [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    *
    *
    */
  def convert(): Unit
  /**
    * A function that takes a string and returns a Point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    *
    *
    */
  def reverseConvert(): Unit
}

object ConversionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    convert: () => Unit,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    reverseConvert: () => Unit
  ): ConversionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], convert = js.Any.fromFunction0(convert), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), reverseConvert = js.Any.fromFunction0(reverseConvert))
    __obj.asInstanceOf[ConversionInfo]
  }
}

