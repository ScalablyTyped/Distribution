package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait univariateColorSizeCreateContinuousRendererParamsSizeOptions extends Object {
  
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var legendOptions: js.UndefOr[univariateColorSizeCreateContinuousRendererParamsSizeOptionsLegendOptions] = js.native
  
  /**
    * In authoring apps, the user may select a pre-defined size scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.native
}
object univariateColorSizeCreateContinuousRendererParamsSizeOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): univariateColorSizeCreateContinuousRendererParamsSizeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsSizeOptions]
  }
  
  @scala.inline
  implicit class univariateColorSizeCreateContinuousRendererParamsSizeOptionsMutableBuilder[Self <: univariateColorSizeCreateContinuousRendererParamsSizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegendOptions(value: univariateColorSizeCreateContinuousRendererParamsSizeOptionsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    @scala.inline
    def setSizeScheme(value: SizeScheme): Self = StObject.set(x, "sizeScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeSchemeUndefined: Self = StObject.set(x, "sizeScheme", js.undefined)
  }
}
