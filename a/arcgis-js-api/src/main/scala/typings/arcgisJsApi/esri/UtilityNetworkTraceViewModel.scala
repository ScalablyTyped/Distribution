package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilityNetworkTraceViewModel
  extends StObject
     with Accessor
     with GoTo {
  
  /**
  		 * Adds a flag point graphic for the click event on the view if there is a feature to query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#addFlagByHit)
  		 */
  def addFlagByHit(`type`: String): js.Promise[Boolean] = js.native
  
  /**
  		 * Creates a graphic from the trace result and adds it to the map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#addResultAreaToMap)
  		 */
  def addResultAreaToMap(trace: TraceResultExtend): scala.Unit = js.native
  
  /**
  		 * Create a graphic on the view’s [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#graphics) for the aggregated results of all the features returned by the trace.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#addResultGraphicToView)
  		 */
  def addResultGraphicToView(trace: TraceResultExtend, color: GraphicColor): js.Promise[Any] = js.native
  
  /**
  		 * Adds the selected terminal to a flag point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#addTerminal)
  		 */
  def addTerminal(selectedTerminal: String, feature: FlagProperty): scala.Unit = js.native
  
  /**
  		 * Get all parameters for the trace type selected to be run before executing the trace.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#callTrace)
  		 */
  def callTrace(): js.Promise[Boolean] = js.native
  
  /**
  		 * Change the graphic color for the aggregated results of a trace.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#changeResultGraphicColor)
  		 */
  def changeResultGraphicColor(color: GraphicColor, trace: TraceResultExtend): scala.Unit = js.native
  
  /**
  		 * May be used to verify if all requirements are met to execute a trace (at least 1 starting point and at least 1 trace type selected).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#checkCanTrace)
  		 */
  def checkCanTrace(): ValidSetup = js.native
  
  /**
  		 * Indicates if any selection exists on the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#checkSelectionExist)
  		 */
  def checkSelectionExist(): Boolean = js.native
  
  /**
  		 * Removes a specific trace from the results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#clearResult)
  		 */
  def clearResult(trace: TraceItem): scala.Unit = js.native
  
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
  var defaultGraphicColor: GraphicColor = js.native
  
  /**
  		 * When true, provides the ability to show the convex hull or buffer.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#enableResultArea)
  		 */
  var enableResultArea: Boolean = js.native
  
  /**
  		 * Executes the trace and returns all trace results as graphics and/or feature selections and functions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#executeTrace)
  		 */
  def executeTrace(traceItem: TraceItem, url: String, params: TraceParameters): js.Promise[TraceResultExtend] = js.native
  
  /**
  		 * An array of map points to load into the widget to lookup flags.
  		 *
  		 * @default []
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#flags)
  		 */
  var flags: js.Array[FlagProperty] = js.native
  
  /**
  		 * The Geodatabase version to pass into the trace.
  		 *
  		 * @default "sde.DEFAULT"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#gdbVersion)
  		 */
  var gdbVersion: String = js.native
  
  /**
  		 * Gets the valid edge and junction layers within the view that are part of the Utility Network and can be used for placing flags in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#getValidSources)
  		 */
  def getValidSources(): js.Array[EdgeSourceJSON | JunctionSourceJSON] = js.native
  
  /**
  		 * Reads the web map and loads the [UtilityNetwork](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html) if it exists.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#loadUtilityNetwork)
  		 */
  def loadUtilityNetwork(): js.Promise[UtilityNetwork] = js.native
  
  /**
  		 * Enables or disables the filter barrier setting on barrier flags.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#manageFilterBarrier)
  		 */
  def manageFilterBarrier(status: Boolean, feature: FlagProperty): scala.Unit = js.native
  
  /**
  		 * Is used to merge the feature selections in the layer views when multiple traces are run.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#mergeSelection)
  		 */
  def mergeSelection(status: Boolean, trace: TraceItem): scala.Unit = js.native
  
  /**
  		 * Query the layers by ObjectID for more attributes not present on the trace result elements.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#queryFeaturesById)
  		 */
  def queryFeaturesById(dataItems: js.Array[NetworkElement]): js.Promise[js.Array[FeatureSetInfo]] = js.native
  
  /**
  		 * Takes the result of a hit test to lookup the asset to create a flag for the trace.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#queryFlagByHitTest)
  		 */
  def queryFlagByHitTest(e: Any, flagType: String): js.Promise[Boolean] = js.native
  
  /**
  		 * Removes the selected flag from the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#removeFlag)
  		 */
  def removeFlag(flag: FlagProperty): scala.Unit = js.native
  
  /**
  		 * Removes the result area graphic from the `Map`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#removeResultAreaFromMap)
  		 */
  def removeResultAreaFromMap(trace: TraceResultExtend): scala.Unit = js.native
  
  /**
  		 * Removes a specific trace result graphic from the view’s [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#graphics).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#removeResultGraphicFromView)
  		 */
  def removeResultGraphicFromView(trace: TraceResultExtend): scala.Unit = js.native
  
  /**
  		 * Removes the selection from the layer view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#removeSelection)
  		 */
  def removeSelection(): scala.Unit = js.native
  
  /**
  		 * Removes the selected terminal from the flag.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#removeTerminal)
  		 */
  def removeTerminal(selectedTerminal: String, feature: FlagProperty): scala.Unit = js.native
  
  /**
  		 * Clears all inputs (flags, trace types) and all results (selections, graphics) in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#reset)
  		 */
  def reset(): scala.Unit = js.native
  
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
  var resultAreaProperties: ResultAreaPropertiesExtend = js.native
  
  /**
  		 * Performs a selection on a layer view based on a list of ObjectIDs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#selectFeaturesById)
  		 */
  def selectFeaturesById(resultSet: js.Array[NetworkElement]): scala.Unit = js.native
  
  /**
  		 * When true, the utility network elements are selected in the view when traces are completed.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#selectOnComplete)
  		 */
  var selectOnComplete: Boolean = js.native
  
  /**
  		 * Loops through the trace result elements to group them by network source id and selects them on the layer view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#selectResults)
  		 */
  def selectResults(resultSet: js.Array[NetworkElement]): scala.Unit = js.native
  
  /**
  		 * Set the trace type to be run from the available trace configurations in the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#selectTraces)
  		 */
  def selectTraces(state: Boolean, traceId: String): scala.Unit = js.native
  
  /**
  		 * Preset a trace type to be run from the available [trace configurations](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#sharedNamedTraceConfigurations) in the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) when the widget loads.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#selectTracesOnLoad)
  		 */
  def selectTracesOnLoad(): scala.Unit = js.native
  
  /**
  		 * An array of global Ids of traces to select on initial load.
  		 *
  		 * @default []
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#selectedTraces)
  		 */
  var selectedTraces: js.Array[String] = js.native
  
  /**
  		 * When true, a graphic layer is added to the view to highlight the utility network elements when traces are completed.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#showGraphicsOnComplete)
  		 */
  var showGraphicsOnComplete: Boolean = js.native
  
  /**
  		 * Determines whether to show the list of selected features from completed traces.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#showSelectionAttributes)
  		 */
  var showSelectionAttributes: Boolean = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default ready
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#state)
  		 */
  val state: loading | ready = js.native
  
  /**
  		 * Stores the result of completed traces.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#traceResults)
  		 */
  var traceResults: js.Array[TraceResultExtend] = js.native
  
  /**
  		 * Determines the utility network to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#utilityNetwork)
  		 */
  var utilityNetwork: UtilityNetwork = js.native
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#view)
  		 */
  var view: MapView = js.native
  
  /**
  		 * Zoom to a flag's feature or a result feature in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#zoomToAsset)
  		 */
  def zoomToAsset(geometry: GoToTarget2D | GoToTarget3D): scala.Unit = js.native
}
