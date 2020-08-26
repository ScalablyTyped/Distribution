package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BaseTileLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.BaseTileLayer")
@js.native
/**
  * This class may be extended to create a custom [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html). Tile layers are composed of images, such as satellite imagery, that are composed of square tiles mosaicked together in columns and rows, giving the layer the appearance that it is one continuous image. These layers have several levels of detail (LOD) that permit users to zoom in to any region of the map and load additional tiles that depict features in higher resolution at larger map scales.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html)
  */
class BaseTileLayerCls ()
  extends typings.arcgisJsApi.esri.BaseTileLayer {
  def this(properties: BaseTileLayerProperties) = this()
}

