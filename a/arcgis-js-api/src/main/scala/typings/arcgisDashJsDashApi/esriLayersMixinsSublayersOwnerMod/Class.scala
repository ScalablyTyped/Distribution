package typings.arcgisDashJsDashApi.esriLayersMixinsSublayersOwnerMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.Collection
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.Sublayer
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SublayersOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/mixins/SublayersOwner", JSImport.Namespace)
@js.native
class Class () extends SublayersOwner {
  /**
    * Returns a deep clone of a map service's [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) as defined by the service. This is useful for scenarios when the developer is unfamiliar with the service sublayers and needs to "reset" the layer's sublayers to match those defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#createServiceSublayers)
    *
    *
    */
  /* CompleteClass */
  override def createServiceSublayers(): Collection[Sublayer] = js.native
  /**
    * Returns the sublayer with the given layerId.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#findSublayerById)
    *
    * @param id The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the sublayer.
    *
    */
  /* CompleteClass */
  override def findSublayerById(id: Double): Sublayer = js.native
}

