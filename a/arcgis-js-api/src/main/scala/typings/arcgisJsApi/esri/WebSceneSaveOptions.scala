package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSceneSaveOptions extends StObject {
  
  /**
  		 * When `true`, the scene will save even if it contains unsupported content (layers, renderers, symbols).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#save)
  		 */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}
object WebSceneSaveOptions {
  
  inline def apply(): WebSceneSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSceneSaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSceneSaveOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUnsupported(value: Boolean): Self = StObject.set(x, "ignoreUnsupported", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnsupportedUndefined: Self = StObject.set(x, "ignoreUnsupported", js.undefined)
  }
}
