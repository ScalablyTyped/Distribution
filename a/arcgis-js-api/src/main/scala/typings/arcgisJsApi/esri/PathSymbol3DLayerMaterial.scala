package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
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
  
  inline def apply(
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ Any, PathSymbol3DLayerMaterial]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], PathSymbol3DLayerMaterial]])
  ): PathSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSymbol3DLayerMaterial]
  }
  
  extension [Self <: PathSymbol3DLayerMaterial](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
