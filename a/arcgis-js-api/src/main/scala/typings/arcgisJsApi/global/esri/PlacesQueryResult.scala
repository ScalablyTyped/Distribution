package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PlacesQueryResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PlacesQueryResult")
@js.native
/**
		 * The `PlacesQueryResult` object includes the results from the [queryPlacesNearPoint()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesNearPoint) and [queryPlacesWithinExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesWithinExtent) methods.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html)
		 */
open class PlacesQueryResult ()
  extends StObject
     with typings.arcgisJsApi.esri.PlacesQueryResult {
  def this(properties: PlacesQueryResultProperties) = this()
}
