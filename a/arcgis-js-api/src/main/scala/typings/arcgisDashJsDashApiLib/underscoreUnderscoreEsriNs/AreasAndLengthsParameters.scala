package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreasAndLengthsParameters extends Accessor {
  /**
    * The area unit in which areas of polygons will be calculated. Use the strings listed below or [any other valid area unit](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.AreaUnit.Code.ACRE).  **Possible Values:** acres | hectares | square-miles | square-kilometers | square-meters | square-feet | square-yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#areaUnit)
    */
  var areaUnit: java.lang.String = js.native
  /**
    * Defines the type of calculation for the geometry. The type can be one of the following:
    *
    * Value | Description
    * ------|------------
    * planar | Planar measurements use 2D Cartesian mathematics to calculate length. Use this type if the length needs to be calculated in the input spatial reference. Otherwise use `preserveShape`.
    * geodesic | Use this type to calculate an area or length using only the vertices of the polygon to define the lines connecting the vertices as geodesic segments independent of the actual shape of the polygon. **Note:** a geodesic segment is the shortest path between two points on an ellipsoid.
    * preserve-shape | Calculate the area or length of the geometry on the surface of the Earth ellipsoid (for geometries defined in a projected or geographic coordinate system). This method preserves the shape of the geometry in its coordinate system, which means the true area or length will be calculated for the geometry that is displayed on the map.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#calculationType)
    */
  var calculationType: java.lang.String = js.native
  /**
    * The length unit in which perimeters of polygons will be calculated. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER).  **Possible Values:** feet | kilometers | meters | miles | nautical-miles | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#lengthUnit)
    */
  var lengthUnit: java.lang.String = js.native
  /**
    * Polygon geometries for which to compute areas and lengths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#polygons)
    */
  var polygons: js.Array[Polygon] = js.native
  /**
    * Converts an instance of  [this class]() to its ArcGIS portal JSON representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
}

@JSGlobal("__esri.AreasAndLengthsParameters")
@js.native
class AreasAndLengthsParametersCls () extends AreasAndLengthsParameters {
  def this(properties: AreasAndLengthsParametersProperties) = this()
}

