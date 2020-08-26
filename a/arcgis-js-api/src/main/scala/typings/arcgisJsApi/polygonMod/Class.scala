package typings.arcgisJsApi.polygonMod

import typings.arcgisJsApi.esri.Polygon
import typings.arcgisJsApi.esri.PolygonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/geometry/Polygon", JSImport.Namespace)
@js.native
/**
  * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference). Each ring is represented as an array of points. The first and last points of a ring must be the same. A polygon also has boolean-valued [hasM](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) and [hasZ](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) fields.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
  */
class Class () extends Polygon {
  def this(properties: PolygonProperties) = this()
}

