package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.executing
import typings.arcgisJsApi.arcgisJsApiStrings.failed
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.success
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.UtilityNetwork
import typings.arcgisJsApi.esri.UtilityNetworkValidateTopologyViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsUtilityNetworkValidateTopologyUtilityNetworkValidateTopologyViewModelMod {
  
  @JSImport("esri/widgets/UtilityNetworkValidateTopology/UtilityNetworkValidateTopologyViewModel", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with UtilityNetworkValidateTopologyViewModel {
    def this(properties: Any) = this()
    
    /**
    		 * If the validation process fails, this property returns an error message.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#executionError)
    		 */
    /* CompleteClass */
    override val executionError: String = js.native
    
    /**
    		 * Specifies the extent of the validation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#extentToValidate)
    		 */
    /* CompleteClass */
    var extentToValidate: String = js.native
    
    /**
    		 * If an error occurs during during validation a loadError wil be displayed.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#loadErrors)
    		 */
    /* CompleteClass */
    var loadErrors: Any = js.native
    
    /**
    		 * The view model's state.
    		 *
    		 * @default ready
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#state)
    		 */
    /* CompleteClass */
    override val state: disabled | executing | failed | loading | ready | success = js.native
    
    /**
    		 * Determines the utility network to use.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#utilityNetwork)
    		 */
    /* CompleteClass */
    var utilityNetwork: UtilityNetwork = js.native
    
    /**
    		 * Validates the network topology of the [utility network](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#utilityNetwork).
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#validateTopology)
    		 */
    /* CompleteClass */
    override def validateTopology(): Unit = js.native
    
    /**
    		 * The view from which the widget will operate.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology-UtilityNetworkValidateTopologyViewModel.html#view)
    		 */
    /* CompleteClass */
    var view: MapView = js.native
  }
}
