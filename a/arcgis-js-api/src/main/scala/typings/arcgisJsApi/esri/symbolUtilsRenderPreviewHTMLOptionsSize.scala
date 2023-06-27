package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolUtilsRenderPreviewHTMLOptionsSize extends StObject {
  
  /**
  		 * The height of the symbol preview in points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The width of the symbol preview in points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
  		 */
  var width: js.UndefOr[Double] = js.undefined
}
object symbolUtilsRenderPreviewHTMLOptionsSize {
  
  inline def apply(): symbolUtilsRenderPreviewHTMLOptionsSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[symbolUtilsRenderPreviewHTMLOptionsSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: symbolUtilsRenderPreviewHTMLOptionsSize] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
