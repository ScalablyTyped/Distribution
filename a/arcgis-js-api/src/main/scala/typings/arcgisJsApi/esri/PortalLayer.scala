package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalLayer extends js.Object {
  
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
  implicit class PortalLayerOps[Self <: PortalLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPortalItem(value: PortalItem): Self = this.set("portalItem", value.asInstanceOf[js.Any])
  }
}
