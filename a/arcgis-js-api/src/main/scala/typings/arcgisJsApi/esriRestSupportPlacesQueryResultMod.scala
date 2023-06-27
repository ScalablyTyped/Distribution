package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PlacesQueryResult
import typings.arcgisJsApi.esri.PlacesQueryResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportPlacesQueryResultMod {
  
  @JSImport("esri/rest/support/PlacesQueryResult", JSImport.Namespace)
  @js.native
  /**
  		 * The `PlacesQueryResult` object includes the results from the [queryPlacesNearPoint()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesNearPoint) and [queryPlacesWithinExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesWithinExtent) methods.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html)
  		 */
  open class ^ ()
    extends StObject
       with PlacesQueryResult {
    def this(properties: PlacesQueryResultProperties) = this()
  }
}
