package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkAssociationsProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * Indicates whether to show a toggle to automatically show associations every time the map extent changes, or an action button to show associations within the current map extent on demand.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#autoRefreshAssociations)
  		 */
  var autoRefreshAssociations: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) used for representing the polyline geometry that is being drawn for connectivity associations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#connectivityAssociationsLineSymbol)
  		 */
  var connectivityAssociationsLineSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
  		 * Indicates whether to query and display connectivity associations.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#includeConnectivityAssociations)
  		 */
  var includeConnectivityAssociations: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to query and display structural attachment associations.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#includeStructuralAttachmentAssociations)
  		 */
  var includeStructuralAttachmentAssociations: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The maximum number of associations that can be returned from the server.
  		 *
  		 * @default 250
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociations)
  		 */
  var maxAllowableAssociations: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The maximum value or upper bound of the Maximum allowable associations slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociationsSliderMax)
  		 */
  var maxAllowableAssociationsSliderMax: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum value or lower bound of the Maximum allowable associations slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociationsSliderMin)
  		 */
  var maxAllowableAssociationsSliderMin: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Specifies the interval to move the maximum allowable associations slider with the up, or down keys.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociationsSliderStep)
  		 */
  var maxAllowableAssociationsSliderStep: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether to show arrows for connectivity associations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#showArrowsConnectivity)
  		 */
  var showArrowsConnectivity: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to show arrows for structural attachment associations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#showArrowsStructuralAttachment)
  		 */
  var showArrowsStructuralAttachment: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When `autoRefreshAssociations` is `true`, indicates whether to automatically show associations every time the current map extent changes.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#showAssociationsEnabled)
  		 */
  var showAssociationsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) used for representing the polyline geometry that is being drawn for structural attachment associations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#structuralAttachmentAssociationsLineSymbol)
  		 */
  var structuralAttachmentAssociationsLineSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
  		 * Determines the utility network to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#utilityNetwork)
  		 */
  var utilityNetwork: js.UndefOr[UtilityNetworkProperties] = js.undefined
  
  /**
  		 * The view associated with the UtilityNetworkAssociations widget instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#view)
  		 */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#viewModel)
  		 */
  var viewModel: js.UndefOr[UtilityNetworkAssociationsViewModelProperties] = js.undefined
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#visibleElements)
  		 */
  var visibleElements: js.UndefOr[UtilityNetworkAssociationsVisibleElements] = js.undefined
}
object UtilityNetworkAssociationsProperties {
  
  inline def apply(): UtilityNetworkAssociationsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilityNetworkAssociationsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkAssociationsProperties] (val x: Self) extends AnyVal {
    
    inline def setAutoRefreshAssociations(value: Boolean): Self = StObject.set(x, "autoRefreshAssociations", value.asInstanceOf[js.Any])
    
    inline def setAutoRefreshAssociationsUndefined: Self = StObject.set(x, "autoRefreshAssociations", js.undefined)
    
    inline def setConnectivityAssociationsLineSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "connectivityAssociationsLineSymbol", value.asInstanceOf[js.Any])
    
    inline def setConnectivityAssociationsLineSymbolUndefined: Self = StObject.set(x, "connectivityAssociationsLineSymbol", js.undefined)
    
    inline def setIncludeConnectivityAssociations(value: Boolean): Self = StObject.set(x, "includeConnectivityAssociations", value.asInstanceOf[js.Any])
    
    inline def setIncludeConnectivityAssociationsUndefined: Self = StObject.set(x, "includeConnectivityAssociations", js.undefined)
    
    inline def setIncludeStructuralAttachmentAssociations(value: Boolean): Self = StObject.set(x, "includeStructuralAttachmentAssociations", value.asInstanceOf[js.Any])
    
    inline def setIncludeStructuralAttachmentAssociationsUndefined: Self = StObject.set(x, "includeStructuralAttachmentAssociations", js.undefined)
    
    inline def setMaxAllowableAssociations(value: Double): Self = StObject.set(x, "maxAllowableAssociations", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableAssociationsSliderMax(value: Double): Self = StObject.set(x, "maxAllowableAssociationsSliderMax", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableAssociationsSliderMaxUndefined: Self = StObject.set(x, "maxAllowableAssociationsSliderMax", js.undefined)
    
    inline def setMaxAllowableAssociationsSliderMin(value: Double): Self = StObject.set(x, "maxAllowableAssociationsSliderMin", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableAssociationsSliderMinUndefined: Self = StObject.set(x, "maxAllowableAssociationsSliderMin", js.undefined)
    
    inline def setMaxAllowableAssociationsSliderStep(value: Double): Self = StObject.set(x, "maxAllowableAssociationsSliderStep", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableAssociationsSliderStepUndefined: Self = StObject.set(x, "maxAllowableAssociationsSliderStep", js.undefined)
    
    inline def setMaxAllowableAssociationsUndefined: Self = StObject.set(x, "maxAllowableAssociations", js.undefined)
    
    inline def setShowArrowsConnectivity(value: Boolean): Self = StObject.set(x, "showArrowsConnectivity", value.asInstanceOf[js.Any])
    
    inline def setShowArrowsConnectivityUndefined: Self = StObject.set(x, "showArrowsConnectivity", js.undefined)
    
    inline def setShowArrowsStructuralAttachment(value: Boolean): Self = StObject.set(x, "showArrowsStructuralAttachment", value.asInstanceOf[js.Any])
    
    inline def setShowArrowsStructuralAttachmentUndefined: Self = StObject.set(x, "showArrowsStructuralAttachment", js.undefined)
    
    inline def setShowAssociationsEnabled(value: Boolean): Self = StObject.set(x, "showAssociationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setShowAssociationsEnabledUndefined: Self = StObject.set(x, "showAssociationsEnabled", js.undefined)
    
    inline def setStructuralAttachmentAssociationsLineSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "structuralAttachmentAssociationsLineSymbol", value.asInstanceOf[js.Any])
    
    inline def setStructuralAttachmentAssociationsLineSymbolUndefined: Self = StObject.set(x, "structuralAttachmentAssociationsLineSymbol", js.undefined)
    
    inline def setUtilityNetwork(value: UtilityNetworkProperties): Self = StObject.set(x, "utilityNetwork", value.asInstanceOf[js.Any])
    
    inline def setUtilityNetworkUndefined: Self = StObject.set(x, "utilityNetwork", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: UtilityNetworkAssociationsViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: UtilityNetworkAssociationsVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
