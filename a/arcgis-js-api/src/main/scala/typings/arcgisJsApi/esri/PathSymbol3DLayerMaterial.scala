package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSymbol3DLayerMaterial
  extends StObject
     with AnonymousAccessor {
  
  /**
  		 * The color of the path.
  		 *
  		 * @default white
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#material)
  		 */
  var color: js.UndefOr[Color_] = js.undefined
}
object PathSymbol3DLayerMaterial {
  
  inline def apply(): PathSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathSymbol3DLayerMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathSymbol3DLayerMaterial] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
