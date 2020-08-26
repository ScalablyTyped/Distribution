package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapSliderProperties extends WidgetProperties {
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.native
  /**
    * The view model for the Heatmap widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the module:esri/widgets/smartMapping/HeatmapSlider/HeatmapliderViewModel class to access all properties and methods on the HeatmapSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[HeatmapSliderViewModelProperties] = js.native
}

object HeatmapSliderProperties {
  @scala.inline
  def apply(): HeatmapSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapSliderProperties]
  }
  @scala.inline
  implicit class HeatmapSliderPropertiesOps[Self <: HeatmapSliderProperties] (val x: Self) extends AnyVal {
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
    def setStopsVarargs(value: HeatmapColorStopProperties*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[HeatmapColorStopProperties]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    @scala.inline
    def setViewModel(value: HeatmapSliderViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

