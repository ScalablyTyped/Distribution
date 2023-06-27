package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkAssociationsViewModelProperties extends StObject {
  
  /**
  		 * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) used for representing the polyline geometry that is being drawn for connectivity associations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#connectivityAssociationsLineSymbol)
  		 */
  var connectivityAssociationsLineSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
  		 * Indicates whether to query and display connectivity associations.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#includeConnectivityAssociations)
  		 */
  var includeConnectivityAssociations: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to query and display structural attachment associations.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#includeStructuralAttachmentAssociations)
  		 */
  var includeStructuralAttachmentAssociations: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The maximum number of associations that can be returned from the server.
  		 *
  		 * @default 250
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#maxAllowableAssociations)
  		 */
  var maxAllowableAssociations: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether to show arrows for connectivity associations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#showArrowsConnectivity)
  		 */
  var showArrowsConnectivity: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to show arrows for structural attachment associations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#showArrowsStructuralAttachment)
  		 */
  var showArrowsStructuralAttachment: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) used for representing the polyline geometry that is being drawn for structural attachment associations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#structuralAttachmentAssociationsLineSymbol)
  		 */
  var structuralAttachmentAssociationsLineSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
  		 * Determines the utility network to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#utilityNetwork)
  		 */
  var utilityNetwork: js.UndefOr[UtilityNetworkProperties] = js.undefined
  
  /**
  		 * The view associated with the UtilityNetworkAssociations widget instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object UtilityNetworkAssociationsViewModelProperties {
  
  inline def apply(): UtilityNetworkAssociationsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilityNetworkAssociationsViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkAssociationsViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setConnectivityAssociationsLineSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "connectivityAssociationsLineSymbol", value.asInstanceOf[js.Any])
    
    inline def setConnectivityAssociationsLineSymbolUndefined: Self = StObject.set(x, "connectivityAssociationsLineSymbol", js.undefined)
    
    inline def setIncludeConnectivityAssociations(value: Boolean): Self = StObject.set(x, "includeConnectivityAssociations", value.asInstanceOf[js.Any])
    
    inline def setIncludeConnectivityAssociationsUndefined: Self = StObject.set(x, "includeConnectivityAssociations", js.undefined)
    
    inline def setIncludeStructuralAttachmentAssociations(value: Boolean): Self = StObject.set(x, "includeStructuralAttachmentAssociations", value.asInstanceOf[js.Any])
    
    inline def setIncludeStructuralAttachmentAssociationsUndefined: Self = StObject.set(x, "includeStructuralAttachmentAssociations", js.undefined)
    
    inline def setMaxAllowableAssociations(value: Double): Self = StObject.set(x, "maxAllowableAssociations", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableAssociationsUndefined: Self = StObject.set(x, "maxAllowableAssociations", js.undefined)
    
    inline def setShowArrowsConnectivity(value: Boolean): Self = StObject.set(x, "showArrowsConnectivity", value.asInstanceOf[js.Any])
    
    inline def setShowArrowsConnectivityUndefined: Self = StObject.set(x, "showArrowsConnectivity", js.undefined)
    
    inline def setShowArrowsStructuralAttachment(value: Boolean): Self = StObject.set(x, "showArrowsStructuralAttachment", value.asInstanceOf[js.Any])
    
    inline def setShowArrowsStructuralAttachmentUndefined: Self = StObject.set(x, "showArrowsStructuralAttachment", js.undefined)
    
    inline def setStructuralAttachmentAssociationsLineSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "structuralAttachmentAssociationsLineSymbol", value.asInstanceOf[js.Any])
    
    inline def setStructuralAttachmentAssociationsLineSymbolUndefined: Self = StObject.set(x, "structuralAttachmentAssociationsLineSymbol", js.undefined)
    
    inline def setUtilityNetwork(value: UtilityNetworkProperties): Self = StObject.set(x, "utilityNetwork", value.asInstanceOf[js.Any])
    
    inline def setUtilityNetworkUndefined: Self = StObject.set(x, "utilityNetwork", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
