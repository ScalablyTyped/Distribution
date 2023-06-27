package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.multiply
import typings.arcgisJsApi.arcgisJsApiStrings.replace
import typings.arcgisJsApi.arcgisJsApiStrings.tint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillSymbol3DLayerMaterial
  extends StObject
     with AnonymousAccessor {
  
  /**
  		 * The color of the fill.
  		 *
  		 * @default white
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
  		 */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
  		 * Specifies how the material `color` is applied to the geometry color/texture information.
  		 *
  		 * @default multiply
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
  		 */
  var colorMixMode: js.UndefOr[tint | replace | multiply] = js.undefined
}
object FillSymbol3DLayerMaterial {
  
  inline def apply(): FillSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillSymbol3DLayerMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillSymbol3DLayerMaterial] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorMixMode(value: tint | replace | multiply): Self = StObject.set(x, "colorMixMode", value.asInstanceOf[js.Any])
    
    inline def setColorMixModeUndefined: Self = StObject.set(x, "colorMixMode", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
