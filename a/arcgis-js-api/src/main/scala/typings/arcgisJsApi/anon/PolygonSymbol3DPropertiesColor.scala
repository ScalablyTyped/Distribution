package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import typings.arcgisJsApi.esri.CollectionProperties
import typings.arcgisJsApi.esri.Color_
import typings.arcgisJsApi.esri.ExtrudeSymbol3DLayerProperties
import typings.arcgisJsApi.esri.FillSymbol3DLayerProperties
import typings.arcgisJsApi.esri.IconSymbol3DLayerProperties
import typings.arcgisJsApi.esri.LineSymbol3DLayerProperties
import typings.arcgisJsApi.esri.ObjectSymbol3DLayerProperties
import typings.arcgisJsApi.esri.Symbol3DStyleOrigin
import typings.arcgisJsApi.esri.TextSymbol3DLayerProperties
import typings.arcgisJsApi.esri.WaterSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PolygonSymbol3DProperties & {  type :'polygon-3d'} */
trait PolygonSymbol3DPropertiesColor extends StObject {
  
  /**
    * The color of the symbol.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The origin of the style from which the symbol was originally referenced.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleOrigin: js.UndefOr[Symbol3DStyleOrigin] = js.undefined
  
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html#symbolLayers)
    */
  var symbolLayers: js.UndefOr[
    CollectionProperties[
      (ExtrudeSymbol3DLayerProperties & Type) | (FillSymbol3DLayerProperties & `0`) | (IconSymbol3DLayerProperties & `1`) | (LineSymbol3DLayerProperties & `2`) | (ObjectSymbol3DLayerProperties & `3`) | (TextSymbol3DLayerProperties & `4`) | (WaterSymbol3DLayerProperties & `5`)
    ]
  ] = js.undefined
  
  var `type`: `polygon-3d`
}
object PolygonSymbol3DPropertiesColor {
  
  inline def apply(): PolygonSymbol3DPropertiesColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("polygon-3d")
    __obj.asInstanceOf[PolygonSymbol3DPropertiesColor]
  }
  
  extension [Self <: PolygonSymbol3DPropertiesColor](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setStyleOrigin(value: Symbol3DStyleOrigin): Self = StObject.set(x, "styleOrigin", value.asInstanceOf[js.Any])
    
    inline def setStyleOriginUndefined: Self = StObject.set(x, "styleOrigin", js.undefined)
    
    inline def setSymbolLayers(
      value: CollectionProperties[
          (ExtrudeSymbol3DLayerProperties & Type) | (FillSymbol3DLayerProperties & `0`) | (IconSymbol3DLayerProperties & `1`) | (LineSymbol3DLayerProperties & `2`) | (ObjectSymbol3DLayerProperties & `3`) | (TextSymbol3DLayerProperties & `4`) | (WaterSymbol3DLayerProperties & `5`)
        ]
    ): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(
      value: ((ExtrudeSymbol3DLayerProperties & Type) | (FillSymbol3DLayerProperties & `0`) | (IconSymbol3DLayerProperties & `1`) | (LineSymbol3DLayerProperties & `2`) | (ObjectSymbol3DLayerProperties & `3`) | (TextSymbol3DLayerProperties & `4`) | (WaterSymbol3DLayerProperties & `5`))*
    ): Self = StObject.set(x, "symbolLayers", js.Array(value*))
    
    inline def setType(value: `polygon-3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
