package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMLLayerView extends LayerView {
  /**
    * A collection of all the [MapImages](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage) from visible sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#allVisibleMapImages)
    */
  val allVisibleMapImages: Collection[KMLLayerViewMapImage] = js.native
  /**
    * A collection of all the points from visible sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#allVisiblePoints)
    */
  val allVisiblePoints: Collection[Point] = js.native
  /**
    * A collection of all the polygons from visible sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#allVisiblePolygons)
    */
  val allVisiblePolygons: Collection[Polygon] = js.native
  /**
    * A collection of all the polylines from visible sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#allVisiblePolylines)
    */
  val allVisiblePolylines: Collection[Polyline] = js.native
}

