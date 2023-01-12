package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFromPortalItemParams extends StObject {
  
  /**
    * The object representing an ArcGIS Online or ArcGIS Enterprise portal item from which to load the network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#fromPortalItem)
    */
  var portalItem: PortalItem
}
object NetworkFromPortalItemParams {
  
  inline def apply(portalItem: PortalItem): NetworkFromPortalItemParams = {
    val __obj = js.Dynamic.literal(portalItem = portalItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkFromPortalItemParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkFromPortalItemParams] (val x: Self) extends AnyVal {
    
    inline def setPortalItem(value: PortalItem): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
  }
}
