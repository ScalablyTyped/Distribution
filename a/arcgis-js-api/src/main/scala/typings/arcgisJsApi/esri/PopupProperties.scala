package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupProperties
  extends StObject
     with WidgetProperties
     with GoToProperties {
  
  /**
    * Defines actions that may be executed by clicking the icon or image symbolizing them in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions)
    */
  var actions: js.UndefOr[CollectionProperties[ActionButtonProperties | ActionToggleProperties]] = js.undefined
  
  /**
    * Position of the popup in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#alignment)
    */
  var alignment: js.UndefOr[
    auto | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` | js.Function
  ] = js.undefined
  
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoCloseEnabled)
    */
  var autoCloseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoOpenEnabled)
    */
  var autoOpenEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to enable collapse functionality for the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapseEnabled)
    */
  var collapseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the popup displays its content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapsed)
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content)
    */
  var content: js.UndefOr[String | HTMLElement | WidgetProperties] = js.undefined
  
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled)
    */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the placement of the popup is docked to the side of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockEnabled)
    */
  var dockEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var dockOptions: js.UndefOr[PopupDockOptions] = js.undefined
  
  /**
    * Shows pagination for the popup if available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureNavigationEnabled)
    */
  var featureNavigationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of features associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#highlightEnabled)
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Point used to position the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * Defines the maximum icons displayed at one time in the action area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#maxInlineActions)
    */
  var maxInlineActions: js.UndefOr[Double | js.Any] = js.undefined
  
  /**
    * An array of pending Promises that have not yet been fulfilled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises)
    */
  var promises: js.UndefOr[js.Array[js.Promise[js.Any]]] = js.undefined
  
  /**
    * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeatureIndex)
    */
  var selectedFeatureIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to display a spinner at the popup location prior to its display when it has pending promises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#spinnerEnabled)
    */
  var spinnerEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The title of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  
  /**
    * This is a class that contains all the logic (properties and methods) that controls this widget's behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#viewModel)
    */
  var viewModel: js.UndefOr[PopupViewModelProperties] = js.undefined
  
  /**
    * Indicates whether the popup is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visibleElements)
    */
  var visibleElements: js.UndefOr[PopupVisibleElements] = js.undefined
}
object PopupProperties {
  
  @scala.inline
  def apply(): PopupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupProperties]
  }
  
  @scala.inline
  implicit class PopupPropertiesMutableBuilder[Self <: PopupProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: CollectionProperties[ActionButtonProperties | ActionToggleProperties]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: (ActionButtonProperties | ActionToggleProperties)*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setAlignment(
      value: auto | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` | js.Function
    ): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setAutoCloseEnabled(value: Boolean): Self = StObject.set(x, "autoCloseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseEnabledUndefined: Self = StObject.set(x, "autoCloseEnabled", js.undefined)
    
    @scala.inline
    def setAutoOpenEnabled(value: Boolean): Self = StObject.set(x, "autoOpenEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOpenEnabledUndefined: Self = StObject.set(x, "autoOpenEnabled", js.undefined)
    
    @scala.inline
    def setCollapseEnabled(value: Boolean): Self = StObject.set(x, "collapseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseEnabledUndefined: Self = StObject.set(x, "collapseEnabled", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement | WidgetProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDefaultPopupTemplateEnabled(value: Boolean): Self = StObject.set(x, "defaultPopupTemplateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPopupTemplateEnabledUndefined: Self = StObject.set(x, "defaultPopupTemplateEnabled", js.undefined)
    
    @scala.inline
    def setDockEnabled(value: Boolean): Self = StObject.set(x, "dockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockEnabledUndefined: Self = StObject.set(x, "dockEnabled", js.undefined)
    
    @scala.inline
    def setDockOptions(value: PopupDockOptions): Self = StObject.set(x, "dockOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockOptionsUndefined: Self = StObject.set(x, "dockOptions", js.undefined)
    
    @scala.inline
    def setFeatureNavigationEnabled(value: Boolean): Self = StObject.set(x, "featureNavigationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureNavigationEnabledUndefined: Self = StObject.set(x, "featureNavigationEnabled", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[GraphicProperties]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: GraphicProperties*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setHighlightEnabled(value: Boolean): Self = StObject.set(x, "highlightEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightEnabledUndefined: Self = StObject.set(x, "highlightEnabled", js.undefined)
    
    @scala.inline
    def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaxInlineActions(value: Double | js.Any): Self = StObject.set(x, "maxInlineActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInlineActionsUndefined: Self = StObject.set(x, "maxInlineActions", js.undefined)
    
    @scala.inline
    def setPromises(value: js.Array[js.Promise[js.Any]]): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromisesUndefined: Self = StObject.set(x, "promises", js.undefined)
    
    @scala.inline
    def setPromisesVarargs(value: js.Promise[js.Any]*): Self = StObject.set(x, "promises", js.Array(value :_*))
    
    @scala.inline
    def setSelectedFeatureIndex(value: Double): Self = StObject.set(x, "selectedFeatureIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedFeatureIndexUndefined: Self = StObject.set(x, "selectedFeatureIndex", js.undefined)
    
    @scala.inline
    def setSpinnerEnabled(value: Boolean): Self = StObject.set(x, "spinnerEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerEnabledUndefined: Self = StObject.set(x, "spinnerEnabled", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: PopupViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElements(value: PopupVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
