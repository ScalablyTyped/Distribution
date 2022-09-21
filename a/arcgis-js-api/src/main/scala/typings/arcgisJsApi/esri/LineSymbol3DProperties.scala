package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.LineSymbol3DLayerProperti
import typings.arcgisJsApi.anon.PathSymbol3DLayerProperti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineSymbol3DProperties
  extends StObject
     with Symbol3DProperties {
  
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html#symbolLayers)
    */
  @JSName("symbolLayers")
  var symbolLayers_LineSymbol3DProperties: js.UndefOr[CollectionProperties[LineSymbol3DLayerProperti | PathSymbol3DLayerProperti]] = js.undefined
}
object LineSymbol3DProperties {
  
  inline def apply(): LineSymbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSymbol3DProperties]
  }
  
  extension [Self <: LineSymbol3DProperties](x: Self) {
    
    inline def setSymbolLayers(value: CollectionProperties[LineSymbol3DLayerProperti | PathSymbol3DLayerProperti]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(value: (LineSymbol3DLayerProperti | PathSymbol3DLayerProperti)*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
  }
}
