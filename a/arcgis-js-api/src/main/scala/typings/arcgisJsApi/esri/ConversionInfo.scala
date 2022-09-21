package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionInfo
  extends StObject
     with Object {
  
  /**
    * A function that takes a point and returns a [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    */
  def convert(): scala.Unit
  
  /**
    * A function that takes a string and returns a Point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    */
  def reverseConvert(): scala.Unit
}
object ConversionInfo {
  
  inline def apply(
    constructor: js.Function,
    convert: () => scala.Unit,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    reverseConvert: () => scala.Unit
  ): ConversionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], convert = js.Any.fromFunction0(convert), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), reverseConvert = js.Any.fromFunction0(reverseConvert))
    __obj.asInstanceOf[ConversionInfo]
  }
  
  extension [Self <: ConversionInfo](x: Self) {
    
    inline def setConvert(value: () => scala.Unit): Self = StObject.set(x, "convert", js.Any.fromFunction0(value))
    
    inline def setReverseConvert(value: () => scala.Unit): Self = StObject.set(x, "reverseConvert", js.Any.fromFunction0(value))
  }
}
