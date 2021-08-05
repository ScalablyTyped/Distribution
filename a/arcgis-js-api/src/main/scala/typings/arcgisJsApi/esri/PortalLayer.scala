package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalLayer extends StObject {
  
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  var portalItem: PortalItem
}
object PortalLayer {
  
  inline def apply(portalItem: PortalItem): PortalLayer = {
    val __obj = js.Dynamic.literal(portalItem = portalItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalLayer]
  }
  
  extension [Self <: PortalLayer](x: Self) {
    
    inline def setPortalItem(value: PortalItem): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
  }
}
