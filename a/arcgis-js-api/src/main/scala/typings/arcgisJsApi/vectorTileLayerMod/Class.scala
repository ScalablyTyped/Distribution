package typings.arcgisJsApi.vectorTileLayerMod

import typings.arcgisJsApi.esri.VectorTileLayer
import typings.arcgisJsApi.esri.VectorTileLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/VectorTileLayer", JSImport.Namespace)
@js.native
/**
  * VectorTileLayer accesses cached tiles of data and renders it in vector format. It is similar to a [WebTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html) in the context of caching; however, a [WebTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html) renders as a series of images, not vector data. Unlike raster tiles, they can adapt to the resolution of their display device and can be restyled for multiple uses. VectorTileLayer delivers styled maps while taking advantage of cached raster map tiles with vector map data.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html)
  */
class Class () extends VectorTileLayer {
  def this(properties: VectorTileLayerProperties) = this()
}

