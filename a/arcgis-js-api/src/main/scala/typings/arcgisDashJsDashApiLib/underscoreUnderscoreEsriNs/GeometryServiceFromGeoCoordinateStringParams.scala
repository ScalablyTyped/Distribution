package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryServiceFromGeoCoordinateStringParams
  extends stdLib.Object {
  /**
    * Conversion options for mrgs, utm and gars conversion types. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/from-geocoordinatestring.htm) for possible values and their descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The conversion type of the input strings.  **Possible Values:** mrgs | usng | utm | geo-ref | gars | dms | ddm | dd
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    *
    * @default mrgs
    */
  var conversionType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The spatial reference or well-known ID to convert the input string coordinates to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var sr: SpatialReference | java.lang.String | scala.Double
  /**
    * An array of formatted strings as specified by `conversionType`. Example: `["01N AA 66021 00000" , "11S NT 00000 62155" , "31U BT 94071 65288"]`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var strings: js.Array[java.lang.String]
}

object GeometryServiceFromGeoCoordinateStringParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sr: SpatialReference | java.lang.String | scala.Double,
    strings: js.Array[java.lang.String],
    conversionMode: java.lang.String = null,
    conversionType: java.lang.String = null
  ): GeometryServiceFromGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, sr = sr.asInstanceOf[js.Any], strings = strings)
    if (conversionMode != null) __obj.updateDynamic("conversionMode")(conversionMode)
    if (conversionType != null) __obj.updateDynamic("conversionType")(conversionType)
    __obj.asInstanceOf[GeometryServiceFromGeoCoordinateStringParams]
  }
}

