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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupProperties
  extends WidgetProperties
     with GoToProperties {
  
  /**
    * Defines actions that may be executed by clicking the icon or image symbolizing them in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions)
    */
  var actions: js.UndefOr[CollectionProperties[ActionButtonProperties | ActionToggleProperties]] = js.native
  
  /**
    * Position of the popup in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#alignment)
    */
  var alignment: js.UndefOr[
    auto | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` | js.Function
  ] = js.native
  
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoCloseEnabled)
    */
  var autoCloseEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoOpenEnabled)
    */
  var autoOpenEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to enable collapse functionality for the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapseEnabled)
    */
  var collapseEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the popup displays its content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapsed)
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * The content of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content)
    */
  var content: js.UndefOr[String | HTMLElement | WidgetProperties] = js.native
  
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled)
    */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the placement of the popup is docked to the side of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockEnabled)
    */
  var dockEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var dockOptions: js.UndefOr[PopupDockOptions] = js.native
  
  /**
    * Shows pagination for the popup if available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureNavigationEnabled)
    */
  var featureNavigationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of features associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.native
  
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#highlightEnabled)
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Point used to position the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.native
  
  /**
    * Defines the maximum icons displayed at one time in the action area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#maxInlineActions)
    */
  var maxInlineActions: js.UndefOr[Double | js.Any] = js.native
  
  /**
    * An array of pending Promises that have not yet been fulfilled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises)
    */
  var promises: js.UndefOr[js.Array[js.Promise[_]]] = js.native
  
  /**
    * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature).
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
    * The title of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * This is a class that contains all the logic (properties and methods) that controls this widget's behavior.
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
    * The visible elements that are displayed within the widget.
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
    def setActionsVarargs(value: (ActionButtonProperties | ActionToggleProperties)*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: CollectionProperties[ActionButtonProperties | ActionToggleProperties]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
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
