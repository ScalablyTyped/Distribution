package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalLayerProperties extends StObject {
  
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
}
object PortalLayerProperties {
  
  @scala.inline
  def apply(): PortalLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalLayerProperties]
  }
  
  @scala.inline
  implicit class PortalLayerPropertiesMutableBuilder[Self <: PortalLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
  }
}
