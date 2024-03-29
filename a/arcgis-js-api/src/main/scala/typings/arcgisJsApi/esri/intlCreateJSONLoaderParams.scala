package typings.arcgisJsApi.esri

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait intlCreateJSONLoaderParams extends StObject {
  
  /**
  		 * Used to calculate the relative path of the file to load.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#createJSONLoader)
  		 */
  var base: String
  
  /**
  		 * The location of the translation files.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#createJSONLoader)
  		 */
  var location: String | URL | js.Function
  
  /**
  		 * Used to check if the loader should be used to load a candidate's message bundle.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#createJSONLoader)
  		 */
  var pattern: String | js.RegExp
}
object intlCreateJSONLoaderParams {
  
  inline def apply(base: String, location: String | URL | js.Function, pattern: String | js.RegExp): intlCreateJSONLoaderParams = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[intlCreateJSONLoaderParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: intlCreateJSONLoaderParams] (val x: Self) extends AnyVal {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String | URL | js.Function): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
