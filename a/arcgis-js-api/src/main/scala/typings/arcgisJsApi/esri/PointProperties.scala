package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointProperties extends GeometryProperties {
  /**
    * The latitude of the point. If the spatial reference is Web Mercator, the latitude will be given in WGS84. In any geographic spatial reference, the latitude will equal the [y](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#y) coordinate. In all other cases the latitude will be null.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#latitude)
    */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
    * The longitude of the point. If the spatial reference is Web Mercator, the longitude will be given in WGS84. In any geographic spatial reference, the longitude will equal the [x](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#x) coordinate. In all other cases the longitude will be null.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#longitude)
    */
  var longitude: js.UndefOr[Double] = js.undefined
  /**
    * The m-coordinate of the point in map units.
    * > **M-values** (measure) allow attribute values to be stored at the vertex of a point. A common usage for storing a measurement in the vertices along a linear feature are [linear referencing](https://desktop.arcgis.com/en/arcmap/latest/extensions/roads-and-highways/advanced-linear-referencing-multiple-linear-referencing-methods.htm) applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#m)
    *
    * @default undefined
    */
  var m: js.UndefOr[Double] = js.undefined
  /**
    * The x-coordinate (easting) of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#x)
    *
    * @default 0
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y-coordinate (northing) of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#y)
    *
    * @default 0
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * The z-coordinate (or elevation) of the point in map units.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#z)
    *
    * @default undefined
    */
  var z: js.UndefOr[Double] = js.undefined
}

object PointProperties {
  @scala.inline
  def apply(
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    m: js.UndefOr[Double] = js.undefined,
    spatialReference: SpatialReferenceProperties = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): PointProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.get.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointProperties]
  }
}

