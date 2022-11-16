package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSymbol3DLayerMaterialProperties extends StObject {
  
  /**
    * The fill color of the object.
    *
    * @default white
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object ObjectSymbol3DLayerMaterialProperties {
  
  inline def apply(): ObjectSymbol3DLayerMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectSymbol3DLayerMaterialProperties]
  }
  
  extension [Self <: ObjectSymbol3DLayerMaterialProperties](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
  }
}
