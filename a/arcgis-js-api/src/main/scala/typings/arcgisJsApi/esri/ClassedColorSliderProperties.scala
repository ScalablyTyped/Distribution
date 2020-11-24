package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassedColorSliderProperties extends SmartMappingSliderBaseProperties {
  
  /**
    * An array of class breaks with associated colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedColorSliderBreaks]] = js.native
  
  /**
    * The view model for the ClassedColorSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[ClassedColorSliderViewModelProperties] = js.native
}
object ClassedColorSliderProperties {
  
  @scala.inline
  def apply(): ClassedColorSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedColorSliderProperties]
  }
  
  @scala.inline
  implicit class ClassedColorSliderPropertiesOps[Self <: ClassedColorSliderProperties] (val x: Self) extends AnyVal {
    
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
    def setBreaksVarargs(value: ClassedColorSliderBreaks*): Self = this.set("breaks", js.Array(value :_*))
    
    @scala.inline
    def setBreaks(value: js.Array[ClassedColorSliderBreaks]): Self = this.set("breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
    
    @scala.inline
    def setViewModel(value: ClassedColorSliderViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
