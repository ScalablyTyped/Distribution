package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstituteNumberFormatOptions extends StObject {
  
  /**
  		 * The Intl number format options for the [Intl.NumberFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NumberFormat) object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteNumberFormatOptions)
  		 */
  var intlOptions: NumberFormatOptions
  
  /**
  		 * The type of this format.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteNumberFormatOptions)
  		 */
  var `type`: number
}
object SubstituteNumberFormatOptions {
  
  inline def apply(intlOptions: NumberFormatOptions): SubstituteNumberFormatOptions = {
    val __obj = js.Dynamic.literal(intlOptions = intlOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[SubstituteNumberFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstituteNumberFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setIntlOptions(value: NumberFormatOptions): Self = StObject.set(x, "intlOptions", value.asInstanceOf[js.Any])
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
