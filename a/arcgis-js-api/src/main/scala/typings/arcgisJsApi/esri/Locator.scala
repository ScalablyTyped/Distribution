package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locator extends Task {
  
  /**
    * Sends a request to the ArcGIS REST geocode resource to find candidates for a single address specified in the address parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  def addressToLocations(params: LocatorAddressToLocationsParams): js.Promise[js.Array[AddressCandidate]] = js.native
  def addressToLocations(params: LocatorAddressToLocationsParams, requestOptions: js.Any): js.Promise[js.Array[AddressCandidate]] = js.native
  
  /**
    * Find address candidates for multiple input addresses.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    */
  def addressesToLocations(params: LocatorAddressesToLocationsParams): js.Promise[js.Array[AddressCandidate]] = js.native
  def addressesToLocations(params: LocatorAddressesToLocationsParams, requestOptions: js.Any): js.Promise[js.Array[AddressCandidate]] = js.native
  
  /**
    * Locates an address based on a given point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#locationToAddress)
    */
  def locationToAddress(params: LocatorLocationToAddressParams): js.Promise[AddressCandidate] = js.native
  def locationToAddress(params: LocatorLocationToAddressParams, requestOptions: js.Any): js.Promise[AddressCandidate] = js.native
  
  /**
    * The spatial reference of the output geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  /**
    * Get character by character auto complete suggestions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    */
  def suggestLocations(params: LocatorSuggestLocationsParams): js.Promise[js.Array[SuggestionResult]] = js.native
  def suggestLocations(params: LocatorSuggestLocationsParams, requestOptions: js.Any): js.Promise[js.Array[SuggestionResult]] = js.native
}
