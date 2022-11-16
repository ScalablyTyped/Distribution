package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import typings.arcgisJsApi.esri.CollectionProperties
import typings.arcgisJsApi.esri.Color_
import typings.arcgisJsApi.esri.StyleOriginProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PolygonSymbol3DProperties & {  type :'polygon-3d'} */
trait PolygonSymbol3DProperties extends StObject {
  
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
  var styleOrigin: js.UndefOr[StyleOriginProperties] = js.undefined
  
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html#symbolLayers)
    */
  var symbolLayers: js.UndefOr[
    CollectionProperties[
      ExtrudeSymbol3DLayerPrope | FillSymbol3DLayerProperti | IconSymbol3DLayerProperti | LineSymbol3DLayerProperti | ObjectSymbol3DLayerProper | TextSymbol3DLayerProperti | WaterSymbol3DLayerPropert
    ]
  ] = js.undefined
  
  var `type`: `polygon-3d`
}
object PolygonSymbol3DProperties {
  
  inline def apply(): PolygonSymbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("polygon-3d")
    __obj.asInstanceOf[PolygonSymbol3DProperties]
  }
  
  extension [Self <: PolygonSymbol3DProperties](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setStyleOrigin(value: StyleOriginProperties): Self = StObject.set(x, "styleOrigin", value.asInstanceOf[js.Any])
    
    inline def setStyleOriginUndefined: Self = StObject.set(x, "styleOrigin", js.undefined)
    
    inline def setSymbolLayers(
      value: CollectionProperties[
          ExtrudeSymbol3DLayerPrope | FillSymbol3DLayerProperti | IconSymbol3DLayerProperti | LineSymbol3DLayerProperti | ObjectSymbol3DLayerProper | TextSymbol3DLayerProperti | WaterSymbol3DLayerPropert
        ]
    ): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(
      value: (ExtrudeSymbol3DLayerPrope | FillSymbol3DLayerProperti | IconSymbol3DLayerProperti | LineSymbol3DLayerProperti | ObjectSymbol3DLayerProper | TextSymbol3DLayerProperti | WaterSymbol3DLayerPropert)*
    ): Self = StObject.set(x, "symbolLayers", js.Array(value*))
    
    inline def setType(value: `polygon-3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
