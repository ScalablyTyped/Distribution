package typings.arcgisJsApi.tileLayerMod

import typings.arcgisJsApi.esri.TileLayer
import typings.arcgisJsApi.esri.TileLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/TileLayer", JSImport.Namespace)
@js.native
/**
  * The TileLayer allows you work with a cached [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) exposed by the ArcGIS Server REST API and add it to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) as a tile layer. A cached service accesses tiles from a cache instead of dynamically rendering images. Because they are cached, tiled layers render faster than [MapImageLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html). To create an instance of TileLayer, you must reference the URL of the cached map service.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html)
  */
class Class () extends TileLayer {
  def this(properties: TileLayerProperties) = this()
}

