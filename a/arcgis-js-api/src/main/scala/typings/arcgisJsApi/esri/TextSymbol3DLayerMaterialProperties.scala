package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSymbol3DLayerMaterialProperties extends StObject {
  
  /**
    * The color of the text.
    *
    * @default white
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object TextSymbol3DLayerMaterialProperties {
  
  inline def apply(): TextSymbol3DLayerMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSymbol3DLayerMaterialProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextSymbol3DLayerMaterialProperties] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
  }
}
