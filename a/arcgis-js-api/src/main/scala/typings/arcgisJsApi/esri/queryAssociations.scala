package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * The utility network associations model connectivity, containment, and structure relations between assets.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-queryAssociations.html)
	 */
@js.native
trait queryAssociations extends StObject {
  
  /**
  		 * Returns all associations filtered by the [QueryAssociationsParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html) in a utility network.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-queryAssociations.html#queryAssociations)
  		 */
  def queryAssociations(url: String, params: QueryAssociationsParameters): js.Promise[QueryAssociationsResult] = js.native
  def queryAssociations(url: String, params: QueryAssociationsParameters, requestOptions: Any): js.Promise[QueryAssociationsResult] = js.native
}
