package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
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
  
  inline def apply(
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ Any, IconSymbol3DLayerOutline]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], IconSymbol3DLayerOutline]])
  ): IconSymbol3DLayerOutline = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSymbol3DLayerOutline]
  }
  
  extension [Self <: IconSymbol3DLayerOutline](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
