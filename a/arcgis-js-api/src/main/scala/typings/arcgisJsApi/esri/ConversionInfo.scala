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
  var convert: js.UndefOr[ConvertFunction] = js.undefined
  
  /**
  		 * A function that takes a string and returns a Point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
  		 */
  var reverseConvert: js.UndefOr[ReverseConvertFunction] = js.undefined
}
object ConversionInfo {
  
  inline def apply(): ConversionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConversionInfo] (val x: Self) extends AnyVal {
    
    inline def setConvert(value: /* point */ Point => FormatPosition): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setReverseConvert(value: /* coordinate */ String => Point): Self = StObject.set(x, "reverseConvert", js.Any.fromFunction1(value))
    
    inline def setReverseConvertUndefined: Self = StObject.set(x, "reverseConvert", js.undefined)
  }
}
