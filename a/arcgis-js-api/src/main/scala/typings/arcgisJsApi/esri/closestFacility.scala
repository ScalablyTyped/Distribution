package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Helps you find closest facilities around any location (incident) on a network.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-closestFacility.html)
	 */
@js.native
trait closestFacility extends StObject {
  
  /**
  		 * Solves the closest facility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-closestFacility.html#solve)
  		 */
  def solve(url: String, params: ClosestFacilityParameters): js.Promise[ClosestFacilitySolveResult] = js.native
  def solve(url: String, params: ClosestFacilityParameters, requestOptions: Any): js.Promise[ClosestFacilitySolveResult] = js.native
}
