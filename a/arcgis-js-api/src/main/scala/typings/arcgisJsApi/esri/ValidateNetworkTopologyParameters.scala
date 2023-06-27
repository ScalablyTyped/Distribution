package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`force-rebuild`
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.rebuild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateNetworkTopologyParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Specifies the geodatabase version name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#gdbVersion)
  		 */
  var gdbVersion: String = js.native
  
  /**
  		 * Specifies the GUID used to lock the version.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#sessionID)
  		 */
  var sessionID: String = js.native
  
  /**
  		 * Specifies the envelope of the area to validate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#validateArea)
  		 */
  var validateArea: Extent = js.native
  
  /**
  		 * Specifies the set of features and objects to validate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#validationSet)
  		 */
  var validationSet: js.Array[ValidationSetItemJSON] = js.native
  
  /**
  		 * Specifies the validation to perform.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#validationType)
  		 */
  var validationType: normal | rebuild | `force-rebuild` = js.native
}
