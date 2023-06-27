package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * A convenience module for importing [locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html) functions when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/typescript-setup/).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html)
	 */
@js.native
trait locator extends StObject {
  
  /**
  		 * Sends a request to the ArcGIS REST geocode resource to find candidates for a single address specified in the address parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  def addressToLocations(url: String, params: locatorAddressToLocationsParams): js.Promise[js.Array[AddressCandidate]] = js.native
  def addressToLocations(url: String, params: locatorAddressToLocationsParams, requestOptions: Any): js.Promise[js.Array[AddressCandidate]] = js.native
  
  /**
  		 * Find address candidates for multiple input addresses.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressesToLocations)
  		 */
  def addressesToLocations(url: String, params: locatorAddressesToLocationsParams): js.Promise[js.Array[AddressCandidate]] = js.native
  def addressesToLocations(url: String, params: locatorAddressesToLocationsParams, requestOptions: Any): js.Promise[js.Array[AddressCandidate]] = js.native
  
  /**
  		 * Locates an address based on a given point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#locationToAddress)
  		 */
  def locationToAddress(url: String, params: locatorLocationToAddressParams): js.Promise[AddressCandidate] = js.native
  def locationToAddress(url: String, params: locatorLocationToAddressParams, requestOptions: Any): js.Promise[AddressCandidate] = js.native
  
  /**
  		 * Get character by character auto complete suggestions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#suggestLocations)
  		 */
  def suggestLocations(url: String, params: locatorSuggestLocationsParams): js.Promise[js.Array[SuggestionResult]] = js.native
  def suggestLocations(url: String, params: locatorSuggestLocationsParams, requestOptions: Any): js.Promise[js.Array[SuggestionResult]] = js.native
}
