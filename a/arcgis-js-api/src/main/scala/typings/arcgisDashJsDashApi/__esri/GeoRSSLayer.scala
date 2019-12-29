package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`geo-rss`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoRSSLayer
  extends Layer
     with ScaleRangeLayer {
  /**
    * Symbol used to represent line features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#lineSymbol)
    */
  var lineSymbol: SimpleLineSymbol = js.native
  /**
    * Symbol used to represent point features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#pointSymbol)
    */
  var pointSymbol: PictureMarkerSymbol | SimpleMarkerSymbol = js.native
  /**
    * Symbol used to represent polygon features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#polygonSymbol)
    */
  var polygonSymbol: SimpleFillSymbol = js.native
  @JSName("type")
  val type_GeoRSSLayer: `geo-rss` = js.native
  /**
    * The URL pointing to a GeoRSS file. This must be publicly available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#url)
    */
  var url: String = js.native
}

@JSGlobal("__esri.GeoRSSLayer")
@js.native
object GeoRSSLayer extends TopLevel[GeoRSSLayerConstructor]

