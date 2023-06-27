package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolUtilsRenderRelationshipRampPreviewHTMLOptions extends StObject {
  
  /**
  		 * The container node in which to place the generated relationship element.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderRelationshipRampPreviewHTML)
  		 */
  var node: js.UndefOr[HTMLElement] = js.undefined
  
  /**
  		 * The opacity of the legend element.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderRelationshipRampPreviewHTML)
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
}
object symbolUtilsRenderRelationshipRampPreviewHTMLOptions {
  
  inline def apply(): symbolUtilsRenderRelationshipRampPreviewHTMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[symbolUtilsRenderRelationshipRampPreviewHTMLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: symbolUtilsRenderRelationshipRampPreviewHTMLOptions] (val x: Self) extends AnyVal {
    
    inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
