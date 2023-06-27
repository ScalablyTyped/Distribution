package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolUtilsRenderPreviewHTMLOptionsSymbolConfig extends StObject {
  
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
  
  inline def apply(): symbolUtilsRenderPreviewHTMLOptionsSymbolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[symbolUtilsRenderPreviewHTMLOptionsSymbolConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: symbolUtilsRenderPreviewHTMLOptionsSymbolConfig] (val x: Self) extends AnyVal {
    
    inline def setIsSquareFill(value: Boolean): Self = StObject.set(x, "isSquareFill", value.asInstanceOf[js.Any])
    
    inline def setIsSquareFillUndefined: Self = StObject.set(x, "isSquareFill", js.undefined)
    
    inline def setIsTall(value: Boolean): Self = StObject.set(x, "isTall", value.asInstanceOf[js.Any])
    
    inline def setIsTallUndefined: Self = StObject.set(x, "isTall", js.undefined)
  }
}
