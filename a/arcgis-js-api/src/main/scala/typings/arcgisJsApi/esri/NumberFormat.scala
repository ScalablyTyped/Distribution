package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormat extends StObject {
  
  /**
  		 * Indicates if the number should be formatted with a thousands separator.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#NumberFormat)
  		 */
  var digitSeparator: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies the number of decimal places that should appear in the formatted number.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#NumberFormat)
  		 */
  var places: js.UndefOr[Double] = js.undefined
}
object NumberFormat {
  
  inline def apply(): NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberFormat] (val x: Self) extends AnyVal {
    
    inline def setDigitSeparator(value: Boolean): Self = StObject.set(x, "digitSeparator", value.asInstanceOf[js.Any])
    
    inline def setDigitSeparatorUndefined: Self = StObject.set(x, "digitSeparator", js.undefined)
    
    inline def setPlaces(value: Double): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    inline def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
  }
}
