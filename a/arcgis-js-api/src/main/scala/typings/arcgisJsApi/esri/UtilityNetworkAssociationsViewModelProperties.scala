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
    * The geodatabase version to use while synthesizing association geometries.
    *
    * @default "sde.DEFAULT"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
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
    * Determines whether the maximum allowable associations returned were exceeded.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#maxAllowableAssociationsExceeded)
    */
  var maxAllowableAssociationsExceeded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the session moment to use while synthesizing association geometries (the default is the version current moment).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#moment)
    */
  var moment: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * Determines if no associations were found.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations-UtilityNetworkAssociationsViewModel.html#noAssociationsFound)
    */
  var noAssociationsFound: js.UndefOr[Boolean] = js.undefined
  
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
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setIncludeConnectivityAssociations(value: Boolean): Self = StObject.set(x, "includeConnectivityAssociations", value.asInstanceOf[js.Any])
    
    inline def setIncludeConnectivityAssociationsUndefined: Self = StObject.set(x, "includeConnectivityAssociations", js.undefined)
    
    inline def setIncludeStructuralAttachmentAssociations(value: Boolean): Self = StObject.set(x, "includeStructuralAttachmentAssociations", value.asInstanceOf[js.Any])
    
    inline def setIncludeStructuralAttachmentAssociationsUndefined: Self = StObject.set(x, "includeStructuralAttachmentAssociations", js.undefined)
    
    inline def setMaxAllowableAssociations(value: Double): Self = StObject.set(x, "maxAllowableAssociations", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableAssociationsExceeded(value: Boolean): Self = StObject.set(x, "maxAllowableAssociationsExceeded", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableAssociationsExceededUndefined: Self = StObject.set(x, "maxAllowableAssociationsExceeded", js.undefined)
    
    inline def setMaxAllowableAssociationsUndefined: Self = StObject.set(x, "maxAllowableAssociations", js.undefined)
    
    inline def setMoment(value: DateProperties): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    
    inline def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
    
    inline def setNoAssociationsFound(value: Boolean): Self = StObject.set(x, "noAssociationsFound", value.asInstanceOf[js.Any])
    
    inline def setNoAssociationsFoundUndefined: Self = StObject.set(x, "noAssociationsFound", js.undefined)
    
    inline def setShowArrowsConnectivity(value: Boolean): Self = StObject.set(x, "showArrowsConnectivity", value.asInstanceOf[js.Any])
    
    inline def setShowArrowsConnectivityUndefined: Self = StObject.set(x, "showArrowsConnectivity", js.undefined)
    
    inline def setShowArrowsStructuralAttachment(value: Boolean): Self = StObject.set(x, "showArrowsStructuralAttachment", value.asInstanceOf[js.Any])
    
    inline def setShowArrowsStructuralAttachmentUndefined: Self = StObject.set(x, "showArrowsStructuralAttachment", js.undefined)
    
    inline def setStructuralAttachmentAssociationsLineSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "structuralAttachmentAssociationsLineSymbol", value.asInstanceOf[js.Any])
    
    inline def setStructuralAttachmentAssociationsLineSymbolUndefined: Self = StObject.set(x, "structuralAttachmentAssociationsLineSymbol", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
