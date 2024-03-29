package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSymbol3DLayerOutline
  extends StObject
     with AnonymousAccessor {
  
  /**
  		 * The color of the outline.
  		 *
  		 * @default black
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
  		 */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
  		 * The width of the outline in points.
  		 *
  		 * @default 1.125
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
  		 */
  var size: js.UndefOr[Double] = js.undefined
}
object IconSymbol3DLayerOutline {
  
  inline def apply(): IconSymbol3DLayerOutline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSymbol3DLayerOutline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconSymbol3DLayerOutline] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
