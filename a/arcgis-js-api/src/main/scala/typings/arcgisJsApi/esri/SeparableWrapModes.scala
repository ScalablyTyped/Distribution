package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.clamp
import typings.arcgisJsApi.arcgisJsApiStrings.mirror
import typings.arcgisJsApi.arcgisJsApiStrings.repeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeparableWrapModes extends StObject {
  
  /**
    * Horizontal wrapping mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#SeparableWrapModes)
    */
  var horizontal: clamp | repeat | mirror
  
  /**
    * Vertical wrapping mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#SeparableWrapModes)
    */
  var vertical: clamp | repeat | mirror
}
object SeparableWrapModes {
  
  inline def apply(horizontal: clamp | repeat | mirror, vertical: clamp | repeat | mirror): SeparableWrapModes = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparableWrapModes]
  }
  
  extension [Self <: SeparableWrapModes](x: Self) {
    
    inline def setHorizontal(value: clamp | repeat | mirror): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: clamp | repeat | mirror): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
