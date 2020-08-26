package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributionProperties extends WidgetProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * Text used to split attribution by [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#itemDelimiter)
    *
    * @default |
    */
  var itemDelimiter: js.UndefOr[String] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [AttributionViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#viewModel)
    */
  var viewModel: js.UndefOr[AttributionViewModelProperties] = js.native
}

object AttributionProperties {
  @scala.inline
  def apply(): AttributionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributionProperties]
  }
  @scala.inline
  implicit class AttributionPropertiesOps[Self <: AttributionProperties] (val x: Self) extends AnyVal {
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
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setItemDelimiter(value: String): Self = this.set("itemDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemDelimiter: Self = this.set("itemDelimiter", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewModel(value: AttributionViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

