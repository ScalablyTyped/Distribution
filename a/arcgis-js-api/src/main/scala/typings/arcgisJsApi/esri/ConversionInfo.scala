package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionInfo extends StObject {
  
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
  
  inline def apply(convert: () => scala.Unit, reverseConvert: () => scala.Unit): ConversionInfo = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction0(convert), reverseConvert = js.Any.fromFunction0(reverseConvert))
    __obj.asInstanceOf[ConversionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConversionInfo] (val x: Self) extends AnyVal {
    
    inline def setConvert(value: () => scala.Unit): Self = StObject.set(x, "convert", js.Any.fromFunction0(value))
    
    inline def setReverseConvert(value: () => scala.Unit): Self = StObject.set(x, "reverseConvert", js.Any.fromFunction0(value))
  }
}
