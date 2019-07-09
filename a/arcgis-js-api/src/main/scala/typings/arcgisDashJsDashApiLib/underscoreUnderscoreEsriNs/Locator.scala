package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locator extends Task {
  /**
    * The spatial reference of the output geometries. If not specified, the output geometries are in the spatial reference of the input geometries when performing a reverse geocode and in the default spatial reference returned by the service if finding locations by address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  /**
    * Sends a request to the ArcGIS REST geocode resource to find candidates for a single address specified in the address parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    *
    * @param params Specify at least the `address` and optionally other properties. See the object specifications table below.
    * @param params.address visit the ArcGIS Online Geocoding Service help for more details on the World Geocoder.
    * The address argument is data object that contains properties representing the various address fields accepted by the corresponding geocode service. These fields are listed in the addressFields property of the associated geocode service resource. For example, if the *addressFields* of a geocode service resource includes fields with the following names: Street, City, State and Zone, then the address argument is of the form:
    * ```js
    * {
    *   Street: "1234 W Main St",
    *   City: "Small Town",
    *   State: "WA",
    *   Zone: "99027"
    * }
    * ```
    *
    * Locators published using ArcGIS 10 or later support a single line address field, which
    * can be specified using the following syntax where field_name is the name of the single
    * line address field. You can find this name by viewing the help or services directory for
    * your locator services. Common values are *SingleLine* and *SingleLineFieldName*:
    *
    * ```js
    * var address = { "field_name": "380 New York St, Redlands, CA 92373" };
    * ```
    * The Services Directory can be used to find out the required and optional address fields
    * and the correct names for the input name fields. If you are using the World Geocoding Service
    * @param params.categories Limit result to one or more categories. For example, "Populated Place" or "Scandinavian Food". Only applies to the World Geocode Service. See [Category filtering (World Geocoding Service)](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm#ESRI_SECTION1_502B3FE2028145D7B189C25B1A00E17B) for more information.
    * @param params.countryCode Limit result to a specific country. For example, "US" for United States or "SE" for Sweden. Only applies to the World Geocode Service. See Geocode coverage (World Geocoding Service) for more information.
    * @param params.forStorage Allows the results of single geocode transactions to be persisted.
    * @param params.location Used to weight returned results for a specified area.
    * @param params.locationType Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    * @param params.magicKey A `suggestLocations` result ID (magicKey). Used to query for a specific results information.
    * @param params.maxLocations Maximum results to return from the query.
    * @param params.outFields The list of fields included in the returned result set. This list is a comma delimited list of field names. If you specify the shape field in the list of return fields, it is ignored. For non-intersection addresses you can specify the candidate fields as defined in the geocode service. For intersection addresses you can specify the intersection candidate fields.
    * @param params.searchExtent Defines the extent within which the geocode server will search. Requires ArcGIS Server version 10.1 or greater.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override `requestOptions` defined during construction).
    *
    */
  def addressToLocations(params: LocatorAddressToLocationsParams): arcgisDashJsDashApiLib.IPromise[js.Array[AddressCandidate]] = js.native
  def addressToLocations(params: LocatorAddressToLocationsParams, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[js.Array[AddressCandidate]] = js.native
  /**
    * Find address candidates for multiple input addresses. This method requires an ArcGIS Server 10.1 or greater geocode service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    *
    * @param params See specifications below.
    * @param params.addresses ```
    * The input addresses in the format supported by the geocode service. If the service supports 'Single Line Input' the input addresses will be in the following format:
    * ```js
    * {
    *   "OBJECTID": 0,
    *   "Single Line Input":"77 Main St, Plymouth, NH 03264"
    * }
    * @param params.countryCode Limits the results to only search in the country provided. For example `US` for United States or `SE` for Sweden. Only applies to the World Geocode Service. See the [World Geocoding Service documentation](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm) for more information.
    * @param params.categories Limit result to one or more categories. For example, "Populated Place" or "Scandinavian Food". Only applies to the World Geocode Service. See [Category filtering (World Geocoding Service)](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm#ESRI_SECTION1_502B3FE2028145D7B189C25B1A00E17B) for more information.
    * @param params.locationType Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def addressesToLocations(params: LocatorAddressesToLocationsParams): arcgisDashJsDashApiLib.IPromise[js.Array[AddressCandidate]] = js.native
  def addressesToLocations(params: LocatorAddressesToLocationsParams, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[js.Array[AddressCandidate]] = js.native
  /**
    * Locates an address based on a given point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#locationToAddress)
    *
    * @param params Specify at least the `location` and optionally the `locationType`.
    * @param params.location The point at which to search for the closest address. The location should be in the same spatial reference as that of the geocode service.
    * @param params.locationType Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def locationToAddress(params: LocatorLocationToAddressParams): arcgisDashJsDashApiLib.IPromise[AddressCandidate] = js.native
  def locationToAddress(params: LocatorLocationToAddressParams, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[AddressCandidate] = js.native
  /**
    * Get character by character auto complete suggestions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    *
    * @param params An object that defines suggest parameters. See specifications below.
    * @param params.categories A place or address type which can be used to filter suggest results. The parameter supports input of single category values or multiple comma-separated values.
    * @param params.location Defines a normalized location point that is used to sort geocoding candidates based upon their proximity to the given location.
    * @param params.text The input text entered by a user which is used by the suggest operation to generate a list of possible matches.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def suggestLocations(params: LocatorSuggestLocationsParams): arcgisDashJsDashApiLib.IPromise[js.Array[SuggestionResult]] = js.native
  def suggestLocations(params: LocatorSuggestLocationsParams, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[js.Array[SuggestionResult]] = js.native
}

@JSGlobal("__esri.Locator")
@js.native
/**
  * Represents a geocode service resource exposed by the ArcGIS Server REST API. It is used to generate candidates for an address. It is also used to generate batch results for a set of addresses.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html)
  */
class LocatorCls () extends Locator {
  def this(properties: LocatorProperties) = this()
}

