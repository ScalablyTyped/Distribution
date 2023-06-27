package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturesOpenOptions extends StObject {
  
  /**
  		 * This property allows you to specify a collection of [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) to the action bar when the Features widget opens.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  var actions: js.UndefOr[Collection[ActionButton]] = js.undefined
  
  /**
  		 * Sets the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#content) of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  var content: js.UndefOr[String | HTMLElement | Widget_] = js.undefined
  
  /**
  		 * This property enables multiple features in the widget to display in a list rather than displaying the first selected feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  var featureMenuOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Sets the widget's [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#features), which populate the title and content of the widget based on each graphic's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
  		 * When `true`, indicates the widget should fetch the content of this feature and display it.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  var fetchFeatures: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The geometry used to query for the features when `fetchFeatures=true`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  var location: js.UndefOr[Geometry_] = js.undefined
  
  /**
  		 * Sets pending [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#promises) on the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  var promises: js.UndefOr[js.Array[js.Promise[Any]]] = js.undefined
  
  /**
  		 * Sets the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#title) of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates whether to update the location when the [selectedFeatureIndex](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#selectedFeatureIndex) changes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Features.html#open)
  		 */
  var updateLocationEnabled: js.UndefOr[String] = js.undefined
}
object FeaturesOpenOptions {
  
  inline def apply(): FeaturesOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturesOpenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturesOpenOptions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: Collection[ActionButton]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setContent(value: String | HTMLElement | Widget_): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFeatureMenuOpen(value: Boolean): Self = StObject.set(x, "featureMenuOpen", value.asInstanceOf[js.Any])
    
    inline def setFeatureMenuOpenUndefined: Self = StObject.set(x, "featureMenuOpen", js.undefined)
    
    inline def setFeatures(value: js.Array[Graphic]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFetchFeatures(value: Boolean): Self = StObject.set(x, "fetchFeatures", value.asInstanceOf[js.Any])
    
    inline def setFetchFeaturesUndefined: Self = StObject.set(x, "fetchFeatures", js.undefined)
    
    inline def setLocation(value: Geometry_): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPromises(value: js.Array[js.Promise[Any]]): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
    
    inline def setPromisesUndefined: Self = StObject.set(x, "promises", js.undefined)
    
    inline def setPromisesVarargs(value: js.Promise[Any]*): Self = StObject.set(x, "promises", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateLocationEnabled(value: String): Self = StObject.set(x, "updateLocationEnabled", value.asInstanceOf[js.Any])
    
    inline def setUpdateLocationEnabledUndefined: Self = StObject.set(x, "updateLocationEnabled", js.undefined)
  }
}
