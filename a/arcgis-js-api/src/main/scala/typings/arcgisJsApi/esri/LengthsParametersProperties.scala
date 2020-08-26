package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`preserve-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import typings.arcgisJsApi.arcgisJsApiStrings.planar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LengthsParametersProperties extends js.Object {
  /**
    * Defines the type of calculation for the geometry. The type can be one of the following:
    *
    * Value | Description
    * ---------------|---------------
    * planar | Planar measurements use 2D Cartesian mathematics to calculate length. Use this type if the length needs to be calculated in the input spatial reference otherwise use `preserve-shape`.
    * geodesic | Use this type to calculate an area or length using only the vertices of the polygon to define the lines connecting the vertices as geodesic segments independent of the actual shape of the polygon. **Note:** a geodesic segment is the shortest path between two points on an ellipsoid.
    * preserve-shape | Calculate the area or length of the geometry on the surface of the Earth ellipsoid, for geometries defined in a projected or geographic coordinate system. This method preserves the shape of the geometry in its coordinate system which means the true area or length will be calculated for the geometry that is displayed on the map.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LengthsParameters.html#calculationType)
    */
  var calculationType: js.UndefOr[planar | geodesic | `preserve-shape`] = js.native
  /**
    * If polylines are in a geographic coordinate system, then geodesic needs to be set to `true` in order to calculate the ellipsoidal shortest path distance between each pair of the vertices in the polylines. If `lengthUnit` is not specified, the output is returned in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LengthsParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  /**
    * The length unit in which perimeters of polygons will be calculated. For a list of valid units, see [linear unit codes](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LengthsParameters.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[Double | String] = js.native
  /**
    * The array of polylines whose lengths are to be computed. The structure of each polyline in the array is same as the structure of the JSON polyline objects returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LengthsParameters.html#polylines)
    */
  var polylines: js.UndefOr[js.Array[PolylineProperties]] = js.native
}

object LengthsParametersProperties {
  @scala.inline
  def apply(): LengthsParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthsParametersProperties]
  }
  @scala.inline
  implicit class LengthsParametersPropertiesOps[Self <: LengthsParametersProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalculationType(value: planar | geodesic | `preserve-shape`): Self = this.set("calculationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculationType: Self = this.set("calculationType", js.undefined)
    @scala.inline
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeodesic: Self = this.set("geodesic", js.undefined)
    @scala.inline
    def setLengthUnit(value: Double | String): Self = this.set("lengthUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthUnit: Self = this.set("lengthUnit", js.undefined)
    @scala.inline
    def setPolylinesVarargs(value: PolylineProperties*): Self = this.set("polylines", js.Array(value :_*))
    @scala.inline
    def setPolylines(value: js.Array[PolylineProperties]): Self = this.set("polylines", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolylines: Self = this.set("polylines", js.undefined)
  }
  
}

