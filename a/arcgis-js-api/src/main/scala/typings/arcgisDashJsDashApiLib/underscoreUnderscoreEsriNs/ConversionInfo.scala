package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionInfo
  extends stdLib.Object {
  /**
    * A function that takes a point and returns a [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    *
    *
    */
  def convert(): scala.Unit
  /**
    * A function that takes a string and returns a Point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    *
    *
    */
  def reverseConvert(): scala.Unit
}

object ConversionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    convert: js.Function0[scala.Unit],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    reverseConvert: js.Function0[scala.Unit]
  ): ConversionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("convert")(convert)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("reverseConvert")(reverseConvert)
    __obj.asInstanceOf[ConversionInfo]
  }
}

