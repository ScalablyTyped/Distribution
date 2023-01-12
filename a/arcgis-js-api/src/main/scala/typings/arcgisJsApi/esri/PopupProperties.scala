package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ActionButtonPropertiestyp
import typings.arcgisJsApi.anon.ActionTogglePropertiestyp
import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
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
  var actions: js.UndefOr[CollectionProperties[ActionButtonPropertiestyp | ActionTogglePropertiestyp]] = js.undefined
  
  /**
    * Position of the popup in relation to the selected feature.
    *
    * @default auto
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#alignment)
    */
  var alignment: js.UndefOr[
    auto | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` | js.Function
  ] = js.undefined
  
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoCloseEnabled)
    */
  var autoCloseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoOpenEnabled)
    */
  var autoOpenEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to enable collapse functionality for the popup.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapseEnabled)
    */
  var collapseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the popup displays its content.
    *
    * @default false
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
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled)
    */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the placement of the popup is docked to the side of the view.
    *
    * @default false
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
    * An array of features associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
    * Indicates the heading level to use for the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) of the popup.
    *
    * @default 2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#headingLevel)
    */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default true
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
    * @default 3
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#maxInlineActions)
    */
  var maxInlineActions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An array of pending Promises that have not yet been fulfilled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises)
    */
  var promises: js.UndefOr[js.Array[js.Promise[Any]]] = js.undefined
  
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
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
    * This is a class that contains all the logic (properties and methods) that controls this widget's behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#viewModel)
    */
  var viewModel: js.UndefOr[PopupViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visibleElements)
    */
  var visibleElements: js.UndefOr[PopupVisibleElements] = js.undefined
}
object PopupProperties {
  
  inline def apply(): PopupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupProperties] (val x: Self) extends AnyVal {
    
    inline def setActions(value: CollectionProperties[ActionButtonPropertiestyp | ActionTogglePropertiestyp]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (ActionButtonPropertiestyp | ActionTogglePropertiestyp)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAlignment(
      value: auto | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` | js.Function
    ): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAutoCloseEnabled(value: Boolean): Self = StObject.set(x, "autoCloseEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseEnabledUndefined: Self = StObject.set(x, "autoCloseEnabled", js.undefined)
    
    inline def setAutoOpenEnabled(value: Boolean): Self = StObject.set(x, "autoOpenEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoOpenEnabledUndefined: Self = StObject.set(x, "autoOpenEnabled", js.undefined)
    
    inline def setCollapseEnabled(value: Boolean): Self = StObject.set(x, "collapseEnabled", value.asInstanceOf[js.Any])
    
    inline def setCollapseEnabledUndefined: Self = StObject.set(x, "collapseEnabled", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setContent(value: String | HTMLElement | WidgetProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDefaultPopupTemplateEnabled(value: Boolean): Self = StObject.set(x, "defaultPopupTemplateEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultPopupTemplateEnabledUndefined: Self = StObject.set(x, "defaultPopupTemplateEnabled", js.undefined)
    
    inline def setDockEnabled(value: Boolean): Self = StObject.set(x, "dockEnabled", value.asInstanceOf[js.Any])
    
    inline def setDockEnabledUndefined: Self = StObject.set(x, "dockEnabled", js.undefined)
    
    inline def setDockOptions(value: PopupDockOptions): Self = StObject.set(x, "dockOptions", value.asInstanceOf[js.Any])
    
    inline def setDockOptionsUndefined: Self = StObject.set(x, "dockOptions", js.undefined)
    
    inline def setFeatures(value: js.Array[GraphicProperties]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: GraphicProperties*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setHighlightEnabled(value: Boolean): Self = StObject.set(x, "highlightEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightEnabledUndefined: Self = StObject.set(x, "highlightEnabled", js.undefined)
    
    inline def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxInlineActions(value: Double): Self = StObject.set(x, "maxInlineActions", value.asInstanceOf[js.Any])
    
    inline def setMaxInlineActionsNull: Self = StObject.set(x, "maxInlineActions", null)
    
    inline def setMaxInlineActionsUndefined: Self = StObject.set(x, "maxInlineActions", js.undefined)
    
    inline def setPromises(value: js.Array[js.Promise[Any]]): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
    
    inline def setPromisesUndefined: Self = StObject.set(x, "promises", js.undefined)
    
    inline def setPromisesVarargs(value: js.Promise[Any]*): Self = StObject.set(x, "promises", js.Array(value*))
    
    inline def setSelectedFeatureIndex(value: Double): Self = StObject.set(x, "selectedFeatureIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedFeatureIndexUndefined: Self = StObject.set(x, "selectedFeatureIndex", js.undefined)
    
    inline def setSpinnerEnabled(value: Boolean): Self = StObject.set(x, "spinnerEnabled", value.asInstanceOf[js.Any])
    
    inline def setSpinnerEnabledUndefined: Self = StObject.set(x, "spinnerEnabled", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: PopupViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: PopupVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
