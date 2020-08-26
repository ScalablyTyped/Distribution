package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageryLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.ImageryLayer")
@js.native
/**
  * Represents an [image service resource](https://developers.arcgis.com/rest/services-reference/image-service.htm) as a layer. An ImageryLayer retrieves and displays data from image services. An image service supports accessing the mosaicked image, its catalog, and the individual rasters in the catalog. An image service supports dynamic access and tiled access. Dynamic access provides more functionalities, and tiled access provides faster and more scalable access to precooked tiles.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)
  */
class ImageryLayerCls ()
  extends typings.arcgisJsApi.esri.ImageryLayer {
  def this(properties: ImageryLayerProperties) = this()
}

