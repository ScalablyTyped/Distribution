package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.executing
import typings.arcgisJsApi.arcgisJsApiStrings.failed
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkValidateTopologyViewModel extends StObject {
  
  /**
  		 * If the validation process fails, this property returns an error message.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#executionError)
  		 */
  val executionError: String
  
  /**
  		 * Specifies the extent of the validation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#extentToValidate)
  		 */
  var extentToValidate: String
  
  /**
  		 * If an error occurs during during validation a loadError wil be displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#loadErrors)
  		 */
  var loadErrors: Any
  
  /**
  		 * The view model's state.
  		 *
  		 * @default ready
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#state)
  		 */
  val state: disabled | executing | failed | loading | ready | success
  
  /**
  		 * Determines the utility network to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#utilityNetwork)
  		 */
  var utilityNetwork: UtilityNetwork
  
  /**
  		 * Validates the network topology of the [utility network](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#utilityNetwork).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#validateTopology)
  		 */
  def validateTopology(): scala.Unit
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#view)
  		 */
  var view: MapView
}
object UtilityNetworkValidateTopologyViewModel {
  
  inline def apply(
    executionError: String,
    extentToValidate: String,
    loadErrors: Any,
    state: disabled | executing | failed | loading | ready | success,
    utilityNetwork: UtilityNetwork,
    validateTopology: () => scala.Unit,
    view: MapView
  ): UtilityNetworkValidateTopologyViewModel = {
    val __obj = js.Dynamic.literal(executionError = executionError.asInstanceOf[js.Any], extentToValidate = extentToValidate.asInstanceOf[js.Any], loadErrors = loadErrors.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], utilityNetwork = utilityNetwork.asInstanceOf[js.Any], validateTopology = js.Any.fromFunction0(validateTopology), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilityNetworkValidateTopologyViewModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkValidateTopologyViewModel] (val x: Self) extends AnyVal {
    
    inline def setExecutionError(value: String): Self = StObject.set(x, "executionError", value.asInstanceOf[js.Any])
    
    inline def setExtentToValidate(value: String): Self = StObject.set(x, "extentToValidate", value.asInstanceOf[js.Any])
    
    inline def setLoadErrors(value: Any): Self = StObject.set(x, "loadErrors", value.asInstanceOf[js.Any])
    
    inline def setState(value: disabled | executing | failed | loading | ready | success): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUtilityNetwork(value: UtilityNetwork): Self = StObject.set(x, "utilityNetwork", value.asInstanceOf[js.Any])
    
    inline def setValidateTopology(value: () => scala.Unit): Self = StObject.set(x, "validateTopology", js.Any.fromFunction0(value))
    
    inline def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
