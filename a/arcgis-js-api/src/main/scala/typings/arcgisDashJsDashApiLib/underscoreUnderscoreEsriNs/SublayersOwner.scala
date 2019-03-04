package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SublayersOwner extends js.Object {
  /**
    * Returns a deep clone of a map service's [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) as defined by the service. This is useful for scenarios when the developer is unfamiliar with the service sublayers and needs to "reset" the layer's sublayers to match those defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#createServiceSublayers)
    *
    *
    */
  def createServiceSublayers(): Collection[Sublayer]
  /**
    * Returns the sublayer with the given layerId.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#findSublayerById)
    *
    * @param id The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the sublayer.
    *
    */
  def findSublayerById(id: scala.Double): Sublayer
}

object SublayersOwner {
  @scala.inline
  def apply(
    createServiceSublayers: js.Function0[Collection[Sublayer]],
    findSublayerById: js.Function1[scala.Double, Sublayer]
  ): SublayersOwner = {
    val __obj = js.Dynamic.literal(createServiceSublayers = createServiceSublayers, findSublayerById = findSublayerById)
  
    __obj.asInstanceOf[SublayersOwner]
  }
}

