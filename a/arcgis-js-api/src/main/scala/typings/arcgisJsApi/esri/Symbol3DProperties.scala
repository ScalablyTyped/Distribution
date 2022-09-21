package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol3DProperties
  extends StObject
     with SymbolProperties {
  
  /**
    * The origin of the style from which the symbol was originally referenced.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleOrigin: js.UndefOr[Symbol3DStyleOrigin] = js.undefined
  
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#symbolLayers)
    */
  var symbolLayers: js.UndefOr[CollectionProperties[Symbol3DLayerProperties]] = js.undefined
}
object Symbol3DProperties {
  
  inline def apply(): Symbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Symbol3DProperties]
  }
  
  extension [Self <: Symbol3DProperties](x: Self) {
    
    inline def setStyleOrigin(value: Symbol3DStyleOrigin): Self = StObject.set(x, "styleOrigin", value.asInstanceOf[js.Any])
    
    inline def setStyleOriginUndefined: Self = StObject.set(x, "styleOrigin", js.undefined)
    
    inline def setSymbolLayers(value: CollectionProperties[Symbol3DLayerProperties]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(value: Symbol3DLayerProperties*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
  }
}
