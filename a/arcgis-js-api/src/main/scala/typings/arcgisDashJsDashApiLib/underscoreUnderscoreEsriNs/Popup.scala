package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup
  extends Widget
     with GoTo {
  /**
    * Defines actions that may be executed by clicking the icon or image symbolizing them in the popup. By default, every popup has a `zoom-to` action styled with a magnifying glass icon ![popupTemplate-zoom-action](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-zoom-action.png). When this icon is clicked, the view zooms in four LODs and centers on the selected feature.  You may override this action by removing it from the `actions` array or by setting the [overwriteActions](esri-PopupTemplate.html#overwriteActions) property to `true` in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). The order of each action in the popup is the order in which they appear in the array.  The [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event:trigger-action) event fires each time an action in the popup is clicked. This event should be used to execute custom code for each action clicked. For example, if you would like to add a `zoom-out` action to the popup that zooms the view out several LODs, you would define the zoom-out code in a separate function. Then you would call the custom `zoom-out` function in the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event:trigger-action) event handler. See the sample code snippet below for more details on how this works.  Actions are defined with the properties listed in the [ActionButton](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [ActionToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) classes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions)
    */
  var actions: Collection[ActionButton | ActionToggle] = js.native
  /**
    * Position of the popup in relation to the selected feature.  **Possible Values:** auto | top-center | top-right | bottom-left | bottom-center | bottom-right | Function
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#alignment)
    *
    * @default "auto"
    */
  var alignment: java.lang.String | js.Function = js.native
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoCloseEnabled)
    *
    * @default false
    */
  var autoCloseEnabled: scala.Boolean = js.native
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.  Use `view.popup.autoOpenEnabled = false;` when needing to stop the click event propagation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoOpenEnabled)
    *
    * @default true
    */
  var autoOpenEnabled: scala.Boolean = js.native
  /**
    * Indicates whether to enable collapse functionality for the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapseEnabled)
    *
    * @default true
    */
  var collapseEnabled: scala.Boolean = js.native
  /**
    * Indicates whether the popup displays its content. If `true`, only the header displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapsed)
    *
    * @default false
    */
  var collapsed: scala.Boolean = js.native
  /**
    * The content of the popup. When set directly on the Popup, this content is static and cannot use fields to set content templates. To set a template for the content based on field or attribute names, see [PopupTemplate.content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content)
    */
  var content: java.lang.String | stdLib.HTMLElement | Widget = js.native
  /**
    * Dock position in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).  **Possible Values:** top-left | top-center | top-right | bottom-left | bottom-center | bottom-right
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#currentDockPosition)
    */
  val currentDockPosition: java.lang.String = js.native
  /**
    * Indicates whether the placement of the popup is docked to the side of the view.  Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices. When a popup is "dockEnabled" it means the popup no longer points to the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) assigned to it. Rather it is attached to a side, the top, or the bottom of the view.  See [dockOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions) to override default options related to docking the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockEnabled)
    *
    * @default false
    */
  var dockEnabled: scala.Boolean = js.native
  /**
    * Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices. When a popup is "dockEnabled" it means the popup no longer points to the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) assigned to it. Rather it is placed in one of the corners of the view or to the top or bottom of it. This property allows the developer to set various options for docking the popup.  See the object specification table below to override default docking properties on the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var dockOptions: PopupDockOptions = js.native
  /**
    * The number of selected [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) available to the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureCount)
    *
    * @default 0
    */
  val featureCount: scala.Double = js.native
  /**
    * Shows pagination for the popup if available. This allows the user to scroll through various [selected features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) using either arrows  ![popup-pagination-arrows](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popup-pagination-arrows.png)  or a menu.  ![popup-feature-menu](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popup-pagination-menu.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureNavigationEnabled)
    */
  var featureNavigationEnabled: scala.Boolean = js.native
  /**
    * An array of features associated with the popup. Each graphic in this array must have a valid [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) set. They may share the same [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) or have unique [PopupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) depending on their attributes. The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) and [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) of the popup is set based on the `content` and `title` properties of each graphic's respective [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  When more than one graphic exists in this array, the current content of the Popup is set based on the value of the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature).  This value is `null` if no features are associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features)
    */
  var features: js.Array[Graphic] = js.native
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#highlightEnabled)
    *
    * @default true
    */
  var highlightEnabled: scala.Boolean = js.native
  /**
    * Point used to position the popup. This is automatically set when viewing the popup by selecting a feature. If using the Popup to display content not related to features in the map, such as the results from a task, then you must set this property before making the popup [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location)
    */
  var location: Point = js.native
  /**
    * An array of pending Promises that have not yet been fulfilled. If there are no pending promises, the value is `null`. When the pending promises are resolved they are removed from this array and the features they return are pushed into the [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises)
    */
  var promises: js.Array[arcgisDashJsDashApiLib.IPromise[_]] = js.native
  /**
    * The selected feature accessed by the popup. The content of the Popup is determined based on the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) assigned to this feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature)
    */
  val selectedFeature: Graphic = js.native
  /**
    * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature). When [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) are set, the first index is automatically selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeatureIndex)
    */
  var selectedFeatureIndex: scala.Double = js.native
  /**
    * Indicates whether to display a spinner at the popup location prior to its display when it has pending promises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#spinnerEnabled)
    */
  var spinnerEnabled: scala.Boolean = js.native
  /**
    * The title of the popup. This can be set generically on the popup no matter the features that are selected. If the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) has a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html), then the title set in the corresponding template is used here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title)
    */
  var title: java.lang.String = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [PopupViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#viewModel)
    */
  var viewModel: PopupViewModel = js.native
  /**
    * Indicates whether the popup is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible)
    */
  var visible: scala.Boolean = js.native
  /**
    * Use this method to remove focus from the Widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#blur)
    *
    *
    */
  def blur(): scala.Unit = js.native
  /**
    * Removes [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises), [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features), [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content), [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) and [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) from the Popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#clear)
    *
    *
    */
  def clear(): scala.Unit = js.native
  /**
    * Closes the popup by setting its [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) property to `false`. Users can alternatively close the popup by directly setting the [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) property to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#close)
    *
    *
    */
  def close(): scala.Unit = js.native
  /**
    * Use this method to give focus to the Widget if the widget is able to be focused.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#focus)
    *
    *
    */
  def focus(): scala.Unit = js.native
  /**
    * Selects the feature at the next index in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#next)
    *
    *
    */
  def next(): PopupViewModel = js.native
  /**
    * Opens the popup at the given location with content defined either explicitly with `content` or driven from the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) of input features. This method sets the popup's [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) property to `true`. Users can alternatively open the popup by directly setting the [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) property to `true`. The popup will only display if the view's size constraints in [dockOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions) are met or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) property is set to a geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    *
    * @param options Defines the location and content of the popup when opened.
    * @param options.title Sets the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) of the popup.
    * @param options.content Sets the the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) of the popup.
    * @param options.location Sets the popup's [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location), which is the geometry used to position the popup.
    * @param options.features Sets the popup's [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features), which populate the title and content of the popup based on each graphic's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    * @param options.promises Sets pending [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises) on the popup. The popup will display once the promises resolve. Each promise must resolve to an array of [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    * @param options.featureMenuOpen **Since:** 4.5    This property enables multiple features in a popup to display in a list rather than displaying the first selected feature. Setting this to `true` allows the user to scroll through the list of features returned from the query and choose the selection they want to display within the popup.
    * @param options.updateLocationEnabled When `true` indicates the popup should update its [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) for each paginated feature based on the [selected feature's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) geometry.
    * @param options.collapsed **Since:** 4.5    When `true`, indicates that only the popup header will display.
    *
    */
  def open(): scala.Unit = js.native
  def open(options: PopupOpenOptions): scala.Unit = js.native
  /**
    * Selects the feature at the previous index in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#previous)
    *
    *
    */
  def previous(): PopupViewModel = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#render)
    *
    *
    */
  def render(): js.Any = js.native
  /**
    * Positions the popup on the view. Moves the popup into the view's extent if the popup is partially or fully outside the view's extent.  If the popup is partially out of view, the view will move to fully show the popup. If the popup is fully out of view, the view will move to the popup's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#reposition)
    *
    *
    */
  def reposition(): scala.Unit = js.native
  /**
    * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event:trigger-action) event and executes the [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions) at the specified index in the [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#triggerAction)
    *
    * @param actionIndex The index of the [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions) to execute.
    *
    */
  def triggerAction(actionIndex: scala.Double): scala.Unit = js.native
}

@JSGlobal("__esri.Popup")
@js.native
/**
  * The popup widget allows users to view content from feature attributes. Popups enhance web applications by providing users with a simple way to interact with and view attributes in a layer. They play an important role in relaying information to the user, which improves the storytelling capabilities of the application.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html)
  */
class PopupCls () extends Popup {
  def this(properties: PopupProperties) = this()
}

