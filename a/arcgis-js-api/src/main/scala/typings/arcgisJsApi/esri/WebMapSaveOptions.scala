package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebMapSaveOptions extends StObject {
  
  /**
    * When `true`, the webmap will save even if it contains unsupported content (layers, renderers, symbols).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#save)
    */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}
object WebMapSaveOptions {
  
  inline def apply(): WebMapSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebMapSaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebMapSaveOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUnsupported(value: Boolean): Self = StObject.set(x, "ignoreUnsupported", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnsupportedUndefined: Self = StObject.set(x, "ignoreUnsupported", js.undefined)
  }
}
