package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISImageServiceGetCatalogItemICSInfoOptions extends StObject {
  
  /**
  		 * Signal object that can be used to abort the asynchronous task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#getCatalogItemICSInfo)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object ArcGISImageServiceGetCatalogItemICSInfoOptions {
  
  inline def apply(): ArcGISImageServiceGetCatalogItemICSInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGISImageServiceGetCatalogItemICSInfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcGISImageServiceGetCatalogItemICSInfoOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
