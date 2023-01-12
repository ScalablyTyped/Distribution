package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkTraceProperties
  extends StObject
     with WidgetProperties {
  
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#defaultGraphicColor)
    */
  var defaultGraphicColor: js.UndefOr[GraphicColor] = js.undefined
  
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of map points to load into the widget to lookup flags.
    *
    * @default []
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#flags)
    */
  var flags: js.UndefOr[js.Array[FlagProperty]] = js.undefined
  
  /**
    * The Geodatabase version to pass into the trace.
    *
    * @default "sde.DEFAULT"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Custom labels, descriptions, and symbol for the input [flags](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#flags).
    *
    * @default []
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#inputSettings)
    */
  var inputSettings: js.UndefOr[js.Array[InputSetting]] = js.undefined
  
  /**
    * When true, the utility network elements are selected in the view when traces are completed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#selectOnComplete)
    */
  var selectOnComplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of global Ids of traces to select on load
    *
    * @default []
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#selectedTraces)
    */
  var selectedTraces: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When true, a graphic layer is added to the view to highlight the utility network elements when traces are completed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#showGraphicsOnComplete)
    */
  var showGraphicsOnComplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether to show list of selection attributes
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#showSelectionAttributes)
    */
  var showSelectionAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#viewModel)
    */
  var viewModel: js.UndefOr[UtilityNetworkTraceViewModelProperties] = js.undefined
}
object UtilityNetworkTraceProperties {
  
  inline def apply(): UtilityNetworkTraceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilityNetworkTraceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkTraceProperties] (val x: Self) extends AnyVal {
    
    inline def setDefaultGraphicColor(value: GraphicColor): Self = StObject.set(x, "defaultGraphicColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultGraphicColorUndefined: Self = StObject.set(x, "defaultGraphicColor", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFlags(value: js.Array[FlagProperty]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFlagsVarargs(value: FlagProperty*): Self = StObject.set(x, "flags", js.Array(value*))
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setInputSettings(value: js.Array[InputSetting]): Self = StObject.set(x, "inputSettings", value.asInstanceOf[js.Any])
    
    inline def setInputSettingsUndefined: Self = StObject.set(x, "inputSettings", js.undefined)
    
    inline def setInputSettingsVarargs(value: InputSetting*): Self = StObject.set(x, "inputSettings", js.Array(value*))
    
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
    
    inline def setViewModel(value: UtilityNetworkTraceViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
