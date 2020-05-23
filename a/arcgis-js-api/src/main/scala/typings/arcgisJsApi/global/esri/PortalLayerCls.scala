package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PortalLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.PortalLayer")
@js.native
class PortalLayerCls ()
  extends typings.arcgisJsApi.esri.PortalLayer {
  def this(properties: PortalLayerProperties) = this()
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: typings.arcgisJsApi.esri.PortalItem = js.native
}

