package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typings.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typings.arcgisJsApi.arcgisJsApiStrings.extremes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateVisualVariablesParamsColorOptions extends StObject {
  
  /**
    * In authoring apps, the user may select a pre-defined color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  
  /**
    * Only applies to the `above-and-below` theme.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var isContinuous: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var legendOptions: js.UndefOr[univariateColorSizeCreateVisualVariablesParamsColorOptionsLegendOptions] = js.undefined
  
  /**
    * Determines which values will be emphasized in the continuous ramp and the map.
    *
    * @default high-to-low
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var theme: js.UndefOr[`high-to-low` | `above-and-below` | `centered-on` | extremes] = js.undefined
}
object univariateColorSizeCreateVisualVariablesParamsColorOptions {
  
  inline def apply(): univariateColorSizeCreateVisualVariablesParamsColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[univariateColorSizeCreateVisualVariablesParamsColorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: univariateColorSizeCreateVisualVariablesParamsColorOptions] (val x: Self) extends AnyVal {
    
    inline def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    inline def setIsContinuous(value: Boolean): Self = StObject.set(x, "isContinuous", value.asInstanceOf[js.Any])
    
    inline def setIsContinuousUndefined: Self = StObject.set(x, "isContinuous", js.undefined)
    
    inline def setLegendOptions(value: univariateColorSizeCreateVisualVariablesParamsColorOptionsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setTheme(value: `high-to-low` | `above-and-below` | `centered-on` | extremes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
