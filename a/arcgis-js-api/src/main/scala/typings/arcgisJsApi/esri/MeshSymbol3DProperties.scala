package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshSymbol3DProperties
  extends StObject
     with Symbol3DProperties {
  
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html#symbolLayers)
    */
  @JSName("symbolLayers")
  var symbolLayers_MeshSymbol3DProperties: js.UndefOr[CollectionProperties[FillSymbol3DLayerProperties]] = js.undefined
}
object MeshSymbol3DProperties {
  
  inline def apply(): MeshSymbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSymbol3DProperties]
  }
  
  extension [Self <: MeshSymbol3DProperties](x: Self) {
    
    inline def setSymbolLayers(value: CollectionProperties[FillSymbol3DLayerProperties]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(value: FillSymbol3DLayerProperties*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
  }
}
