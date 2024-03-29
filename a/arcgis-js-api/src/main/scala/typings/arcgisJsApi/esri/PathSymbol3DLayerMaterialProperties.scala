package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSymbol3DLayerMaterialProperties extends StObject {
  
  /**
  		 * The color of the path.
  		 *
  		 * @default white
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#material)
  		 */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object PathSymbol3DLayerMaterialProperties {
  
  inline def apply(): PathSymbol3DLayerMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathSymbol3DLayerMaterialProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathSymbol3DLayerMaterialProperties] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
  }
}
