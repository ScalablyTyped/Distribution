package typings.arcgisJsApi.polygonSymbol3DMod

import typings.arcgisJsApi.esri.PolygonSymbol3D
import typings.arcgisJsApi.esri.PolygonSymbol3DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/PolygonSymbol3D", JSImport.Namespace)
@js.native
/**
  * PolygonSymbol3D is used to render features with [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This symbol type is not supported in 2D MapViews. Polygon features may also be rendered as points with icons or objects at the centroid of each polygon.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html)
  */
class Class () extends PolygonSymbol3D {
  def this(properties: PolygonSymbol3DProperties) = this()
}

