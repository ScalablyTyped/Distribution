package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkValidateTopologyProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * Specifies the extent of the validation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology.html#extentToValidate)
  		 */
  var extentToValidate: js.UndefOr[String] = js.undefined
  
  /**
  		 * Determines the utility network to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology.html#utilityNetwork)
  		 */
  var utilityNetwork: js.UndefOr[UtilityNetworkProperties] = js.undefined
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology.html#view)
  		 */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkValidateTopology.html#viewModel)
  		 */
  var viewModel: js.UndefOr[UtilityNetworkValidateTopologyViewModel] = js.undefined
}
object UtilityNetworkValidateTopologyProperties {
  
  inline def apply(): UtilityNetworkValidateTopologyProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilityNetworkValidateTopologyProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkValidateTopologyProperties] (val x: Self) extends AnyVal {
    
    inline def setExtentToValidate(value: String): Self = StObject.set(x, "extentToValidate", value.asInstanceOf[js.Any])
    
    inline def setExtentToValidateUndefined: Self = StObject.set(x, "extentToValidate", js.undefined)
    
    inline def setUtilityNetwork(value: UtilityNetworkProperties): Self = StObject.set(x, "utilityNetwork", value.asInstanceOf[js.Any])
    
    inline def setUtilityNetworkUndefined: Self = StObject.set(x, "utilityNetwork", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: UtilityNetworkValidateTopologyViewModel): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
