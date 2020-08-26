package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacitySliderProperties extends SmartMappingSliderBaseProperties {
  /**
    * The opacity stops from the [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) to link to the slider. The opacity values in these stops will be used to render the gradient on the slider. They should match the opacity rendered in the associated layer's opacity visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[OpacityStopProperties]] = js.native
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#style)
    */
  var style: js.UndefOr[OpacitySliderStyleProperties] = js.native
  /**
    * The view model for the OpacitySlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [OpacitySliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html) class to access all properties and methods on the OpacitySlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#viewModel)
    */
  var viewModel: js.UndefOr[OpacitySliderViewModelProperties] = js.native
}

object OpacitySliderProperties {
  @scala.inline
  def apply(): OpacitySliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacitySliderProperties]
  }
  @scala.inline
  implicit class OpacitySliderPropertiesOps[Self <: OpacitySliderProperties] (val x: Self) extends AnyVal {
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
    def setStopsVarargs(value: OpacityStopProperties*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[OpacityStopProperties]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    @scala.inline
    def setStyle(value: OpacitySliderStyleProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setViewModel(value: OpacitySliderViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

