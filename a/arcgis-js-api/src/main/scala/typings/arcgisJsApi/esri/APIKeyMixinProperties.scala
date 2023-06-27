package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIKeyMixinProperties extends StObject {
  
  /**
  		 * An authorization string used to access a resource or service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-APIKeyMixin.html#apiKey)
  		 */
  var apiKey: js.UndefOr[String] = js.undefined
}
object APIKeyMixinProperties {
  
  inline def apply(): APIKeyMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIKeyMixinProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: APIKeyMixinProperties] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
  }
}
