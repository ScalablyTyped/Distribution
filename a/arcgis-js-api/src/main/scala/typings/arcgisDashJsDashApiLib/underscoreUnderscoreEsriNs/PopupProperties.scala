package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * Defines actions that may be executed by clicking the icon or image symbolizing them in the popup. By default, every popup has a `zoom-to` action styled with a magnifying glass icon ![popupTemplate-zoom-action](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-zoom-action.png). When this icon is clicked, the view zooms in four LODs and centers on the selected feature.  You may override this action by removing it from the `actions` array or by setting the [overwriteActions](esri-PopupTemplate.html#overwriteActions) property to `true` in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). The order of each action in the popup is the order in which they appear in the array.  The [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event:trigger-action) event fires each time an action in the popup is clicked. This event should be used to execute custom code for each action clicked. For example, if you would like to add a `zoom-out` action to the popup that zooms the view out several LODs, you would define the zoom-out code in a separate function. Then you would call the custom `zoom-out` function in the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event:trigger-action) event handler. See the sample code snippet below for more details on how this works.  Actions are defined with the properties listed in the [ActionButton](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [ActionToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) classes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions)
    */
  var actions: js.UndefOr[CollectionProperties[ActionButton | ActionToggle]] = js.undefined
  /**
    * Indicates whether [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions) within the popup should display in a menu item.
    *
    * | actionsMenuEnabled = false | actionsMenuEnabled = true |
    * | -------------------------- | ------------------------- |
    * | ![actions49](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/410/popup-actions-49.png) | ![actions410](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/410/popup-actions-410.png) |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actionsMenuEnabled)
    *
    * @default true
    */
  var actionsMenuEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Position of the popup in relation to the selected feature.  **Possible Values:** auto | top-center | top-right | bottom-left | bottom-center | bottom-right | Function
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#alignment)
    *
    * @default "auto"
    */
  var alignment: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoCloseEnabled)
    *
    * @default false
    */
  var autoCloseEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.  Use `view.popup.autoOpenEnabled = false;` when needing to stop the click event propagation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoOpenEnabled)
    *
    * @default true
    */
  var autoOpenEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to enable collapse functionality for the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapseEnabled)
    *
    * @default true
    */
  var collapseEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether the popup displays its content. If `true`, only the header displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapsed)
    *
    * @default false
    */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The content of the popup. When set directly on the Popup, this content is static and cannot use fields to set content templates. To set a template for the content based on field or attribute names, see [PopupTemplate.content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content)
    */
  var content: js.UndefOr[java.lang.String | stdLib.HTMLElement | WidgetProperties] = js.undefined
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined. Automatic popup templates are supported for layers that support the `createPopupTemplate` method. (Supported for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) and [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled)
    *
    * @default false
    */
  var defaultPopupTemplateEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether the placement of the popup is docked to the side of the view.  Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices. When a popup is "dockEnabled" it means the popup no longer points to the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) assigned to it. Rather it is attached to a side, the top, or the bottom of the view.  See [dockOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions) to override default options related to docking the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockEnabled)
    *
    * @default false
    */
  var dockEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices. When a popup is "dockEnabled" it means the popup no longer points to the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) assigned to it. Rather it is placed in one of the corners of the view or to the top or bottom of it. This property allows the developer to set various options for docking the popup.  See the object specification table below to override default docking properties on the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var dockOptions: js.UndefOr[PopupDockOptions] = js.undefined
  /**
    * Shows pagination for the popup if available. This allows the user to scroll through various [selected features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) using either arrows  ![popup-pagination-arrows](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popup-pagination-arrows.png)  or a menu.  ![popup-feature-menu](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popup-pagination-menu.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureNavigationEnabled)
    */
  var featureNavigationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of features associated with the popup. Each graphic in this array must have a valid [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) set. They may share the same [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) or have unique [PopupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) depending on their attributes. The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) and [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) of the popup is set based on the `content` and `title` properties of each graphic's respective [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  When more than one graphic exists in this array, the current content of the Popup is set based on the value of the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature).  This value is `null` if no features are associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#highlightEnabled)
    *
    * @default true
    */
  var highlightEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Point used to position the popup. This is automatically set when viewing the popup by selecting a feature. If using the Popup to display content not related to features in the map, such as the results from a task, then you must set this property before making the popup [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.undefined
  /**
    * An array of pending Promises that have not yet been fulfilled. If there are no pending promises, the value is `null`. When the pending promises are resolved they are removed from this array and the features they return are pushed into the [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises)
    */
  var promises: js.UndefOr[js.Array[arcgisDashJsDashApiLib.IPromise[_]]] = js.undefined
  /**
    * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature). When [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) are set, the first index is automatically selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeatureIndex)
    */
  var selectedFeatureIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether to display a spinner at the popup location prior to its display when it has pending promises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#spinnerEnabled)
    */
  var spinnerEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The title of the popup. This can be set generically on the popup no matter the features that are selected. If the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) has a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html), then the title set in the corresponding template is used here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [PopupViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#viewModel)
    */
  var viewModel: js.UndefOr[PopupViewModelProperties] = js.undefined
  /**
    * Indicates whether the popup is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible)
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object PopupProperties {
  @scala.inline
  def apply(
    actions: CollectionProperties[ActionButton | ActionToggle] = null,
    actionsMenuEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    alignment: java.lang.String | js.Function = null,
    autoCloseEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    autoOpenEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    collapseEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | stdLib.HTMLElement = null,
    content: java.lang.String | stdLib.HTMLElement | WidgetProperties = null,
    defaultPopupTemplateEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    destroyed: js.UndefOr[scala.Boolean] = js.undefined,
    dockEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    dockOptions: PopupDockOptions = null,
    featureNavigationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    features: js.Array[GraphicProperties] = null,
    goToOverride: GoToOverride = null,
    highlightEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    label: java.lang.String = null,
    location: PointProperties = null,
    promises: js.Array[arcgisDashJsDashApiLib.IPromise[_]] = null,
    selectedFeatureIndex: scala.Int | scala.Double = null,
    spinnerEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: PopupViewModelProperties = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PopupProperties = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(actionsMenuEnabled)) __obj.updateDynamic("actionsMenuEnabled")(actionsMenuEnabled)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCloseEnabled)) __obj.updateDynamic("autoCloseEnabled")(autoCloseEnabled)
    if (!js.isUndefined(autoOpenEnabled)) __obj.updateDynamic("autoOpenEnabled")(autoOpenEnabled)
    if (!js.isUndefined(collapseEnabled)) __obj.updateDynamic("collapseEnabled")(collapseEnabled)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPopupTemplateEnabled)) __obj.updateDynamic("defaultPopupTemplateEnabled")(defaultPopupTemplateEnabled)
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (!js.isUndefined(dockEnabled)) __obj.updateDynamic("dockEnabled")(dockEnabled)
    if (dockOptions != null) __obj.updateDynamic("dockOptions")(dockOptions)
    if (!js.isUndefined(featureNavigationEnabled)) __obj.updateDynamic("featureNavigationEnabled")(featureNavigationEnabled)
    if (features != null) __obj.updateDynamic("features")(features)
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(goToOverride)
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (location != null) __obj.updateDynamic("location")(location)
    if (promises != null) __obj.updateDynamic("promises")(promises)
    if (selectedFeatureIndex != null) __obj.updateDynamic("selectedFeatureIndex")(selectedFeatureIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(spinnerEnabled)) __obj.updateDynamic("spinnerEnabled")(spinnerEnabled)
    if (title != null) __obj.updateDynamic("title")(title)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PopupProperties]
  }
}

