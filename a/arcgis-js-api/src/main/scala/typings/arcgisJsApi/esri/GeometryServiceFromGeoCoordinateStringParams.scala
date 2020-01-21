package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`geo-ref`
import typings.arcgisJsApi.arcgisJsApiStrings.dd
import typings.arcgisJsApi.arcgisJsApiStrings.ddm
import typings.arcgisJsApi.arcgisJsApiStrings.dms
import typings.arcgisJsApi.arcgisJsApiStrings.gars
import typings.arcgisJsApi.arcgisJsApiStrings.mrgs
import typings.arcgisJsApi.arcgisJsApiStrings.usng
import typings.arcgisJsApi.arcgisJsApiStrings.utm
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryServiceFromGeoCoordinateStringParams extends Object {
  /**
    * Conversion options for mrgs, utm and gars conversion types. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/from-geocoordinatestring.htm) for possible values and their descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[String] = js.undefined
  /**
    * The conversion type of the input strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    *
    * @default mrgs
    */
  var conversionType: js.UndefOr[mrgs | usng | utm | `geo-ref` | gars | dms | ddm | dd] = js.undefined
  /**
    * The spatial reference or well-known ID to convert the input string coordinates to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var sr: SpatialReference | String | Double
  /**
    * An array of formatted strings as specified by `conversionType`. Example: `["01N AA 66021 00000" , "11S NT 00000 62155" , "31U BT 94071 65288"]`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var strings: js.Array[String]
}

object GeometryServiceFromGeoCoordinateStringParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    sr: SpatialReference | String | Double,
    strings: js.Array[String],
    conversionMode: String = null,
    conversionType: mrgs | usng | utm | `geo-ref` | gars | dms | ddm | dd = null
  ): GeometryServiceFromGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sr = sr.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    if (conversionMode != null) __obj.updateDynamic("conversionMode")(conversionMode.asInstanceOf[js.Any])
    if (conversionType != null) __obj.updateDynamic("conversionType")(conversionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryServiceFromGeoCoordinateStringParams]
  }
}

