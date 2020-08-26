package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapToggleViewModelProperties extends js.Object {
  /**
    * The next basemap for toggling. One of the following values may be set to this property:
    *   * The [string ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) of any Esri basemap.
    *   * A custom [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) object. Since this property may be [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting), the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) module does not need to be included in the `require()` function in most applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#nextBasemap)
    */
  var nextBasemap: js.UndefOr[BasemapProperties | String] = js.native
  /**
    * The view from which the widget will operate. This view provides access to the initial [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) to toggle from via the view's [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object BasemapToggleViewModelProperties {
  @scala.inline
  def apply(): BasemapToggleViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapToggleViewModelProperties]
  }
  @scala.inline
  implicit class BasemapToggleViewModelPropertiesOps[Self <: BasemapToggleViewModelProperties] (val x: Self) extends AnyVal {
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
    def setNextBasemap(value: BasemapProperties | String): Self = this.set("nextBasemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextBasemap: Self = this.set("nextBasemap", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

