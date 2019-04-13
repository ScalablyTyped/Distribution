package typings
package arcgisDashJsDashApiLib.esriLayersMixinsPortalLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/mixins/PortalLayer", JSImport.Namespace)
@js.native
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PortalLayer {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PortalLayerProperties) = this()
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PortalItem = js.native
}

