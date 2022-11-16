package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateContinuousRendererParamsColorOptions extends StObject {
  
  /**
    * In authoring apps, the user may select a pre-defined color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  
  /**
    * Only applies to the `above-and-below` theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var isContinuous: js.UndefOr[Boolean] = js.undefined
}
object univariateColorSizeCreateContinuousRendererParamsColorOptions {
  
  inline def apply(): univariateColorSizeCreateContinuousRendererParamsColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsColorOptions]
  }
  
  extension [Self <: univariateColorSizeCreateContinuousRendererParamsColorOptions](x: Self) {
    
    inline def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    inline def setIsContinuous(value: Boolean): Self = StObject.set(x, "isContinuous", value.asInstanceOf[js.Any])
    
    inline def setIsContinuousUndefined: Self = StObject.set(x, "isContinuous", js.undefined)
  }
}
