package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.rooftop
import typings.arcgisJsApi.arcgisJsApiStrings.street
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocatorSearchSourceProperties
  extends StObject
     with SearchSourceProperties {
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#apiKey)
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
    * A string array which limits the results to one or more categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#categories)
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Constricts search results to a specified country code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#countryCode)
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the scale of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) for the resulting search result, if the locator service doesn’t return an extent with a scale.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#defaultZoomScale)
    */
  var defaultZoomScale: js.UndefOr[Double] = js.undefined
  
  /**
    * This property controls prioritization of [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget result candidates depending on the view scale.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#localSearchDisabled)
    */
  var localSearchDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the type of location, either `street` or `rooftop`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locationType)
    */
  var locationType: js.UndefOr[rooftop | street] = js.undefined
  
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#searchTemplate)
    */
  var searchTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * The field name of the Single Line Address Field in the REST services directory for the locator service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#singleLineFieldName)
    */
  var singleLineFieldName: js.UndefOr[String] = js.undefined
  
  /**
    * URL to the ArcGIS Server REST resource that represents a locator service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object LocatorSearchSourceProperties {
  
  inline def apply(): LocatorSearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocatorSearchSourceProperties]
  }
  
  extension [Self <: LocatorSearchSourceProperties](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setDefaultZoomScale(value: Double): Self = StObject.set(x, "defaultZoomScale", value.asInstanceOf[js.Any])
    
    inline def setDefaultZoomScaleUndefined: Self = StObject.set(x, "defaultZoomScale", js.undefined)
    
    inline def setLocalSearchDisabled(value: Boolean): Self = StObject.set(x, "localSearchDisabled", value.asInstanceOf[js.Any])
    
    inline def setLocalSearchDisabledUndefined: Self = StObject.set(x, "localSearchDisabled", js.undefined)
    
    inline def setLocationType(value: rooftop | street): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSearchTemplate(value: String): Self = StObject.set(x, "searchTemplate", value.asInstanceOf[js.Any])
    
    inline def setSearchTemplateUndefined: Self = StObject.set(x, "searchTemplate", js.undefined)
    
    inline def setSingleLineFieldName(value: String): Self = StObject.set(x, "singleLineFieldName", value.asInstanceOf[js.Any])
    
    inline def setSingleLineFieldNameUndefined: Self = StObject.set(x, "singleLineFieldName", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
