package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalLayer extends StObject {
  
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  var portalItem: PortalItem = js.native
}
object PortalLayer {
  
  @scala.inline
  def apply(portalItem: PortalItem): PortalLayer = {
    val __obj = js.Dynamic.literal(portalItem = portalItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalLayer]
  }
  
  @scala.inline
  implicit class PortalLayerMutableBuilder[Self <: PortalLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortalItem(value: PortalItem): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
  }
}
