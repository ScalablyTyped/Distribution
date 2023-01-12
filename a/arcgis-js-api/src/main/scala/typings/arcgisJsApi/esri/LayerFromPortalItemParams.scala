package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerFromPortalItemParams extends StObject {
  
  /**
    * The object representing an ArcGIS Online or ArcGIS Enterprise portal item from which to load the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromPortalItem)
    */
  var portalItem: PortalItem
}
object LayerFromPortalItemParams {
  
  inline def apply(portalItem: PortalItem): LayerFromPortalItemParams = {
    val __obj = js.Dynamic.literal(portalItem = portalItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerFromPortalItemParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerFromPortalItemParams] (val x: Self) extends AnyVal {
    
    inline def setPortalItem(value: PortalItem): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
  }
}
