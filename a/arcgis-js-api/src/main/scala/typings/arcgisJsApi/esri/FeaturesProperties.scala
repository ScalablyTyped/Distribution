package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturesProperties
  extends StObject
     with WidgetProperties
     with GoToProperties {
  
  /**
  		 * The content of the Features widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#content)
  		 */
  var content: js.UndefOr[String | HTMLElement | WidgetProperties] = js.undefined
  
  /**
  		 * An array of features associated with the Features widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#features)
  		 */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
  		 * Indicates the heading level to use for the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#title) of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#headingLevel)
  		 */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An array of pending Promises that have not yet been fulfilled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#promises)
  		 */
  var promises: js.UndefOr[js.Promise[Any]] = js.undefined
  
  /**
  		 * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#selectedFeature).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#selectedFeatureIndex)
  		 */
  var selectedFeatureIndex: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The title of the Features widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
  		 * This is a class that contains all the logic (properties and methods) that controls this widget's behavior.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#viewModel)
  		 */
  var viewModel: js.UndefOr[FeaturesViewModelProperties] = js.undefined
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#visibleElements)
  		 */
  var visibleElements: js.UndefOr[FeaturesVisibleElements] = js.undefined
}
object FeaturesProperties {
  
  inline def apply(): FeaturesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturesProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturesProperties] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String | HTMLElement | WidgetProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFeatures(value: js.Array[GraphicProperties]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: GraphicProperties*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setPromises(value: js.Promise[Any]): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
    
    inline def setPromisesUndefined: Self = StObject.set(x, "promises", js.undefined)
    
    inline def setSelectedFeatureIndex(value: Double): Self = StObject.set(x, "selectedFeatureIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedFeatureIndexUndefined: Self = StObject.set(x, "selectedFeatureIndex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: FeaturesViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: FeaturesVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
