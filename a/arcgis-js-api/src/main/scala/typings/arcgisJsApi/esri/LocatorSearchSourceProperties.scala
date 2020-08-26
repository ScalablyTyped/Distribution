package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.rooftop
import typings.arcgisJsApi.arcgisJsApiStrings.street
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocatorSearchSourceProperties extends SearchSourceProperties {
  /**
    * A string array which limits the results to one or more categories. For example, `Populated Place` or `airport`. Only applicable when using the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#categories)
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Constricts search results to a specified country code. For example, `US` for United States or `SE` for Sweden. Only applies to the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#countryCode)
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * Sets the scale of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) for the resulting search result, if the locator service doesn’t return an extent with a scale. An example of this is using the `Use current location` option in the Search bar.  If you want to override the scale returned by the locator service, use [zoomScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#zoomScale) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#defaultZoomScale)
    *
    * @default null
    */
  var defaultZoomScale: js.UndefOr[Double] = js.native
  /**
    * Defines the type of location, either `street` or `rooftop`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locationType)
    */
  var locationType: js.UndefOr[rooftop | street] = js.native
  /**
    * The locator task used to search. This is **required** and defaults to the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
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
    * The field name of the Single Line Address Field in the REST services directory for the locator service. Common values are `SingleLine` and `SingleLineFieldName`.
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
  implicit class LocatorSearchSourcePropertiesOps[Self <: LocatorSearchSourceProperties] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setDefaultZoomScale(value: Double): Self = this.set("defaultZoomScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultZoomScale: Self = this.set("defaultZoomScale", js.undefined)
    @scala.inline
    def setLocationType(value: rooftop | street): Self = this.set("locationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    @scala.inline
    def setLocator(value: LocatorProperties): Self = this.set("locator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocator: Self = this.set("locator", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSearchTemplate(value: String): Self = this.set("searchTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchTemplate: Self = this.set("searchTemplate", js.undefined)
    @scala.inline
    def setSingleLineFieldName(value: String): Self = this.set("singleLineFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleLineFieldName: Self = this.set("singleLineFieldName", js.undefined)
  }
  
}

