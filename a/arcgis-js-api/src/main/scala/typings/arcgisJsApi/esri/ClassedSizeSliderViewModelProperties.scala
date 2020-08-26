package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedSizeSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  /**
    * An array of class breaks with associated sizes. The size mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedSizeSliderViewModelBreaks]] = js.native
}

object ClassedSizeSliderViewModelProperties {
  @scala.inline
  def apply(): ClassedSizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedSizeSliderViewModelProperties]
  }
  @scala.inline
  implicit class ClassedSizeSliderViewModelPropertiesOps[Self <: ClassedSizeSliderViewModelProperties] (val x: Self) extends AnyVal {
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
    def setBreaksVarargs(value: ClassedSizeSliderViewModelBreaks*): Self = this.set("breaks", js.Array(value :_*))
    @scala.inline
    def setBreaks(value: js.Array[ClassedSizeSliderViewModelBreaks]): Self = this.set("breaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
  }
  
}

