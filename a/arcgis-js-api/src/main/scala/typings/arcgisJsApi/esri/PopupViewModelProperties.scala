package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupViewModelProperties extends GoToProperties {
  /**
    * [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) objects. Each action may be executed by clicking the icon or image symbolizing them in the popup. By default, every popup has a `zoom-to` action styled with a magnifying glass icon ![popupTemplate-zoom-action](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-zoom-action.png). When this icon is clicked, the view zooms in four LODs and centers on the selected feature.  You may override this action by removing it from the actions [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) or by setting the [overwriteActions](esri-PopupTemplate.html#overwriteActions) property to `true` in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). The order of each action in the popup is the order in which they appear in the actions [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html).  The [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#event-trigger-action) event fires each time an action in the popup is clicked. This event should be used to execute custom code for each action clicked. For example, if you would like to add a `zoom-out` action to the popup that zooms the view out several LODs, you would define the zoom-out code in a separate function. Then you would call the custom `zoom-out` function in the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#event-trigger-action) event handler. See the sample code snippet below for more details on how this works.  Actions are defined with the properties listed in the [ActionButton](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [ActionToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#actions)
    */
  var actions: js.UndefOr[CollectionProperties[ActionButton | ActionToggle]] = js.native
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#autoCloseEnabled)
    *
    * @default false
    */
  var autoCloseEnabled: js.UndefOr[Boolean] = js.native
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.  Use `view.popup.autoOpenEnabled = false;` when needing to stop the click event propagation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#autoOpenEnabled)
    *
    * @default true
    */
  var autoOpenEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The content of the popup. When set directly on the Popup, this content may only be static and cannot use fields to set content templates. To set a template for the content based on field or attribute names, see [PopupTemplate.content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content)
    */
  var content: js.UndefOr[String | HTMLElement | WidgetProperties] = js.native
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined. Automatic popup templates are supported for layers that support the `createPopupTemplate` method. (Supported for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html), and [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#defaultPopupTemplateEnabled)
    *
    * @default false
    */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.native
  /**
    * An array of features associated with the popup. Each graphic in this array must have a valid [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) set. They may share the same [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) or have unique [PopupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) depending on their attributes. The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content) and [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title) of the poup is set based on the `content` and `title` properties of each graphic's respective [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  When more than one graphic exists in this array, the current content of the Popup is set based on the value of the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature).  This value is `null` if no features are associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.native
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#highlightEnabled)
    *
    * @default true
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Geometry used to position the popup. This is automatically set when viewing the popup by selecting a feature. If using the Popup to display content not related to features in the map, such as the results from a task, then you must set this property before making the popup [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#visible) to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.native
  /**
    * An array of pending Promises that have not yet been fulfilled. If there are no pending Promises, the value is `null`. When the pending Promises are resolved they are removed from this array and the features they return are pushed into the [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises)
    */
  var promises: js.UndefOr[js.Array[js.Promise[_]]] = js.native
  /**
    * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature). When [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features) are set, the first index is automatically selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeatureIndex)
    */
  var selectedFeatureIndex: js.UndefOr[Double] = js.native
  /**
    * The title of the popup. This can be set generically on the popup no matter the features that are selected. If the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature) has a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html), then the title set in the corresponding template is used here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The view associated with the Popup instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * Indicates whether the popup is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object PopupViewModelProperties {
  @scala.inline
  def apply(): PopupViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupViewModelProperties]
  }
  @scala.inline
  implicit class PopupViewModelPropertiesOps[Self <: PopupViewModelProperties] (val x: Self) extends AnyVal {
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
    def setAutoCloseEnabled(value: Boolean): Self = this.set("autoCloseEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCloseEnabled: Self = this.set("autoCloseEnabled", js.undefined)
    @scala.inline
    def setAutoOpenEnabled(value: Boolean): Self = this.set("autoOpenEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpenEnabled: Self = this.set("autoOpenEnabled", js.undefined)
    @scala.inline
    def setContent(value: String | HTMLElement | WidgetProperties): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDefaultPopupTemplateEnabled(value: Boolean): Self = this.set("defaultPopupTemplateEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPopupTemplateEnabled: Self = this.set("defaultPopupTemplateEnabled", js.undefined)
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

