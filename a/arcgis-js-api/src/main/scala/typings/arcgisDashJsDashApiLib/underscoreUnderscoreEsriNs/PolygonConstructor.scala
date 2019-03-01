package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonConstructor
  extends /**
  * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference). Each ring is represented as an array points. The first and last points of a ring must be the same. A polygon also has boolean-valued [hasM](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) and [hasZ](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) fields.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
  */
org.scalablytyped.runtime.Instantiable0[Polygon]
     with org.scalablytyped.runtime.Instantiable1[/* properties */ PolygonProperties, Polygon] {
  /**
    * Converts the given Extent to a Polygon instance. This is useful for scenarios in which you would like to display an area of interest, which is typically defined by an Extent or bounding box, as a polygon with a fill symbol in the view. Some geoprocessing tools require input geometries to be of a Polygon type and not an Extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#fromExtent)
    *
    * @param extent An extent object to convert to a polygon.
    *
    */
  def fromExtent(extent: Extent): Polygon = js.native
  def fromJSON(json: js.Any): Polygon = js.native
}

