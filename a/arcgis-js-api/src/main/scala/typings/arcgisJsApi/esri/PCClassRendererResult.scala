package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PCClassRendererResult extends StObject {
  
  /**
    * The renderer object configured to represent the class codes in the point cloud.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#PCClassRendererResult)
    */
  var renderer: PointCloudUniqueValueRenderer
}
object PCClassRendererResult {
  
  inline def apply(renderer: PointCloudUniqueValueRenderer): PCClassRendererResult = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PCClassRendererResult]
  }
  
  extension [Self <: PCClassRendererResult](x: Self) {
    
    inline def setRenderer(value: PointCloudUniqueValueRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
