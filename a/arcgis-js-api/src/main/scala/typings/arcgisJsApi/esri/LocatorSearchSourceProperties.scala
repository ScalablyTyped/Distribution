package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.rooftop
import typings.arcgisJsApi.arcgisJsApiStrings.street
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocatorSearchSourceProperties extends SearchSourceProperties {
  
  /**
    * A string array which limits the results to one or more categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#categories)
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Constricts search results to a specified country code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#countryCode)
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * Sets the scale of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) for the resulting search result, if the locator service doesn’t return an extent with a scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#defaultZoomScale)
    */
  var defaultZoomScale: js.UndefOr[Double] = js.native
  
  /**
    * Defines the type of location, either `street` or `rooftop`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locationType)
    */
  var locationType: js.UndefOr[rooftop | street] = js.native
  
  /**
    * The locator task used to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locator)
    */
  var locator: js.UndefOr[LocatorProperties] = js.native
  
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#searchTemplate)
    */
  var searchTemplate: js.UndefOr[String] = js.native
  
  /**
    * The field name of the Single Line Address Field in the REST services directory for the locator service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#singleLineFieldName)
    */
  var singleLineFieldName: js.UndefOr[String] = js.native
}
object LocatorSearchSourceProperties {
  
  @scala.inline
  def apply(): LocatorSearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocatorSearchSourceProperties]
  }
  
  @scala.inline
  implicit class LocatorSearchSourcePropertiesMutableBuilder[Self <: LocatorSearchSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setDefaultZoomScale(value: Double): Self = StObject.set(x, "defaultZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultZoomScaleUndefined: Self = StObject.set(x, "defaultZoomScale", js.undefined)
    
    @scala.inline
    def setLocationType(value: rooftop | street): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setLocator(value: LocatorProperties): Self = StObject.set(x, "locator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocatorUndefined: Self = StObject.set(x, "locator", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSearchTemplate(value: String): Self = StObject.set(x, "searchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTemplateUndefined: Self = StObject.set(x, "searchTemplate", js.undefined)
    
    @scala.inline
    def setSingleLineFieldName(value: String): Self = StObject.set(x, "singleLineFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleLineFieldNameUndefined: Self = StObject.set(x, "singleLineFieldName", js.undefined)
  }
}
