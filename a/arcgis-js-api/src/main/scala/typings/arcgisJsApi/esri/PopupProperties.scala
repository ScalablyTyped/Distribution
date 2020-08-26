package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * Defines actions that may be executed by clicking the icon or image symbolizing them in the popup. By default, every popup has a `zoom-to` action styled with a magnifying glass icon ![popupTemplate-zoom-action](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-zoom-action.png). When this icon is clicked, the view zooms in four LODs and centers on the selected feature.  You may override this action by removing it from the `actions` array or by setting the [overwriteActions](esri-PopupTemplate.html#overwriteActions) property to `true` in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). The order of each action in the popup is the order in which they appear in the array.  The [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event-trigger-action) event fires each time an action in the popup is clicked. This event should be used to execute custom code for each action clicked. For example, if you would like to add a `zoom-out` action to the popup that zooms the view out several LODs, you would define the zoom-out code in a separate function. Then you would call the custom `zoom-out` function in the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event-trigger-action) event handler. See the sample code snippet below for more details on how this works.  Actions are defined with the properties listed in the [ActionButton](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [ActionToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) classes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions)
    */
  var actions: js.UndefOr[CollectionProperties[ActionButton | ActionToggle]] = js.native
  /**
    * Position of the popup in relation to the selected feature. The default behavior is to display above the feature and adjust if not enough room. If needing to explicitly control where the popup displays in relation to the feature, choose an option besides `auto`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#alignment)
    *
    * @default auto
    */
  var alignment: js.UndefOr[
    auto | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` | js.Function
  ] = js.native
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoCloseEnabled)
    *
    * @default false
    */
  var autoCloseEnabled: js.UndefOr[Boolean] = js.native
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.  Use `view.popup.autoOpenEnabled = false;` when needing to stop the click event propagation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoOpenEnabled)
    *
    * @default true
    */
  var autoOpenEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to enable collapse functionality for the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapseEnabled)
    *
    * @default true
    */
  var collapseEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the popup displays its content. If `true`, only the header displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapsed)
    *
    * @default false
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * The content of the popup. When set directly on the Popup, this content is static and cannot use fields to set content templates. To set a template for the content based on field or attribute names, see [PopupTemplate.content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content)
    */
  var content: js.UndefOr[String | HTMLElement | WidgetProperties] = js.native
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined. Automatic popup templates are supported for layers that support the `createPopupTemplate` method. (Supported for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html), and [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)).
    *   * Starting with version 4.12, [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content can no longer be set using a wildcard, e.g. `*`. Instead, set the `defaultPopupTemplateEnabled` property to `true`.
    *   * Starting with 4.16, the default popup has been improved to no longer display system [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) that do not hold significant value, e.g. `Shape__Area` and `Shape__Length` are two fields that no longer display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled)
    *
    * @default false
    */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the placement of the popup is docked to the side of the view.  Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices. When a popup is "dockEnabled" it means the popup no longer points to the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) assigned to it. Rather it is attached to a side, the top, or the bottom of the view.  See [dockOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions) to override default options related to docking the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockEnabled)
    *
    * @default false
    */
  var dockEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices. When a popup is "dockEnabled" it means the popup no longer points to the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) assigned to it. Rather it is placed in one of the corners of the view or to the top or bottom of it. This property allows the developer to set various options for docking the popup.  See the object specification table below to override default docking properties on the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var dockOptions: js.UndefOr[PopupDockOptions] = js.native
  /**
    * Shows pagination for the popup if available. This allows the user to scroll through various [selected features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) using either arrows  ![popup-pagination-arrows](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popup-pagination-arrows.png)  or a menu.  ![popup-feature-menu](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popup-pagination-menu.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureNavigationEnabled)
    */
  var featureNavigationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * An array of features associated with the popup. Each graphic in this array must have a valid [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) set. They may share the same [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) or have unique [PopupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) depending on their attributes. The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) and [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) of the popup is set based on the `content` and `title` properties of each graphic's respective [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  When more than one graphic exists in this array, the current content of the Popup is set based on the value of the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature).  This value is `null` if no features are associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.native
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#highlightEnabled)
    *
    * @default true
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Point used to position the popup. This is automatically set when viewing the popup by selecting a feature. If using the Popup to display content not related to features in the map, such as the results from a task, then you must set this property before making the popup [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.native
  /**
    * Defines the maximum icons displayed at one time in the action area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#maxInlineActions)
    *
    * @default 3
    */
  var maxInlineActions: js.UndefOr[Double | js.Any] = js.native
  /**
    * An array of pending Promises that have not yet been fulfilled. If there are no pending promises, the value is `null`. When the pending promises are resolved they are removed from this array and the features they return are pushed into the [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises)
    */
  var promises: js.UndefOr[js.Array[js.Promise[_]]] = js.native
  /**
    * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature). When [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) are set, the first index is automatically selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeatureIndex)
    */
  var selectedFeatureIndex: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to display a spinner at the popup location prior to its display when it has pending promises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#spinnerEnabled)
    */
  var spinnerEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The title of the popup. This can be set generically on the popup no matter the features that are selected. If the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) has a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html), then the title set in the corresponding template is used here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [PopupViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#viewModel)
    */
  var viewModel: js.UndefOr[PopupViewModelProperties] = js.native
  /**
    * Indicates whether the popup is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visibleElements)
    */
  var visibleElements: js.UndefOr[PopupVisibleElements] = js.native
}

object PopupProperties {
  @scala.inline
  def apply(): PopupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupProperties]
  }
  @scala.inline
  implicit class PopupPropertiesOps[Self <: PopupProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: (ActionButton | ActionToggle)*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: CollectionProperties[ActionButton | ActionToggle]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setAlignment(
      value: auto | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` | js.Function
    ): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setAutoCloseEnabled(value: Boolean): Self = this.set("autoCloseEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCloseEnabled: Self = this.set("autoCloseEnabled", js.undefined)
    @scala.inline
    def setAutoOpenEnabled(value: Boolean): Self = this.set("autoOpenEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpenEnabled: Self = this.set("autoOpenEnabled", js.undefined)
    @scala.inline
    def setCollapseEnabled(value: Boolean): Self = this.set("collapseEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseEnabled: Self = this.set("collapseEnabled", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setContent(value: String | HTMLElement | WidgetProperties): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDefaultPopupTemplateEnabled(value: Boolean): Self = this.set("defaultPopupTemplateEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPopupTemplateEnabled: Self = this.set("defaultPopupTemplateEnabled", js.undefined)
    @scala.inline
    def setDockEnabled(value: Boolean): Self = this.set("dockEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockEnabled: Self = this.set("dockEnabled", js.undefined)
    @scala.inline
    def setDockOptions(value: PopupDockOptions): Self = this.set("dockOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockOptions: Self = this.set("dockOptions", js.undefined)
    @scala.inline
    def setFeatureNavigationEnabled(value: Boolean): Self = this.set("featureNavigationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureNavigationEnabled: Self = this.set("featureNavigationEnabled", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: GraphicProperties*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[GraphicProperties]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setHighlightEnabled(value: Boolean): Self = this.set("highlightEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightEnabled: Self = this.set("highlightEnabled", js.undefined)
    @scala.inline
    def setLocation(value: PointProperties): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMaxInlineActions(value: Double | js.Any): Self = this.set("maxInlineActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxInlineActions: Self = this.set("maxInlineActions", js.undefined)
    @scala.inline
    def setPromisesVarargs(value: js.Promise[js.Any]*): Self = this.set("promises", js.Array(value :_*))
    @scala.inline
    def setPromises(value: js.Array[js.Promise[_]]): Self = this.set("promises", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromises: Self = this.set("promises", js.undefined)
    @scala.inline
    def setSelectedFeatureIndex(value: Double): Self = this.set("selectedFeatureIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedFeatureIndex: Self = this.set("selectedFeatureIndex", js.undefined)
    @scala.inline
    def setSpinnerEnabled(value: Boolean): Self = this.set("spinnerEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinnerEnabled: Self = this.set("spinnerEnabled", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewModel(value: PopupViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setVisibleElements(value: PopupVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
  
}

