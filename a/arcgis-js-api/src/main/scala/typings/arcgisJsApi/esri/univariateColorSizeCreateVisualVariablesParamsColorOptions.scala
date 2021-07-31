package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateVisualVariablesParamsColorOptions
  extends StObject
     with Object {
  
  /**
    * In authoring apps, the user may select a pre-defined color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var legendOptions: js.UndefOr[univariateColorSizeCreateVisualVariablesParamsColorOptionsLegendOptions] = js.undefined
  
  /**
    * Determines which values will be emphasized in the continuous ramp and the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var theme: js.UndefOr[String] = js.undefined
}
object univariateColorSizeCreateVisualVariablesParamsColorOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): univariateColorSizeCreateVisualVariablesParamsColorOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[univariateColorSizeCreateVisualVariablesParamsColorOptions]
  }
  
  @scala.inline
  implicit class univariateColorSizeCreateVisualVariablesParamsColorOptionsMutableBuilder[Self <: univariateColorSizeCreateVisualVariablesParamsColorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    @scala.inline
    def setLegendOptions(value: univariateColorSizeCreateVisualVariablesParamsColorOptionsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
