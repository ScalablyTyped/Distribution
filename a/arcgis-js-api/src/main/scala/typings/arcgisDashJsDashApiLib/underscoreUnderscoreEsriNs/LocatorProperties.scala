package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorProperties extends TaskProperties {
  /**
    * Limit the results to one or more categories. For example "Populated Place" or "airport". Only applicable when using the World Geocode Service. View the [World Geocoding Service documentation](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#categories)
    */
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Limits the results to only search in the country provided. For example `US` for United States or `SE` for Sweden. Only applies to the World Geocode Service. See the [World Geocoding Service documentation](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#countryCode)
    */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The spatial reference of the output geometries. If not specified, the output geometries are in the spatial reference of the input geometries when performing a reverse geocode and in the default spatial reference returned by the service if finding locations by address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
}

object LocatorProperties {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String] = null,
    countryCode: java.lang.String = null,
    outSpatialReference: SpatialReferenceProperties = null,
    requestOptions: js.Any = null,
    url: java.lang.String = null
  ): LocatorProperties = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LocatorProperties]
  }
}

