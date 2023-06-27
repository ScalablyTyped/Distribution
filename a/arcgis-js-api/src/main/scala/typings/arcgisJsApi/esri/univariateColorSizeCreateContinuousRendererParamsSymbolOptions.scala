package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`circle-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`circle-caret`
import typings.arcgisJsApi.arcgisJsApiStrings.`circle-plus-minus`
import typings.arcgisJsApi.arcgisJsApiStrings.`happy-sad`
import typings.arcgisJsApi.arcgisJsApiStrings.`plus-minus`
import typings.arcgisJsApi.arcgisJsApiStrings.arrow
import typings.arcgisJsApi.arcgisJsApiStrings.caret
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.square_
import typings.arcgisJsApi.arcgisJsApiStrings.thumb
import typings.arcgisJsApi.arcgisJsApiStrings.triangle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateContinuousRendererParamsSymbolOptions extends StObject {
  
  /**
  		 * Sets above and below symbols based on pre-defined named symbol pairs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
  		 */
  var symbolStyle: js.UndefOr[
    caret | `circle-caret` | arrow | `circle-arrow` | `plus-minus` | `circle-plus-minus` | square_ | circle | triangle_ | `happy-sad` | thumb
  ] = js.undefined
  
  /**
  		 * Allows you to specify custom symbols in the `above-and-below` theme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
  		 */
  var symbols: js.UndefOr[univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols] = js.undefined
}
object univariateColorSizeCreateContinuousRendererParamsSymbolOptions {
  
  inline def apply(): univariateColorSizeCreateContinuousRendererParamsSymbolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsSymbolOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: univariateColorSizeCreateContinuousRendererParamsSymbolOptions] (val x: Self) extends AnyVal {
    
    inline def setSymbolStyle(
      value: caret | `circle-caret` | arrow | `circle-arrow` | `plus-minus` | `circle-plus-minus` | square_ | circle | triangle_ | `happy-sad` | thumb
    ): Self = StObject.set(x, "symbolStyle", value.asInstanceOf[js.Any])
    
    inline def setSymbolStyleUndefined: Self = StObject.set(x, "symbolStyle", js.undefined)
    
    inline def setSymbols(value: univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
  }
}
