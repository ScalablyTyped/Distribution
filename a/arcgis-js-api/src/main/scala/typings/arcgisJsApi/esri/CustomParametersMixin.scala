package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomParametersMixin extends StObject {
  
  /**
    * A list of custom parameters appended to the URL of all resources fetched by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-CustomParametersMixin.html#customParameters)
    */
  var customParameters: Any
}
object CustomParametersMixin {
  
  inline def apply(customParameters: Any): CustomParametersMixin = {
    val __obj = js.Dynamic.literal(customParameters = customParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomParametersMixin]
  }
  
  extension [Self <: CustomParametersMixin](x: Self) {
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
  }
}
