package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilityNetworkAssociationsViewModel
  extends StObject
     with Accessor {
  
  /**
    * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) used for representing the polyline geometry that is being drawn for connectivity associations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#connectivityAssociationsLineSymbol)
    */
  var connectivityAssociationsLineSymbol: SimpleLineSymbol = js.native
  
  /**
    * The geodatabase version to use while synthesizing association geometries.
    *
    * @default "sde.DEFAULT"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  
  /**
    * Indicates whether to query and display connectivity associations.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#includeConnectivityAssociations)
    */
  var includeConnectivityAssociations: Boolean = js.native
  
  /**
    * Indicates whether to query and display structural attachment associations.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#includeStructuralAttachmentAssociations)
    */
  var includeStructuralAttachmentAssociations: Boolean = js.native
  
  /**
    * The maximum number of associations that can be returned from the server.
    *
    * @default 250
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#maxAllowableAssociations)
    */
  var maxAllowableAssociations: Double = js.native
  
  /**
    * Determines whether the maximum allowable associations returned were exceeded.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#maxAllowableAssociationsExceeded)
    */
  var maxAllowableAssociationsExceeded: Boolean = js.native
  
  /**
    * Specifies the session moment to use while synthesizing association geometries (the default is the version current moment).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#moment)
    */
  var moment: js.Date = js.native
  
  /**
    * Determines if no associations were found.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#noAssociationsFound)
    */
  var noAssociationsFound: Boolean = js.native
  
  /**
    * Removes all associations from the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#removeAssociations)
    */
  def removeAssociations(): scala.Unit = js.native
  
  /**
    * Indicates whether to show arrows for connectivity associations.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#showArrowsConnectivity)
    */
  var showArrowsConnectivity: Boolean = js.native
  
  /**
    * Indicates whether to show arrows for structural attachment associations.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#showArrowsStructuralAttachment)
    */
  var showArrowsStructuralAttachment: Boolean = js.native
  
  /**
    * Queries associations within the current map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#showAssociations)
    */
  def showAssociations(): js.Promise[scala.Unit] = js.native
  
  /**
    * The view model's state.
    *
    * @default ready
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#state)
    */
  val state: loading | ready = js.native
  
  /**
    * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) used for representing the polyline geometry that is being drawn for structural attachment associations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#structuralAttachmentAssociationsLineSymbol)
    */
  var structuralAttachmentAssociationsLineSymbol: SimpleLineSymbol = js.native
  
  /**
    * The view associated with the UtilityNetworkAssociations widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#view)
    */
  var view: MapView = js.native
}
