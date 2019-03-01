package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationQueryResult
  extends stdLib.Object {
  /**
    * The geometry with sampled z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var geometry: Point | Multipoint | Polyline
  /**
    * The value used when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var noDataValue: scala.Double
  /**
    * Contains additional information about how the geometry was sampled. This property is present depending on whether the user set `options.returnSampleInfo = true`, for each coordinate in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var sampleInfo: js.UndefOr[js.Array[ElevationQueryResultSampleInfo]] = js.undefined
}

object ElevationQueryResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: Point | Multipoint | Polyline,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    noDataValue: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sampleInfo: js.Array[ElevationQueryResultSampleInfo] = null
  ): ElevationQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("noDataValue")(noDataValue)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (sampleInfo != null) __obj.updateDynamic("sampleInfo")(sampleInfo)
    __obj.asInstanceOf[ElevationQueryResult]
  }
}

