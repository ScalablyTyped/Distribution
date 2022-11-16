package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassBreaksRendererLegendOptions extends StObject {
  
  /**
    * Describes the variable driving the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#legendOptions)
    */
  var title: String
}
object ClassBreaksRendererLegendOptions {
  
  inline def apply(title: String): ClassBreaksRendererLegendOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBreaksRendererLegendOptions]
  }
  
  extension [Self <: ClassBreaksRendererLegendOptions](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
