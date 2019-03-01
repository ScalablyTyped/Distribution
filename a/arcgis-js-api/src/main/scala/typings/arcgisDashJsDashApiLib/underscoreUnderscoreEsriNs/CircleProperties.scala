package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var geodesic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This value defines the number of points along the curve of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#numberOfPoints)
    *
    * @default 60
    */
  var numberOfPoints: js.UndefOr[scala.Double] = js.undefined
  /**
    * The radius of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radius)
    *
    * @default 1000
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unit of the radius.  **Possible Values:** feet | kilometers | meters | miles | nautical-miles | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radiusUnit)
    *
    * @default meters
    */
  var radiusUnit: js.UndefOr[java.lang.String] = js.undefined
}

object CircleProperties {
  @scala.inline
  def apply(
    center: PointProperties = null,
    centroid: PointProperties = null,
    geodesic: js.UndefOr[scala.Boolean] = js.undefined,
    hasM: js.UndefOr[scala.Boolean] = js.undefined,
    hasZ: js.UndefOr[scala.Boolean] = js.undefined,
    isSelfIntersecting: js.UndefOr[scala.Boolean] = js.undefined,
    numberOfPoints: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    radiusUnit: java.lang.String = null,
    rings: js.Array[js.Array[js.Array[scala.Double]]] = null,
    spatialReference: SpatialReferenceProperties = null
  ): CircleProperties = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (centroid != null) __obj.updateDynamic("centroid")(centroid)
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic)
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (!js.isUndefined(isSelfIntersecting)) __obj.updateDynamic("isSelfIntersecting")(isSelfIntersecting)
    if (numberOfPoints != null) __obj.updateDynamic("numberOfPoints")(numberOfPoints.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusUnit != null) __obj.updateDynamic("radiusUnit")(radiusUnit)
    if (rings != null) __obj.updateDynamic("rings")(rings)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[CircleProperties]
  }
}

