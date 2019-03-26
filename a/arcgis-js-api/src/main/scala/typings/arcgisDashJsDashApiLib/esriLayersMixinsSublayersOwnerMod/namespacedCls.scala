package typings
package arcgisDashJsDashApiLib.esriLayersMixinsSublayersOwnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/mixins/SublayersOwner", JSImport.Namespace)
@js.native
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SublayersOwner {
  /**
    * Returns a deep clone of a map service's [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) as defined by the service. This is useful for scenarios when the developer is unfamiliar with the service sublayers and needs to "reset" the layer's sublayers to match those defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#createServiceSublayers)
    *
    *
    */
  /* CompleteClass */
  override def createServiceSublayers(): arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Sublayer] = js.native
  /**
    * Returns the sublayer with the given layerId.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#findSublayerById)
    *
    * @param id The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the sublayer.
    *
    */
  /* CompleteClass */
  override def findSublayerById(id: scala.Double): arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Sublayer = js.native
}

