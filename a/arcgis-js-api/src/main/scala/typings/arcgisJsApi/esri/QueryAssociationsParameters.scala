package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryAssociationsParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The [NetworkElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html) for which the association is queried.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#elements)
  		 */
  var elements: js.Array[NetworkElement] = js.native
  
  /**
  		 * The geodatabase version to execute the function against.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#gdbVersion)
  		 */
  var gdbVersion: String = js.native
  
  /**
  		 * The date/timestamp (in UTC) to execute the function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#moment)
  		 */
  var moment: js.Date = js.native
  
  /**
  		 * Specifies whether to return logically deleted associations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#returnDeletes)
  		 */
  var returnDeletes: Boolean = js.native
  
  /**
  		 * Specifies an array of [Association](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) types to be queried.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#types)
  		 */
  var types: js.Array[String] = js.native
}
