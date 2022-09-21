package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkTraceViewModelProperties
  extends StObject
     with GoToProperties {
  
  /**
    * The default color to assign the aggregated geometry of a trace result.
    *
    * @default {
    * color: [255, 255, 0, 0.6],
    * haloOpacity: 0.9,
    * fillOpacity: 0.2,
    * hex: "#FFFF00"
    * }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#defaultGraphicColor)
    */
  var defaultGraphicColor: js.UndefOr[GraphicColor] = js.undefined
  
  /**
    * An array of map points to load into the widget to lookup flags.
    *
    * @default []
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#flags)
    */
  var flags: js.UndefOr[js.Array[FlagProperty]] = js.undefined
  
  /**
    * The Geodatabase version to pass into the trace.
    *
    * @default "sde.DEFAULT"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
    * When true, the utility network elements are selected in the view when traces are completed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#selectOnComplete)
    */
  var selectOnComplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of global Ids of traces to select on initial load.
    *
    * @default []
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#selectedTraces)
    */
  var selectedTraces: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When true, a graphic layer is added to the view to highlight the utility network elements when traces are completed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#showGraphicsOnComplete)
    */
  var showGraphicsOnComplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether to show the list of selected features from completed traces.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#showSelectionAttributes)
    */
  var showSelectionAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object UtilityNetworkTraceViewModelProperties {
  
  inline def apply(): UtilityNetworkTraceViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilityNetworkTraceViewModelProperties]
  }
  
  extension [Self <: UtilityNetworkTraceViewModelProperties](x: Self) {
    
    inline def setDefaultGraphicColor(value: GraphicColor): Self = StObject.set(x, "defaultGraphicColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultGraphicColorUndefined: Self = StObject.set(x, "defaultGraphicColor", js.undefined)
    
    inline def setFlags(value: js.Array[FlagProperty]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFlagsVarargs(value: FlagProperty*): Self = StObject.set(x, "flags", js.Array(value*))
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setSelectOnComplete(value: Boolean): Self = StObject.set(x, "selectOnComplete", value.asInstanceOf[js.Any])
    
    inline def setSelectOnCompleteUndefined: Self = StObject.set(x, "selectOnComplete", js.undefined)
    
    inline def setSelectedTraces(value: js.Array[String]): Self = StObject.set(x, "selectedTraces", value.asInstanceOf[js.Any])
    
    inline def setSelectedTracesUndefined: Self = StObject.set(x, "selectedTraces", js.undefined)
    
    inline def setSelectedTracesVarargs(value: String*): Self = StObject.set(x, "selectedTraces", js.Array(value*))
    
    inline def setShowGraphicsOnComplete(value: Boolean): Self = StObject.set(x, "showGraphicsOnComplete", value.asInstanceOf[js.Any])
    
    inline def setShowGraphicsOnCompleteUndefined: Self = StObject.set(x, "showGraphicsOnComplete", js.undefined)
    
    inline def setShowSelectionAttributes(value: Boolean): Self = StObject.set(x, "showSelectionAttributes", value.asInstanceOf[js.Any])
    
    inline def setShowSelectionAttributesUndefined: Self = StObject.set(x, "showSelectionAttributes", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
