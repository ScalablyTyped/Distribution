package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SublayersOwner extends js.Object {
  /**
    * Returns a deep clone of a map service's [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) as defined by the service. This is useful for scenarios when the developer is unfamiliar with the service sublayers and needs to "reset" the layer's sublayers to match those defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#createServiceSublayers)
    *
    *
    */
  def createServiceSublayers(): Collection[Sublayer] = js.native
  /**
    * Returns the sublayer with the given layerId.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#findSublayerById)
    *
    * @param id The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the sublayer.
    *
    */
  def findSublayerById(id: Double): Sublayer = js.native
}

object SublayersOwner {
  @scala.inline
  def apply(createServiceSublayers: () => Collection[Sublayer], findSublayerById: Double => Sublayer): SublayersOwner = {
    val __obj = js.Dynamic.literal(createServiceSublayers = js.Any.fromFunction0(createServiceSublayers), findSublayerById = js.Any.fromFunction1(findSublayerById))
    __obj.asInstanceOf[SublayersOwner]
  }
  @scala.inline
  implicit class SublayersOwnerOps[Self <: SublayersOwner] (val x: Self) extends AnyVal {
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
    def setCreateServiceSublayers(value: () => Collection[Sublayer]): Self = this.set("createServiceSublayers", js.Any.fromFunction0(value))
    @scala.inline
    def setFindSublayerById(value: Double => Sublayer): Self = this.set("findSublayerById", js.Any.fromFunction1(value))
  }
  
}

