package typings.arcgisJsApi.esri

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
  def findSublayerById(id: Double): Sublayer
}

object SublayersOwner {
  @scala.inline
  def apply(createServiceSublayers: () => Collection[Sublayer], findSublayerById: Double => Sublayer): SublayersOwner = {
    val __obj = js.Dynamic.literal(createServiceSublayers = js.Any.fromFunction0(createServiceSublayers), findSublayerById = js.Any.fromFunction1(findSublayerById))
    __obj.asInstanceOf[SublayersOwner]
  }
}

