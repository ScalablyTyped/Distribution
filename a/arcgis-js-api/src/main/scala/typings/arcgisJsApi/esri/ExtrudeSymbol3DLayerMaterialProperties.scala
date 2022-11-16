package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtrudeSymbol3DLayerMaterialProperties extends StObject {
  
  /**
    * The fill color of the extrusion.
    *
    * @default white
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object ExtrudeSymbol3DLayerMaterialProperties {
  
  inline def apply(): ExtrudeSymbol3DLayerMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtrudeSymbol3DLayerMaterialProperties]
  }
  
  extension [Self <: ExtrudeSymbol3DLayerMaterialProperties](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
  }
}
