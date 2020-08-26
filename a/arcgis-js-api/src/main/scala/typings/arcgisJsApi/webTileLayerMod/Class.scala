package typings.arcgisJsApi.webTileLayerMod

import typings.arcgisJsApi.esri.WebTileLayer
import typings.arcgisJsApi.esri.WebTileLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/WebTileLayer", JSImport.Namespace)
@js.native
/**
  * WebTileLayer provides a simple way to add non-ArcGIS Server map tiles as a layer to a map. The constructor takes a URL template that usually follows a pattern of `http://some.domain.com/{level}/{col}/{row}/` where `level` corresponds to a zoom level, and `column` and `row` represent tile column and row, respectively. This pattern is not required, but is the most common one currently on the web.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html)
  */
class Class () extends WebTileLayer {
  def this(properties: WebTileLayerProperties) = this()
}

