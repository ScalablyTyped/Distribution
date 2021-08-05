package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.clamp
import typings.arcgisJsApi.arcgisJsApiStrings.mirror
import typings.arcgisJsApi.arcgisJsApiStrings.repeat
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeparableWrapModes
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    horizontal: clamp | repeat | mirror,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertical: clamp | repeat | mirror
  ): SeparableWrapModes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), horizontal = horizontal.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparableWrapModes]
  }
  
  extension [Self <: SeparableWrapModes](x: Self) {
    
    inline def setHorizontal(value: clamp | repeat | mirror): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: clamp | repeat | mirror): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
