package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait wfsUtilsGetCapabilitiesOptions extends StObject {
  
  /**
  		 * A list of key-value pairs of parameters to append to the url.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#getCapabilities)
  		 */
  var customParameters: js.UndefOr[Any] = js.undefined
  
  /**
  		 * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the executions of the remote method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#getCapabilities)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object wfsUtilsGetCapabilitiesOptions {
  
  inline def apply(): wfsUtilsGetCapabilitiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[wfsUtilsGetCapabilitiesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: wfsUtilsGetCapabilitiesOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
