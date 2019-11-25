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

trait CircleProperties extends PolygonProperties {
  /**
    * The center point of the circle. The center must be specified either as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) or an array of longitude/latitude coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#center)
    */
  var center: js.UndefOr[PointProperties] = js.undefined
  /**
    * Applicable when the spatial reference of the center point is either set to Web Mercator (wkid: 3857) or geographic/geodesic (wkid: 4326). When  either of those spatial references is used, set geodesic to `true` to minimize distortion. Other coordinate systems will not create geodesic circles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#geodesic)
    *
    * @default false
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  /**
    * This value defines the number of points along the curve of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#numberOfPoints)
    *
    * @default 60
    */
  var numberOfPoints: js.UndefOr[Double] = js.undefined
  /**
    * The radius of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radius)
    *
    * @default 1000
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * Unit of the radius.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radiusUnit)
    *
    * @default meters
    */
  var radiusUnit: js.UndefOr[feet | kilometers | meters | miles | `nautical-miles` | yards] = js.undefined
}

object CircleProperties {
  @scala.inline
  def apply(
    center: PointProperties = null,
    centroid: PointProperties = null,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    isSelfIntersecting: js.UndefOr[Boolean] = js.undefined,
    numberOfPoints: Int | Double = null,
    radius: Int | Double = null,
    radiusUnit: feet | kilometers | meters | miles | `nautical-miles` | yards = null,
    rings: js.Array[js.Array[js.Array[Double]]] = null,
    spatialReference: SpatialReferenceProperties = null
  ): CircleProperties = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (centroid != null) __obj.updateDynamic("centroid")(centroid.asInstanceOf[js.Any])
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic.asInstanceOf[js.Any])
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelfIntersecting)) __obj.updateDynamic("isSelfIntersecting")(isSelfIntersecting.asInstanceOf[js.Any])
    if (numberOfPoints != null) __obj.updateDynamic("numberOfPoints")(numberOfPoints.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusUnit != null) __obj.updateDynamic("radiusUnit")(radiusUnit.asInstanceOf[js.Any])
    if (rings != null) __obj.updateDynamic("rings")(rings.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleProperties]
  }
}

