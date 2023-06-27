package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupViewOpenPopupOptions extends StObject {
  
  /**
  		 * **Since:** 4.5		 When `true`, indicates that only the popup header will display.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Sets the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#content) of the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var content: js.UndefOr[String | HTMLElement | Widget_] = js.undefined
  
  /**
  		 * **Since:** 4.5		 This property enables multiple features in a popup to display in a list rather than displaying the first selected feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var featureMenuOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Sets the popup's [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#features), which populate the title and content of the popup based on each graphic's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
  		 * When `true`, indicates the popup should fetch the content of this feature and display it.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var fetchFeatures: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Sets the popup's [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#location), which is the geometry used to position the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var location: js.UndefOr[Geometry_] = js.undefined
  
  /**
  		 * Sets pending [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#promises) on the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var promises: js.UndefOr[js.Array[js.Promise[Any]]] = js.undefined
  
  /**
  		 * **Since:** 4.23		When `true`, indicates that the focus should be on the popup after it has been opened.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var shouldFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Sets the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#title) of the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  /**
  		 * When `true` indicates the popup should update its [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#location) for each paginated feature based on the [selected feature's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#selectedFeature) geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  var updateLocationEnabled: js.UndefOr[Boolean] = js.undefined
}
object PopupViewOpenPopupOptions {
  
  inline def apply(): PopupViewOpenPopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupViewOpenPopupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupViewOpenPopupOptions] (val x: Self) extends AnyVal {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
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
    
    inline def setShouldFocus(value: Boolean): Self = StObject.set(x, "shouldFocus", value.asInstanceOf[js.Any])
    
    inline def setShouldFocusUndefined: Self = StObject.set(x, "shouldFocus", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateLocationEnabled(value: Boolean): Self = StObject.set(x, "updateLocationEnabled", value.asInstanceOf[js.Any])
    
    inline def setUpdateLocationEnabledUndefined: Self = StObject.set(x, "updateLocationEnabled", js.undefined)
  }
}
