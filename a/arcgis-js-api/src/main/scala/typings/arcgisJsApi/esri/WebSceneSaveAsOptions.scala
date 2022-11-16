package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSceneSaveAsOptions extends StObject {
  
  /**
    * the folder in which to save the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#saveAs)
    */
  var folder: js.UndefOr[PortalFolder] = js.undefined
  
  /**
    * allow the scene to be saved even in the case it contains unsupported content (layers, renderers, symbols).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#saveAs)
    */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}
object WebSceneSaveAsOptions {
  
  inline def apply(): WebSceneSaveAsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSceneSaveAsOptions]
  }
  
  extension [Self <: WebSceneSaveAsOptions](x: Self) {
    
    inline def setFolder(value: PortalFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setIgnoreUnsupported(value: Boolean): Self = StObject.set(x, "ignoreUnsupported", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnsupportedUndefined: Self = StObject.set(x, "ignoreUnsupported", js.undefined)
  }
}
