package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalLayer extends js.Object {
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  var portalItem: PortalItem
}

object PortalLayer {
  @scala.inline
  def apply(portalItem: PortalItem): PortalLayer = {
    val __obj = js.Dynamic.literal(portalItem = portalItem)
  
    __obj.asInstanceOf[PortalLayer]
  }
}

