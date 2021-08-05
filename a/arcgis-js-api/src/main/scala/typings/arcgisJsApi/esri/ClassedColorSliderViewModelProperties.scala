package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedColorSliderViewModelProperties
  extends StObject
     with SmartMappingSliderViewModelProperties {
  
  /**
    * An array of class breaks with associated colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedColorSliderViewModelBreaks]] = js.undefined
}
object ClassedColorSliderViewModelProperties {
  
  inline def apply(): ClassedColorSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedColorSliderViewModelProperties]
  }
  
  extension [Self <: ClassedColorSliderViewModelProperties](x: Self) {
    
    inline def setBreaks(value: js.Array[ClassedColorSliderViewModelBreaks]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    inline def setBreaksVarargs(value: ClassedColorSliderViewModelBreaks*): Self = StObject.set(x, "breaks", js.Array(value :_*))
  }
}
