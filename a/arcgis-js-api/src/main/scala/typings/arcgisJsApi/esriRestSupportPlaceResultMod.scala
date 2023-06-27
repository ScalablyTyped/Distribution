package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PlaceResult
import typings.arcgisJsApi.esri.PlaceResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportPlaceResultMod {
  
  @JSImport("esri/rest/support/PlaceResult", JSImport.Namespace)
  @js.native
  /**
  		 * The `PlaceResult` object includes a single place that satisfies the search and either: the distance from the [search point](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#point) in meters, or falls within the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#extent) of the search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html)
  		 */
  open class ^ ()
    extends StObject
       with PlaceResult {
    def this(properties: PlaceResultProperties) = this()
  }
}
