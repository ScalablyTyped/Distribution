package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DensifyParametersProperties extends js.Object {
  /**
    * If `true`, Geographic Coordinate System spatial references are used or densify geodesic will be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  /**
    * The array of geometries to be densified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  /**
    * The length unit of `maxSegmentLength`. For a list of valid units, see [esriSRUnitType Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnitType_Constants/000w00000042000000/) and [esriSRUnit2Type Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnit2Type_Constants/000w00000041000000/).  **Possible Values:** feet | kilometers | meters | miles | nautical-miles | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[String] = js.undefined
  /**
    * All segments longer than `maxSegmentLength` are replaced with sequences of lines no longer than `maxSegmentLength.`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#maxSegmentLength)
    */
  var maxSegmentLength: js.UndefOr[Double] = js.undefined
}

object DensifyParametersProperties {
  @scala.inline
  def apply(
    geodesic: js.UndefOr[Boolean] = js.undefined,
    geometries: js.Array[GeometryProperties] = null,
    lengthUnit: String = null,
    maxSegmentLength: Int | Double = null
  ): DensifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic)
    if (geometries != null) __obj.updateDynamic("geometries")(geometries)
    if (lengthUnit != null) __obj.updateDynamic("lengthUnit")(lengthUnit)
    if (maxSegmentLength != null) __obj.updateDynamic("maxSegmentLength")(maxSegmentLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[DensifyParametersProperties]
  }
}

