package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`trigger-action`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popup
  extends Widget_
     with GoTo {
  
  /**
    * Defines actions that may be executed by clicking the icon or image symbolizing them in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions)
    */
  var actions: Collection[ActionButton | ActionToggle] = js.native
  
  /**
    * Position of the popup in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#alignment)
    */
  var alignment: auto | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` | js.Function = js.native
  
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoCloseEnabled)
    */
  var autoCloseEnabled: Boolean = js.native
  
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoOpenEnabled)
    */
  var autoOpenEnabled: Boolean = js.native
  
  /**
    * Use this method to remove focus from the Widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#blur)
    */
  def blur(): Unit = js.native
  
  /**
    * Removes [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises), [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features), [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content), [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) and [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) from the Popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#clear)
    */
  def clear(): Unit = js.native
  
  /**
    * Closes the popup by setting its [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) property to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#close)
    */
  def close(): Unit = js.native
  
  /**
    * Indicates whether to enable collapse functionality for the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapseEnabled)
    */
  var collapseEnabled: Boolean = js.native
  
  /**
    * Indicates whether the popup displays its content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapsed)
    */
  var collapsed: Boolean = js.native
  
  /**
    * The content of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content)
    */
  var content: String | HTMLElement | Widget_ = js.native
  
  /**
    * Dock position in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#currentDockPosition)
    */
  val currentDockPosition: auto | `top-center` | `top-right` | `top-left` | `bottom-left` | `bottom-center` | `bottom-right` = js.native
  
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled)
    */
  var defaultPopupTemplateEnabled: Boolean = js.native
  
  /**
    * Indicates whether the placement of the popup is docked to the side of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockEnabled)
    */
  var dockEnabled: Boolean = js.native
  
  /**
    * Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var dockOptions: PopupDockOptions = js.native
  
  /**
    * The number of selected [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) available to the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureCount)
    */
  val featureCount: Double = js.native
  
  /**
    * Shows pagination for the popup if available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureNavigationEnabled)
    */
  var featureNavigationEnabled: Boolean = js.native
  
  /**
    * An array of features associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features)
    */
  var features: js.Array[Graphic] = js.native
  
  /**
    * Use this method to return feature(s) at a given screen location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#fetchFeatures)
    */
  def fetchFeatures(screenPoint: PopupFetchFeaturesScreenPoint): js.Promise[FetchPopupFeaturesResult] = js.native
  def fetchFeatures(screenPoint: PopupFetchFeaturesScreenPoint, options: FetchFeaturesOptions): js.Promise[FetchPopupFeaturesResult] = js.native
  
  /**
    * Use this method to give focus to the Widget if the widget is able to be focused.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#focus)
    */
  def focus(): Unit = js.native
  
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#highlightEnabled)
    */
  var highlightEnabled: Boolean = js.native
  
  /**
    * Point used to position the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location)
    */
  var location: Point = js.native
  
  /**
    * Defines the maximum icons displayed at one time in the action area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#maxInlineActions)
    */
  var maxInlineActions: Double | js.Any = js.native
  
  /**
    * Selects the feature at the next index in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#next)
    */
  def next(): PopupViewModel = js.native
  
  @JSName("on")
  def on_triggeraction(name: `trigger-action`, eventHandler: PopupTriggerActionEventHandler): IHandle = js.native
  
  /**
    * Opens the popup at the given location with content defined either explicitly with `content` or driven from the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) of input features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  def open(): Unit = js.native
  def open(options: PopupOpenOptions): Unit = js.native
  
  /**
    * Selects the feature at the previous index in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#previous)
    */
  def previous(): PopupViewModel = js.native
  
  /**
    * An array of pending Promises that have not yet been fulfilled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises)
    */
  var promises: js.Array[js.Promise[_]] = js.native
  
  /**
    * Positions the popup on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#reposition)
    */
  def reposition(): Unit = js.native
  
  /**
    * The selected feature accessed by the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature)
    */
  val selectedFeature: Graphic = js.native
  
  /**
    * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeatureIndex)
    */
  var selectedFeatureIndex: Double = js.native
  
  /**
    * Returns a reference to the current [Feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html) that the Popup is using.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeatureWidget)
    */
  val selectedFeatureWidget: Feature = js.native
  
  /**
    * Indicates whether to display a spinner at the popup location prior to its display when it has pending promises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#spinnerEnabled)
    */
  var spinnerEnabled: Boolean = js.native
  
  /**
    * The title of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title)
    */
  var title: String = js.native
  
  /**
    * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event-trigger-action) event and executes the [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions) at the specified index in the [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#triggerAction)
    */
  def triggerAction(actionIndex: Double): Unit = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * This is a class that contains all the logic (properties and methods) that controls this widget's behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#viewModel)
    */
  var viewModel: PopupViewModel = js.native
  
  /**
    * Indicates whether the popup is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible)
    */
  var visible: Boolean = js.native
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visibleElements)
    */
  var visibleElements: PopupVisibleElements = js.native
}
