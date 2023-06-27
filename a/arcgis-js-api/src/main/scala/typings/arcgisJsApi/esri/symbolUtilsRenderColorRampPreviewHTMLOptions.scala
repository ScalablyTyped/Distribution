package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolUtilsRenderColorRampPreviewHTMLOptions extends StObject {
  
  /**
  		 * Specifies the alignment of the color ramp.
  		 *
  		 * @default vertical
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderColorRampPreviewHTML)
  		 */
  var align: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
  		 * Indicates whether to render the color ramp with a continuous gradient.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderColorRampPreviewHTML)
  		 */
  var gradient: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The height of the ramp in pixels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderColorRampPreviewHTML)
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The width of the ramp in pixels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderColorRampPreviewHTML)
  		 */
  var width: js.UndefOr[Double] = js.undefined
}
object symbolUtilsRenderColorRampPreviewHTMLOptions {
  
  inline def apply(): symbolUtilsRenderColorRampPreviewHTMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[symbolUtilsRenderColorRampPreviewHTMLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: symbolUtilsRenderColorRampPreviewHTMLOptions] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: horizontal | vertical): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setGradient(value: Boolean): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
