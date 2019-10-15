package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceParametersProperties extends js.Object {
  /**
    * Specifies the units for measuring distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2). If the unit is not specified the units are derived from the spatial reference. For a list of valid units, see [esriSRUnitType Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnitType_Constants/000w00000042000000/) and [esriSRUnit2Type Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnit2Type_Constants/000w00000041000000/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#distanceUnit)
    */
  var distanceUnit: js.UndefOr[feet | kilometers | meters | miles | `nautical-miles` | yards] = js.undefined
  /**
    * When `true`, the geodesic distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2) is measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  /**
    * The geometry from which the distance is to be measured. The geometry can be a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), or a [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1)
    */
  var geometry1: js.UndefOr[GeometryProperties] = js.undefined
  /**
    * The geometry to which the distance is to be measured. The geometry can be a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), or a [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2)
    */
  var geometry2: js.UndefOr[GeometryProperties] = js.undefined
}

object DistanceParametersProperties {
  @scala.inline
  def apply(
    distanceUnit: feet | kilometers | meters | miles | `nautical-miles` | yards = null,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    geometry1: GeometryProperties = null,
    geometry2: GeometryProperties = null
  ): DistanceParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (distanceUnit != null) __obj.updateDynamic("distanceUnit")(distanceUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic)
    if (geometry1 != null) __obj.updateDynamic("geometry1")(geometry1)
    if (geometry2 != null) __obj.updateDynamic("geometry2")(geometry2)
    __obj.asInstanceOf[DistanceParametersProperties]
  }
}

