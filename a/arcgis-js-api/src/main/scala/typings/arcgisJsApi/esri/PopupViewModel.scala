package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`trigger-action`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupViewModel
  extends StObject
     with Accessor
     with Evented
     with GoTo {
  
  /**
  		 * [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#actions)
  		 */
  var actions: Collection[ActionButton | ActionToggle] = js.native
  
  /**
  		 * Indicates if the widget is active when it is visible and is not [waiting for results](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#waitingForResult).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#active)
  		 */
  val active: Boolean = js.native
  
  /**
  		 * A collection of [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggles](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) used within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#allActions)
  		 */
  val allActions: Collection[ActionButton | ActionToggle] = js.native
  
  /**
  		 * This closes the widget when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#autoCloseEnabled)
  		 */
  var autoCloseEnabled: Boolean = js.native
  
  /**
  		 * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.
  		 *
  		 * @default true
  		 * @deprecated since 4.27. Use {@link module:esri/core/MapView#popupEnabled MapView/SceneView.popupEnabled} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#autoOpenEnabled)
  		 */
  var autoOpenEnabled: Boolean = js.native
  
  /**
  		 * Indicates if the "Browse features" experience is active in a [cluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html) popup.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#browseClusterEnabled)
  		 */
  var browseClusterEnabled: Boolean = js.native
  
  /**
  		 * Removes [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises), [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features), [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content), [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title) and [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location) from the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#clear)
  		 */
  def clear(): scala.Unit = js.native
  
  /**
  		 * The content of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content)
  		 */
  var content: String | HTMLElement | Widget_ = js.native
  
  /**
  		 * A read-only property that specifies a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of action [buttons](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) and/or [toggles](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#defaultActions)
  		 */
  val defaultActions: Collection[ActionButton | ActionToggle] = js.native
  
  /**
  		 * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#defaultPopupTemplateEnabled)
  		 */
  var defaultPopupTemplateEnabled: Boolean = js.native
  
  /**
  		 * The number of selected [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features) available to the widget.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#featureCount)
  		 */
  val featureCount: Double = js.native
  
  /**
  		 * Defines the specific [abilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#Abilities) that the widget should use when querying and displaying its content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#featureViewModelAbilities)
  		 */
  var featureViewModelAbilities: Abilities = js.native
  
  /**
  		 * An array of [feature view model(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html) used by the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) and [Features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html) widgets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#featureViewModels)
  		 */
  val featureViewModels: js.Array[FeatureViewModel] = js.native
  
  /**
  		 * An array of features associated with the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features)
  		 */
  var features: js.Array[Graphic] = js.native
  
  /**
  		 * The number of features to fetch at one time.
  		 *
  		 * @default 20
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#featuresPerPage)
  		 */
  var featuresPerPage: Double = js.native
  
  /**
  		 * Use this method to return feature(s) at a given screen location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#fetchFeatures)
  		 */
  def fetchFeatures(screenPoint: PopupViewModelFetchFeaturesScreenPoint): js.Promise[FetchPopupFeaturesResult] = js.native
  def fetchFeatures(screenPoint: PopupViewModelFetchFeaturesScreenPoint, options: PopupFetchFeaturesOptions): js.Promise[FetchPopupFeaturesResult] = js.native
  
  /**
  		 * Highlight the selected feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#highlightEnabled)
  		 */
  var highlightEnabled: Boolean = js.native
  
  /**
  		 * Indicates whether or not to include [defaultActions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#defaultActions) in the widget's UI.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#includeDefaultActions)
  		 */
  var includeDefaultActions: Boolean = js.native
  
  /**
  		 * Geometry used to position the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location)
  		 */
  var location: Point = js.native
  
  /**
  		 * Selects the feature at the next index in relation to the selected feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#next)
  		 */
  def next(): PopupViewModel = js.native
  
  @JSName("on")
  def on_triggeraction(name: `trigger-action`, eventHandler: PopupViewModelTriggerActionEventHandler): IHandle = js.native
  
  /**
  		 * Opens the widget at the given location with content defined either explicitly with `content` or driven from the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) of input features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#open)
  		 */
  def open(): scala.Unit = js.native
  def open(options: PopupViewModelOpenOptions): scala.Unit = js.native
  
  /**
  		 * The number of [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises) remaining to be resolved.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#pendingPromisesCount)
  		 */
  val pendingPromisesCount: Double = js.native
  
  /**
  		 * Selects the feature at the previous index in relation to the selected feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#previous)
  		 */
  def previous(): PopupViewModel = js.native
  
  /**
  		 * The number of selected [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises) available to the widget.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promiseCount)
  		 */
  val promiseCount: Double = js.native
  
  /**
  		 * An array of pending Promises that have not yet been fulfilled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises)
  		 */
  var promises: js.Array[js.Promise[Any]] = js.native
  
  /**
  		 * The graphic used to represent the cluster extent when the `Browse features` action is active in a cluster popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedClusterBoundaryFeature)
  		 */
  val selectedClusterBoundaryFeature: Graphic = js.native
  
  /**
  		 * The selected feature accessed by the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature)
  		 */
  val selectedFeature: Graphic = js.native
  
  /**
  		 * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeatureIndex)
  		 */
  var selectedFeatureIndex: Double = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#state)
  		 */
  val state: ready | disabled = js.native
  
  /**
  		 * The title of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title)
  		 */
  var title: String = js.native
  
  /**
  		 * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#event-trigger-action) event and executes the [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#actions) at the specified index in the [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#actions) array.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#triggerAction)
  		 */
  def triggerAction(actionIndex: Double): scala.Unit = js.native
  
  /**
  		 * The view associated with the widget instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * Indicates whether the widget is visible.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#visible)
  		 */
  var visible: Boolean = js.native
  
  /**
  		 * Indicates whether the widget has found a feature while resolving [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises).
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#waitingForResult)
  		 */
  val waitingForResult: Boolean = js.native
}
