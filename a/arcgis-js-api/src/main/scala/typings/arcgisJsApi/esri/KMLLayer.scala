package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.kml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMLLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer {
  /**
    * A collection of [KMLSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#sublayers)
    */
  var sublayers: Collection[KMLSublayer] = js.native
  @JSName("type")
  val type_KMLLayer: kml = js.native
  /**
    * The publicly accessible URL for a .kml or .kmz file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#url)
    */
  var url: String = js.native
}

