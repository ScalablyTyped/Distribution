package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstituteOptions extends StObject {
  
  /**
    * A hashmap of string keys to formatting options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteOptions)
    */
  var format: HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions]
}
object SubstituteOptions {
  
  inline def apply(format: HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions]): SubstituteOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstituteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstituteOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
