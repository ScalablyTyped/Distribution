package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ActionButtonPropertiestyp
import typings.arcgisJsApi.anon.ActionTogglePropertiestyp
import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupViewModelProperties
  extends StObject
     with GoToProperties {
  
  /**
  		 * [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#actions)
  		 */
  var actions: js.UndefOr[CollectionProperties[ActionButtonPropertiestyp | ActionTogglePropertiestyp]] = js.undefined
  
  /**
  		 * This closes the widget when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#autoCloseEnabled)
  		 */
  var autoCloseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.
  		 *
  		 * @default true
  		 * @deprecated since 4.27. Use {@link module:esri/core/MapView#popupEnabled MapView/SceneView.popupEnabled} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#autoOpenEnabled)
  		 */
  var autoOpenEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates if the "Browse features" experience is active in a [cluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html) popup.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#browseClusterEnabled)
  		 */
  var browseClusterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The content of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#content)
  		 */
  var content: js.UndefOr[String | HTMLElement | WidgetProperties] = js.undefined
  
  /**
  		 * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#defaultPopupTemplateEnabled)
  		 */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Defines the specific [abilities](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#Abilities) that the widget should use when querying and displaying its content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#featureViewModelAbilities)
  		 */
  var featureViewModelAbilities: js.UndefOr[Abilities] = js.undefined
  
  /**
  		 * An array of features associated with the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#features)
  		 */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
  		 * The number of features to fetch at one time.
  		 *
  		 * @default 20
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#featuresPerPage)
  		 */
  var featuresPerPage: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Highlight the selected feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#highlightEnabled)
  		 */
  var highlightEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether or not to include [defaultActions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#defaultActions) in the widget's UI.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#includeDefaultActions)
  		 */
  var includeDefaultActions: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Geometry used to position the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#location)
  		 */
  var location: js.UndefOr[PointProperties] = js.undefined
  
  /**
  		 * An array of pending Promises that have not yet been fulfilled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#promises)
  		 */
  var promises: js.UndefOr[js.Array[js.Promise[Any]]] = js.undefined
  
  /**
  		 * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeature).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#selectedFeatureIndex)
  		 */
  var selectedFeatureIndex: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The title of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  /**
  		 * The view associated with the widget instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
  		 * Indicates whether the widget is visible.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PopupViewModelProperties {
  
  inline def apply(): PopupViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setActions(value: CollectionProperties[ActionButtonPropertiestyp | ActionTogglePropertiestyp]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (ActionButtonPropertiestyp | ActionTogglePropertiestyp)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAutoCloseEnabled(value: Boolean): Self = StObject.set(x, "autoCloseEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseEnabledUndefined: Self = StObject.set(x, "autoCloseEnabled", js.undefined)
    
    inline def setAutoOpenEnabled(value: Boolean): Self = StObject.set(x, "autoOpenEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoOpenEnabledUndefined: Self = StObject.set(x, "autoOpenEnabled", js.undefined)
    
    inline def setBrowseClusterEnabled(value: Boolean): Self = StObject.set(x, "browseClusterEnabled", value.asInstanceOf[js.Any])
    
    inline def setBrowseClusterEnabledUndefined: Self = StObject.set(x, "browseClusterEnabled", js.undefined)
    
    inline def setContent(value: String | HTMLElement | WidgetProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDefaultPopupTemplateEnabled(value: Boolean): Self = StObject.set(x, "defaultPopupTemplateEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultPopupTemplateEnabledUndefined: Self = StObject.set(x, "defaultPopupTemplateEnabled", js.undefined)
    
    inline def setFeatureViewModelAbilities(value: Abilities): Self = StObject.set(x, "featureViewModelAbilities", value.asInstanceOf[js.Any])
    
    inline def setFeatureViewModelAbilitiesUndefined: Self = StObject.set(x, "featureViewModelAbilities", js.undefined)
    
    inline def setFeatures(value: js.Array[GraphicProperties]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesPerPage(value: Double): Self = StObject.set(x, "featuresPerPage", value.asInstanceOf[js.Any])
    
    inline def setFeaturesPerPageUndefined: Self = StObject.set(x, "featuresPerPage", js.undefined)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: GraphicProperties*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setHighlightEnabled(value: Boolean): Self = StObject.set(x, "highlightEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightEnabledUndefined: Self = StObject.set(x, "highlightEnabled", js.undefined)
    
    inline def setIncludeDefaultActions(value: Boolean): Self = StObject.set(x, "includeDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultActionsUndefined: Self = StObject.set(x, "includeDefaultActions", js.undefined)
    
    inline def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPromises(value: js.Array[js.Promise[Any]]): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
    
    inline def setPromisesUndefined: Self = StObject.set(x, "promises", js.undefined)
    
    inline def setPromisesVarargs(value: js.Promise[Any]*): Self = StObject.set(x, "promises", js.Array(value*))
    
    inline def setSelectedFeatureIndex(value: Double): Self = StObject.set(x, "selectedFeatureIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedFeatureIndexUndefined: Self = StObject.set(x, "selectedFeatureIndex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
