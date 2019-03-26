package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupViewModel
  extends Accessor
     with Evented
     with GoTo {
  /**
    * [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) objects. Each action may be executed by clicking the icon or image symbolizing them in the popup. By default, every popup has a `zoom-to` action styled with a magnifying glass icon ![popupTemplate-zoom-action](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-zoom-action.png). When this icon is clicked, the view zooms in four LODs and centers on the selected feature.  You may override this action by removing it from the actions [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) or by setting the [overwriteActions](esri-PopupTemplate.html#overwriteActions) property to `true` in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). The order of each action in the popup is the order in which they appear in the actions [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html).  The [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#event:trigger-action) event fires each time an action in the popup is clicked. This event should be used to execute custom code for each action clicked. For example, if you would like to add a `zoom-out` action to the popup that zooms the view out several LODs, you would define the zoom-out code in a separate function. Then you would call the custom `zoom-out` function in the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#event:trigger-action) event handler. See the sample code snippet below for more details on how this works.  Actions are defined with the properties listed in the [ActionButton](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [ActionToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#actions)
    */
  var actions: Collection[ActionButton | ActionToggle] = js.native
  /**
    * A collection of [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggles](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) used within the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#allActions)
    */
  val allActions: Collection[ActionButton | ActionToggle] = js.native
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#autoCloseEnabled)
    *
    * @default false
    */
  var autoCloseEnabled: scala.Boolean = js.native
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.  Use `view.popup.autoOpenEnabled = false;` when needing to stop the click event propagation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#autoOpenEnabled)
    *
    * @default true
    */
  var autoOpenEnabled: scala.Boolean = js.native
  /**
    * The content of the popup. When set directly on the Popup, this content may only be static and cannot use fields to set content templates. To set a template for the content based on field or attribute names, see [PopupTemplate.content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content)
    */
  var content: java.lang.String | stdLib.HTMLElement | Widget = js.native
  /**
    * The number of selected [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features) available to the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#featureCount)
    *
    * @default 0
    */
  val featureCount: scala.Double = js.native
  /**
    * An array of features associated with the popup. Each graphic in this array must have a valid [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) set. They may share the same [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) or have unique [PopupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) depending on their attributes. The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content) and [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title) of the poup is set based on the `content` and `title` properties of each graphic's respective [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  When more than one graphic exists in this array, the current content of the Popup is set based on the value of the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature).  This value is `null` if no features are associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features)
    */
  var features: js.Array[Graphic] = js.native
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#highlightEnabled)
    *
    * @default true
    */
  var highlightEnabled: scala.Boolean = js.native
  /**
    * Geometry used to position the popup. This is automatically set when viewing the popup by selecting a feature. If using the Popup to display content not related to features in the map, such as the results from a task, then you must set this property before making the popup [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#visible) to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location)
    */
  var location: Point = js.native
  /**
    * The number of [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises) remaining to be resolved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#pendingPromisesCount)
    *
    * @default 0
    */
  val pendingPromisesCount: scala.Double = js.native
  /**
    * The number of selected [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises) available to the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promiseCount)
    *
    * @default 0
    */
  val promiseCount: scala.Double = js.native
  /**
    * An array of pending Promises that have not yet been fulfilled. If there are no pending Promises, the value is `null`. When the pending Promises are resolved they are removed from this array and the features they return are pushed into the [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises)
    */
  var promises: js.Array[arcgisDashJsDashApiLib.IPromise[_]] = js.native
  /**
    * The selected feature accessed by the popup. The content of the Popup is determined based on the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) assigned to this feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature)
    */
  val selectedFeature: Graphic = js.native
  /**
    * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature). When [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features) are set, the first index is automatically selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeatureIndex)
    */
  var selectedFeatureIndex: scala.Double = js.native
  /**
    * The view model's state.  **Possible Values:** ready | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#state)
    *
    * @default disabled
    */
  val state: java.lang.String = js.native
  /**
    * The title of the popup. This can be set generically on the popup no matter the features that are selected. If the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature) has a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html), then the title set in the corresponding template is used here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title)
    */
  var title: java.lang.String = js.native
  /**
    * The view associated with the Popup instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Indicates whether the popup is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#visible)
    */
  var visible: scala.Boolean = js.native
  /**
    * Removes [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises), [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features), [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content), [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title) and [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location) from the Popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#clear)
    *
    *
    */
  def clear(): scala.Unit = js.native
  /**
    * Selects the feature at the next index in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#next)
    *
    *
    */
  def next(): PopupViewModel = js.native
  @JSName("on")
  def `on_trigger-action`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`trigger-action`,
    eventHandler: PopupViewModelTriggerActionEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Opens the popup at the given location with content defined either explicitly with `content` or driven from the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) of input features. This method sets the popup's [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#visible) property to `true`. Users can alternatively open the popup by directly setting the [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#visible) property to `true`. The popup will only display if the view's size constraints in [dockOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#dockOptions) are met or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location) property is set to a geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#open)
    *
    * @param options Defines the location and content of the popup when opened.
    * @param options.title Sets the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title) of the popup.
    * @param options.content Sets the the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content) of the popup.
    * @param options.location Sets the popup's [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location), which is the geometry used to position the popup.
    * @param options.features Sets the popup's [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features), which populate the title and content of the popup based on each graphic's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    * @param options.promises Sets pending [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises) on the popup. The popup will display once the promises resolve. Each promise must resolve to an array of [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). allows the user to scroll through the list of features returned from the query and choose the selection they want to display within the popup.
    * @param options.updateLocationEnabled When `true` indicates the popup should update its [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location) for each paginated feature based on the [selected feature's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature) geometry.
    * @param options.collapsed **Since:** 4.5    When `true`, indicates that only the popup header will display.
    *
    */
  def open(): scala.Unit = js.native
  def open(options: PopupViewModelOpenOptions): scala.Unit = js.native
  /**
    * Selects the feature at the previous index in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#previous)
    *
    *
    */
  def previous(): PopupViewModel = js.native
  /**
    * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#event:trigger-action) event and executes the [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#actions) at the specified index in the [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#actions) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#triggerAction)
    *
    * @param actionIndex The index of the [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#actions) to execute.
    *
    */
  def triggerAction(actionIndex: scala.Double): scala.Unit = js.native
}

@JSGlobal("__esri.PopupViewModel")
@js.native
/**
  * Provides the logic for the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) widget, which allows users to view content from feature attributes. Popups enhance web applications by providing users with a simple way to interact with and view attributes in a layer. They play an important role in relaying information to the user, which improves the storytelling capabilities of the application.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html)
  */
class PopupViewModelCls () extends PopupViewModel {
  def this(properties: PopupViewModelProperties) = this()
}

