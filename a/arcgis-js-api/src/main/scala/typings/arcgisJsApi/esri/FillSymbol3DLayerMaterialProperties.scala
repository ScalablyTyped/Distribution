package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.multiply
import typings.arcgisJsApi.arcgisJsApiStrings.replace
import typings.arcgisJsApi.arcgisJsApiStrings.tint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillSymbol3DLayerMaterialProperties extends StObject {
  
  /**
  		 * The color of the fill.
  		 *
  		 * @default white
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
  		 */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
  		 * Specifies how the material `color` is applied to the geometry color/texture information.
  		 *
  		 * @default multiply
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
  		 */
  var colorMixMode: js.UndefOr[tint | replace | multiply] = js.undefined
}
object FillSymbol3DLayerMaterialProperties {
  
  inline def apply(): FillSymbol3DLayerMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillSymbol3DLayerMaterialProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillSymbol3DLayerMaterialProperties] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorMixMode(value: tint | replace | multiply): Self = StObject.set(x, "colorMixMode", value.asInstanceOf[js.Any])
    
    inline def setColorMixModeUndefined: Self = StObject.set(x, "colorMixMode", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
  }
}
