package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupOpenOptions extends Object {
  /**
    * **Since:** 4.5    When `true`, indicates that only the popup header will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    *
    * @default false
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * Sets the the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var content: js.UndefOr[String | HTMLElement | Widget_] = js.native
  /**
    * **Since:** 4.5    This property enables multiple features in a popup to display in a list rather than displaying the first selected feature. Setting this to `true` allows the user to scroll through the list of features returned from the query and choose the selection they want to display within the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    *
    * @default false
    */
  var featureMenuOpen: js.UndefOr[Boolean] = js.native
  /**
    * Sets the popup's [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features), which populate the title and content of the popup based on each graphic's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.native
  /**
    * When `true`, indicates the popup should fetch the content of this feature and display it. If no [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) exists, a default template is created for the layer if [defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) = `true`. In order for this option to work, there must be a valid `view` and `location` set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    *
    * @default false
    */
  var fetchFeatures: js.UndefOr[Boolean] = js.native
  /**
    * Sets the popup's [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location), which is the geometry used to position the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var location: js.UndefOr[Geometry_] = js.native
  /**
    * Sets pending [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises) on the popup. The popup will display once the promises resolve. Each promise must resolve to an array of [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
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
    *
    * @default false
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
  implicit class PopupOpenOptionsOps[Self <: PopupOpenOptions] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setContent(value: String | HTMLElement | Widget_): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFeatureMenuOpen(value: Boolean): Self = this.set("featureMenuOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureMenuOpen: Self = this.set("featureMenuOpen", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: Graphic*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[Graphic]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setFetchFeatures(value: Boolean): Self = this.set("fetchFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchFeatures: Self = this.set("fetchFeatures", js.undefined)
    @scala.inline
    def setLocation(value: Geometry_): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPromisesVarargs(value: js.Promise[js.Any]*): Self = this.set("promises", js.Array(value :_*))
    @scala.inline
    def setPromises(value: js.Array[js.Promise[_]]): Self = this.set("promises", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromises: Self = this.set("promises", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdateLocationEnabled(value: Boolean): Self = this.set("updateLocationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateLocationEnabled: Self = this.set("updateLocationEnabled", js.undefined)
  }
  
}

