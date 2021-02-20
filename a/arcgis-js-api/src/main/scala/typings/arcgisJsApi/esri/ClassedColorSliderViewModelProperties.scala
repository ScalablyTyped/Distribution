package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassedColorSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  
  /**
    * An array of class breaks with associated colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedColorSliderViewModelBreaks]] = js.native
}
object ClassedColorSliderViewModelProperties {
  
  @scala.inline
  def apply(): ClassedColorSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedColorSliderViewModelProperties]
  }
  
  @scala.inline
  implicit class ClassedColorSliderViewModelPropertiesMutableBuilder[Self <: ClassedColorSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreaks(value: js.Array[ClassedColorSliderViewModelBreaks]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    @scala.inline
    def setBreaksVarargs(value: ClassedColorSliderViewModelBreaks*): Self = StObject.set(x, "breaks", js.Array(value :_*))
  }
}
