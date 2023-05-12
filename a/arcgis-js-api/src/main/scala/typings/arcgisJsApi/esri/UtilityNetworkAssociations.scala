package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilityNetworkAssociations
  extends StObject
     with Widget_ {
  
  /**
    * Indicates whether to show a toggle to automatically show associations every time the map extent changes, or an action button to show associations within the current map extent on demand.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#autoRefreshAssociations)
    */
  var autoRefreshAssociations: Boolean = js.native
  
  /**
    * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) used for representing the polyline geometry that is being drawn for connectivity associations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#connectivityAssociationsLineSymbol)
    */
  var connectivityAssociationsLineSymbol: SimpleLineSymbol = js.native
  
  /**
    * Indicates whether to query and display connectivity associations.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#includeConnectivityAssociations)
    */
  var includeConnectivityAssociations: Boolean = js.native
  
  /**
    * Indicates whether to query and display structural attachment associations.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#includeStructuralAttachmentAssociations)
    */
  var includeStructuralAttachmentAssociations: Boolean = js.native
  
  /**
    * The maximum number of associations that can be returned from the server.
    *
    * @default 250
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociations)
    */
  var maxAllowableAssociations: Double = js.native
  
  /**
    * Determines whether the maximum allowable associations returned were exceeded.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociationsExceeded)
    */
  var maxAllowableAssociationsExceeded: Double = js.native
  
  /**
    * The maximum value or upper bound of the Maximum allowable associations slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociationsSliderMax)
    */
  var maxAllowableAssociationsSliderMax: Double = js.native
  
  /**
    * The minimum value or lower bound of the Maximum allowable associations slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociationsSliderMin)
    */
  var maxAllowableAssociationsSliderMin: Double = js.native
  
  /**
    * Specifies the interval to move the maximum allowable associations slider with the up, or down keys.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociationsSliderStep)
    */
  var maxAllowableAssociationsSliderStep: Double = js.native
  
  /**
    * Determines if no associations were found.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#noAssociationsFound)
    */
  var noAssociationsFound: Boolean = js.native
  
  /**
    * Indicates whether to show arrows for connectivity associations.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#showArrowsConnectivity)
    */
  var showArrowsConnectivity: Boolean = js.native
  
  /**
    * Indicates whether to show arrows for structural attachment associations.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#showArrowsStructuralAttachment)
    */
  var showArrowsStructuralAttachment: Boolean = js.native
  
  /**
    * When `autoRefreshAssociations` is `true`, indicates whether to automatically show associations every time the current map extent changes.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#showAssociationsEnabled)
    */
  var showAssociationsEnabled: Boolean = js.native
  
  /**
    * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) used for representing the polyline geometry that is being drawn for structural attachment associations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#structuralAttachmentAssociationsLineSymbol)
    */
  var structuralAttachmentAssociationsLineSymbol: SimpleLineSymbol = js.native
  
  /**
    * Determines the utility network to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#utilityNetwork)
    */
  var utilityNetwork: UtilityNetwork = js.native
  
  /**
    * The view associated with the UtilityNetworkAssociations widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#view)
    */
  var view: MapView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#viewModel)
    */
  var viewModel: UtilityNetworkAssociationsViewModel = js.native
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#visibleElements)
    */
  var visibleElements: UtilityNetworkAssociationsVisibleElements = js.native
}
