package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLayerSaveAsOptions extends StObject {
  
  /**
    * The folder in which to save the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#saveAs)
    */
  var folder: js.UndefOr[PortalFolder] = js.undefined
}
object RouteLayerSaveAsOptions {
  
  inline def apply(): RouteLayerSaveAsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteLayerSaveAsOptions]
  }
  
  extension [Self <: RouteLayerSaveAsOptions](x: Self) {
    
    inline def setFolder(value: PortalFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
  }
}
