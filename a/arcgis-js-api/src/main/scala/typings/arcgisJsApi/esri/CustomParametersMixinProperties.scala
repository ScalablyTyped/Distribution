package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomParametersMixinProperties extends StObject {
  
  /**
    * A list of custom parameters appended to the URL of all resources fetched by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-CustomParametersMixin.html#customParameters)
    */
  var customParameters: js.UndefOr[Any] = js.undefined
}
object CustomParametersMixinProperties {
  
  inline def apply(): CustomParametersMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomParametersMixinProperties]
  }
  
  extension [Self <: CustomParametersMixinProperties](x: Self) {
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
  }
}
