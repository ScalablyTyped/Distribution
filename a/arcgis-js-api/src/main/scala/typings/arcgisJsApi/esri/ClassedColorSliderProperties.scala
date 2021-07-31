package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedColorSliderProperties
  extends StObject
     with SmartMappingSliderBaseProperties {
  
  /**
    * An array of class breaks with associated colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedColorSliderBreaks]] = js.undefined
  
  /**
    * The view model for the ClassedColorSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[ClassedColorSliderViewModelProperties] = js.undefined
}
object ClassedColorSliderProperties {
  
  @scala.inline
  def apply(): ClassedColorSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedColorSliderProperties]
  }
  
  @scala.inline
  implicit class ClassedColorSliderPropertiesMutableBuilder[Self <: ClassedColorSliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreaks(value: js.Array[ClassedColorSliderBreaks]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    @scala.inline
    def setBreaksVarargs(value: ClassedColorSliderBreaks*): Self = StObject.set(x, "breaks", js.Array(value :_*))
    
    @scala.inline
    def setViewModel(value: ClassedColorSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
