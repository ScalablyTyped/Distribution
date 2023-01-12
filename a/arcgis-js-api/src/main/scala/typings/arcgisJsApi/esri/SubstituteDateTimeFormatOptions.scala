package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstituteDateTimeFormatOptions extends StObject {
  
  /**
    * The date format options for the [Intl.DateTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var intlOptions: DateTimeFormatOptions
  
  /**
    * The type of this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var `type`: date
}
object SubstituteDateTimeFormatOptions {
  
  inline def apply(intlOptions: DateTimeFormatOptions): SubstituteDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(intlOptions = intlOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[SubstituteDateTimeFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstituteDateTimeFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setIntlOptions(value: DateTimeFormatOptions): Self = StObject.set(x, "intlOptions", value.asInstanceOf[js.Any])
    
    inline def setType(value: date): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
