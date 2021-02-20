package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupOpenOptions extends Object {
  
  /**
    * **Since:** 4.5    When `true`, indicates that only the popup header will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var content: js.UndefOr[String | HTMLElement | Widget_] = js.native
  
  /**
    * **Since:** 4.5    This property enables multiple features in a popup to display in a list rather than displaying the first selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var featureMenuOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the popup's [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features), which populate the title and content of the popup based on each graphic's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.native
  
  /**
    * When `true`, indicates the popup should fetch the content of this feature and display it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var fetchFeatures: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the popup's [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location), which is the geometry used to position the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var location: js.UndefOr[Geometry_] = js.native
  
  /**
    * Sets pending [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises) on the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var promises: js.UndefOr[js.Array[js.Promise[_]]] = js.native
  
  /**
    * Sets the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * When `true` indicates the popup should update its [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) for each paginated feature based on the [selected feature's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var updateLocationEnabled: js.UndefOr[Boolean] = js.native
}
object PopupOpenOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PopupOpenOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PopupOpenOptions]
  }
  
  @scala.inline
  implicit class PopupOpenOptionsMutableBuilder[Self <: PopupOpenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement | Widget_): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFeatureMenuOpen(value: Boolean): Self = StObject.set(x, "featureMenuOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureMenuOpenUndefined: Self = StObject.set(x, "featureMenuOpen", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[Graphic]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setFetchFeatures(value: Boolean): Self = StObject.set(x, "fetchFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchFeaturesUndefined: Self = StObject.set(x, "fetchFeatures", js.undefined)
    
    @scala.inline
    def setLocation(value: Geometry_): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPromises(value: js.Array[js.Promise[_]]): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromisesUndefined: Self = StObject.set(x, "promises", js.undefined)
    
    @scala.inline
    def setPromisesVarargs(value: js.Promise[js.Any]*): Self = StObject.set(x, "promises", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateLocationEnabled(value: Boolean): Self = StObject.set(x, "updateLocationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLocationEnabledUndefined: Self = StObject.set(x, "updateLocationEnabled", js.undefined)
  }
}
