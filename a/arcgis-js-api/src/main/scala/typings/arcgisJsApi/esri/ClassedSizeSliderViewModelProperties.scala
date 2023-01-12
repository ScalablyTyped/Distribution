package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedSizeSliderViewModelProperties
  extends StObject
     with SmartMappingSliderViewModelProperties {
  
  /**
    * An array of class breaks with associated sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedSizeSliderViewModelBreaks]] = js.undefined
}
object ClassedSizeSliderViewModelProperties {
  
  inline def apply(): ClassedSizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedSizeSliderViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassedSizeSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setBreaks(value: js.Array[ClassedSizeSliderViewModelBreaks]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    inline def setBreaksVarargs(value: ClassedSizeSliderViewModelBreaks*): Self = StObject.set(x, "breaks", js.Array(value*))
  }
}
