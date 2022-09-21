package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolUtilsRenderPreviewHTMLOptionsSymbolConfig
  extends StObject
     with Object {
  
  /**
    * Set to `true` to render the preview as a square instead of a generic polygon shape.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var isSquareFill: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to `true` for "tall" symbols in portrait view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var isTall: js.UndefOr[Boolean] = js.undefined
}
object symbolUtilsRenderPreviewHTMLOptionsSymbolConfig {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): symbolUtilsRenderPreviewHTMLOptionsSymbolConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[symbolUtilsRenderPreviewHTMLOptionsSymbolConfig]
  }
  
  extension [Self <: symbolUtilsRenderPreviewHTMLOptionsSymbolConfig](x: Self) {
    
    inline def setIsSquareFill(value: Boolean): Self = StObject.set(x, "isSquareFill", value.asInstanceOf[js.Any])
    
    inline def setIsSquareFillUndefined: Self = StObject.set(x, "isSquareFill", js.undefined)
    
    inline def setIsTall(value: Boolean): Self = StObject.set(x, "isTall", value.asInstanceOf[js.Any])
    
    inline def setIsTallUndefined: Self = StObject.set(x, "isTall", js.undefined)
  }
}
