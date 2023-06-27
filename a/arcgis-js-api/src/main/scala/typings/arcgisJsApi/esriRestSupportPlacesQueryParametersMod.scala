package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PlacesQueryParameters
import typings.arcgisJsApi.esri.PlacesQueryParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportPlacesQueryParametersMod {
  
  @JSImport("esri/rest/support/PlacesQueryParameters", JSImport.Namespace)
  @js.native
  /**
  		 * The following properties define the parameters for the [queryPlacesNearPoint()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesNearPoint) and [queryPlacesWithinExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesWithinExtent) methods pointing to a [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html#url) that represents a places service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with PlacesQueryParameters {
    def this(properties: PlacesQueryParametersProperties) = this()
  }
}
