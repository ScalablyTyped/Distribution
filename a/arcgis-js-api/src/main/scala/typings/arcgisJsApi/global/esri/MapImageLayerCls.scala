package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MapImageLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.MapImageLayer")
@js.native
/**
  * MapImageLayer allows you to display and analyze data from [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sublayers) defined in a [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm), exporting images instead of features. Map service images are dynamically generated on the server based on a request, which includes an LOD (level of detail), a bounding box, dpi, spatial reference and other options. The exported image is of the entire map extent specified.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html)
  */
class MapImageLayerCls ()
  extends typings.arcgisJsApi.esri.MapImageLayer {
  def this(properties: MapImageLayerProperties) = this()
}

