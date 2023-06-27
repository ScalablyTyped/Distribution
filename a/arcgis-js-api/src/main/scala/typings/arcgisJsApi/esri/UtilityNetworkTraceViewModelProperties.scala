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
  		 * When true, provides the ability to show the convex hull or buffer.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#enableResultArea)
  		 */
  var enableResultArea: js.UndefOr[Boolean] = js.undefined
  
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
  		 * The properties to determine the size and color of the result area convex hull or buffer, and determines if it displays on the map when the trace completes.
  		 *
  		 * @default {
  		 *  type: "convexhull",
  		 *  distance: 10,
  		 *  unit: "meters",
  		 *  areaUnit: "square-meters",
  		 *  color: {
  		 *    color: [255, 165, 0, 0.5],
  		 *    haloOpacity: 0.9,
  		 *    fillOpacity: 0.2,
  		 *    hex: "#ffa500"
  		 *  },
  		 *  show: false
  		 * }
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#resultAreaProperties)
  		 */
  var resultAreaProperties: js.UndefOr[ResultAreaPropertiesExtend] = js.undefined
  
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
  		 * Stores the result of completed traces.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#traceResults)
  		 */
  var traceResults: js.UndefOr[js.Array[TraceResultExtend]] = js.undefined
  
  /**
  		 * Determines the utility network to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#utilityNetwork)
  		 */
  var utilityNetwork: js.UndefOr[UtilityNetworkProperties] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkTraceViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setDefaultGraphicColor(value: GraphicColor): Self = StObject.set(x, "defaultGraphicColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultGraphicColorUndefined: Self = StObject.set(x, "defaultGraphicColor", js.undefined)
    
    inline def setEnableResultArea(value: Boolean): Self = StObject.set(x, "enableResultArea", value.asInstanceOf[js.Any])
    
    inline def setEnableResultAreaUndefined: Self = StObject.set(x, "enableResultArea", js.undefined)
    
    inline def setFlags(value: js.Array[FlagProperty]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFlagsVarargs(value: FlagProperty*): Self = StObject.set(x, "flags", js.Array(value*))
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setResultAreaProperties(value: ResultAreaPropertiesExtend): Self = StObject.set(x, "resultAreaProperties", value.asInstanceOf[js.Any])
    
    inline def setResultAreaPropertiesUndefined: Self = StObject.set(x, "resultAreaProperties", js.undefined)
    
    inline def setSelectOnComplete(value: Boolean): Self = StObject.set(x, "selectOnComplete", value.asInstanceOf[js.Any])
    
    inline def setSelectOnCompleteUndefined: Self = StObject.set(x, "selectOnComplete", js.undefined)
    
    inline def setSelectedTraces(value: js.Array[String]): Self = StObject.set(x, "selectedTraces", value.asInstanceOf[js.Any])
    
    inline def setSelectedTracesUndefined: Self = StObject.set(x, "selectedTraces", js.undefined)
    
    inline def setSelectedTracesVarargs(value: String*): Self = StObject.set(x, "selectedTraces", js.Array(value*))
    
    inline def setShowGraphicsOnComplete(value: Boolean): Self = StObject.set(x, "showGraphicsOnComplete", value.asInstanceOf[js.Any])
    
    inline def setShowGraphicsOnCompleteUndefined: Self = StObject.set(x, "showGraphicsOnComplete", js.undefined)
    
    inline def setShowSelectionAttributes(value: Boolean): Self = StObject.set(x, "showSelectionAttributes", value.asInstanceOf[js.Any])
    
    inline def setShowSelectionAttributesUndefined: Self = StObject.set(x, "showSelectionAttributes", js.undefined)
    
    inline def setTraceResults(value: js.Array[TraceResultExtend]): Self = StObject.set(x, "traceResults", value.asInstanceOf[js.Any])
    
    inline def setTraceResultsUndefined: Self = StObject.set(x, "traceResults", js.undefined)
    
    inline def setTraceResultsVarargs(value: TraceResultExtend*): Self = StObject.set(x, "traceResults", js.Array(value*))
    
    inline def setUtilityNetwork(value: UtilityNetworkProperties): Self = StObject.set(x, "utilityNetwork", value.asInstanceOf[js.Any])
    
    inline def setUtilityNetworkUndefined: Self = StObject.set(x, "utilityNetwork", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
