package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapLayerListViewModelProperties extends js.Object {
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html). Each list item can be modified according to its modifiable properties. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#baseListItemCreatedFunction)
    */
  var baseListItemCreatedFunction: js.UndefOr[js.Function] = js.native
  /**
    * The current basemap's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#basemapTitle)
    */
  var basemapTitle: js.UndefOr[String] = js.native
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing reference layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#referenceListItemCreatedFunction)
    */
  var referenceListItemCreatedFunction: js.UndefOr[js.Function] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object BasemapLayerListViewModelProperties {
  @scala.inline
  def apply(): BasemapLayerListViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapLayerListViewModelProperties]
  }
  @scala.inline
  implicit class BasemapLayerListViewModelPropertiesOps[Self <: BasemapLayerListViewModelProperties] (val x: Self) extends AnyVal {
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
    def setBaseListItemCreatedFunction(value: js.Function): Self = this.set("baseListItemCreatedFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseListItemCreatedFunction: Self = this.set("baseListItemCreatedFunction", js.undefined)
    @scala.inline
    def setBasemapTitle(value: String): Self = this.set("basemapTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemapTitle: Self = this.set("basemapTitle", js.undefined)
    @scala.inline
    def setReferenceListItemCreatedFunction(value: js.Function): Self = this.set("referenceListItemCreatedFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceListItemCreatedFunction: Self = this.set("referenceListItemCreatedFunction", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

