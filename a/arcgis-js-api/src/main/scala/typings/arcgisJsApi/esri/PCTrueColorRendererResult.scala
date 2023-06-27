package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PCTrueColorRendererResult extends StObject {
  
  /**
  		 * The renderer object configured to represent the true color of each point in the point cloud.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#PCTrueColorRendererResult)
  		 */
  var renderer: PointCloudRGBRenderer
}
object PCTrueColorRendererResult {
  
  inline def apply(renderer: PointCloudRGBRenderer): PCTrueColorRendererResult = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PCTrueColorRendererResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PCTrueColorRendererResult] (val x: Self) extends AnyVal {
    
    inline def setRenderer(value: PointCloudRGBRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
