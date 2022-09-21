package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`add-flag-complete`
import typings.arcgisJsApi.arcgisJsApiStrings.`add-flag-error`
import typings.arcgisJsApi.arcgisJsApiStrings.`add-flag`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilityNetworkTrace
  extends StObject
     with Widget_ {
  
  /**
    * Checks if the requirements to execute a trace are met.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#checkCanTrace)
    */
  def checkCanTrace(): js.Promise[scala.Unit] = js.native
  
  /**
    * Prompts to clear all input flags, selected trace types, and the trace results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#confirmReset)
    */
  def confirmReset(): scala.Unit = js.native
  
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
  var defaultGraphicColor: GraphicColor = js.native
  
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#disabled)
    */
  var disabled: Boolean = js.native
  
  /**
    * An array of map points to load into the widget to lookup flags.
    *
    * @default []
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#flags)
    */
  var flags: js.Array[FlagProperty] = js.native
  
  /**
    * The Geodatabase version to pass into the trace.
    *
    * @default "sde.DEFAULT"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * Custom labels, descriptions, and symbol for the input [flags](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#flags).
    *
    * @default []
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#inputSettings)
    */
  var inputSettings: js.Array[InputSetting] = js.native
  
  @JSName("on")
  def on_addflag(name: `add-flag`, eventHandler: UtilityNetworkTraceAddFlagEventHandler): IHandle = js.native
  @JSName("on")
  def on_addflagcomplete(name: `add-flag-complete`, eventHandler: UtilityNetworkTraceAddFlagCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_addflagerror(name: `add-flag-error`, eventHandler: UtilityNetworkTraceAddFlagErrorEventHandler): IHandle = js.native
  
  /**
    * When true, the utility network elements are selected in the view when traces are completed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#selectOnComplete)
    */
  var selectOnComplete: Boolean = js.native
  
  /**
    * A list of global Ids of traces to select on load
    *
    * @default []
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#selectedTraces)
    */
  var selectedTraces: js.Array[String] = js.native
  
  /**
    * When true, a graphic layer is added to the view to highlight the utility network elements when traces are completed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#showGraphicsOnComplete)
    */
  var showGraphicsOnComplete: Boolean = js.native
  
  /**
    * Determines whether to show list of selection attributes
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#showSelectionAttributes)
    */
  var showSelectionAttributes: Boolean = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#view)
    */
  var view: MapView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#viewModel)
    */
  var viewModel: UtilityNetworkTraceViewModel = js.native
}
