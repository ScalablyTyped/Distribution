package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryServiceToGeoCoordinateStringParams
  extends stdLib.Object {
  /**
    * If `true`, then spaces are added between components of the string. The `addSpaces` parameter applies only to conversion types `mgrs`, `usng` and `utm`. The default value for `mgrs` is `false` , while the default value for both `usng` and `utm` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var addSpaces: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Conversion options for mgrs and utm conversion types. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/to-geocoordinatestring.htm) for valid conversion modes and their descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The conversion type of the input strings.  **Possible values:** mgrs | usng | utm | geo-ref | gars | dms | ddm | dd
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var conversionType: java.lang.String
  /**
    * An array of XY-coordinates (in JSON format) to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var coordinates: js.Array[js.Array[scala.Double]]
  /**
    * The number of digits to output for each of the numerical portions in the string. The default value depends of `conversionType`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/from-geocoordinatestring.htm) for default values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var numOfDigits: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, then numeric portions of the string are rounded to the nearest whole magnitude as specified by `numOfDigits`. Otherwise, numeric portions of the string are truncated. The rounding parameter applies only to conversion types `mgrs`, `usng` and `geo-ref`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    *
    * @default true
    */
  var rounding: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The spatial reference (or WKID of the spatial reference) of the XY-coordinates to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var sr: SpatialReference | java.lang.String | scala.Double
}

object GeometryServiceToGeoCoordinateStringParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    conversionType: java.lang.String,
    coordinates: js.Array[js.Array[scala.Double]],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sr: SpatialReference | java.lang.String | scala.Double,
    addSpaces: js.UndefOr[scala.Boolean] = js.undefined,
    conversionMode: java.lang.String = null,
    numOfDigits: scala.Int | scala.Double = null,
    rounding: js.UndefOr[scala.Boolean] = js.undefined
  ): GeometryServiceToGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, conversionType = conversionType, coordinates = coordinates, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, sr = sr.asInstanceOf[js.Any])
    if (!js.isUndefined(addSpaces)) __obj.updateDynamic("addSpaces")(addSpaces)
    if (conversionMode != null) __obj.updateDynamic("conversionMode")(conversionMode)
    if (numOfDigits != null) __obj.updateDynamic("numOfDigits")(numOfDigits.asInstanceOf[js.Any])
    if (!js.isUndefined(rounding)) __obj.updateDynamic("rounding")(rounding)
    __obj.asInstanceOf[GeometryServiceToGeoCoordinateStringParams]
  }
}

