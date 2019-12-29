package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceParameters extends Accessor {
  /**
    * Specifies the units for measuring distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2). If the unit is not specified the units are derived from the spatial reference. For a list of valid units, see [esriSRUnitType Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnitType_Constants/000w00000042000000/) and [esriSRUnit2Type Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnit2Type_Constants/000w00000041000000/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#distanceUnit)
    */
  var distanceUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
  /**
    * When `true`, the geodesic distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2) is measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geodesic)
    */
  var geodesic: Boolean = js.native
  /**
    * The geometry from which the distance is to be measured. The geometry can be a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), or a [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1)
    */
  var geometry1: Geometry = js.native
  /**
    * The geometry to which the distance is to be measured. The geometry can be a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), or a [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2)
    */
  var geometry2: Geometry = js.native
  /**
    * Converts an instance of  [this class]() to its ArcGIS portal JSON representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
}

@JSGlobal("__esri.DistanceParameters")
@js.native
object DistanceParameters extends TopLevel[DistanceParametersConstructor]

