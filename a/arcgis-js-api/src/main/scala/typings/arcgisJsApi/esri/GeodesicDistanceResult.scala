package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeodesicDistanceResult extends Object {
  /**
    * The azimuth (or "bearing") in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#GeodesicDistanceResult)
    */
  var azimuth: js.UndefOr[Double] = js.undefined
  /**
    * The distance between the two locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#GeodesicDistanceResult)
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * The azimuth in degrees in the reverse direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#GeodesicDistanceResult)
    */
  var reverseAzimuth: js.UndefOr[Double] = js.undefined
}

object GeodesicDistanceResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    azimuth: Int | Double = null,
    distance: Int | Double = null,
    reverseAzimuth: Int | Double = null
  ): GeodesicDistanceResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (azimuth != null) __obj.updateDynamic("azimuth")(azimuth.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (reverseAzimuth != null) __obj.updateDynamic("reverseAzimuth")(reverseAzimuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeodesicDistanceResult]
  }
}

