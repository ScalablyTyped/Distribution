package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilityNetworkValidateTopology
  extends StObject
     with Widget_ {
  
  /**
  		 * Specifies the extent of the validation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology.html#extentToValidate)
  		 */
  var extentToValidate: String = js.native
  
  /**
  		 * Determines the utility network to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology.html#utilityNetwork)
  		 */
  var utilityNetwork: UtilityNetwork = js.native
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology.html#view)
  		 */
  var view: MapView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology.html#viewModel)
  		 */
  var viewModel: UtilityNetworkValidateTopologyViewModel = js.native
}
