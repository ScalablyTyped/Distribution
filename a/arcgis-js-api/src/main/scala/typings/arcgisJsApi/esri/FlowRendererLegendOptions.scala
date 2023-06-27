package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowRendererLegendOptions extends StObject {
  
  /**
  		 * Describes the variable driving the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#legendOptions)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object FlowRendererLegendOptions {
  
  inline def apply(): FlowRendererLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowRendererLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowRendererLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
