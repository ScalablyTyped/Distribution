package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`line-3d`
import typings.arcgisJsApi.esri.CollectionProperties
import typings.arcgisJsApi.esri.Color_
import typings.arcgisJsApi.esri.StyleOriginProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.LineSymbol3DProperties & {  type :'line-3d'} */
trait LineSymbol3DPropertiestyp extends StObject {
  
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html#symbolLayers)
    */
  var symbolLayers: js.UndefOr[CollectionProperties[LineSymbol3DLayerProperti | PathSymbol3DLayerProperti]] = js.undefined
  
  var `type`: `line-3d`
}
object LineSymbol3DPropertiestyp {
  
  inline def apply(): LineSymbol3DPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line-3d")
    __obj.asInstanceOf[LineSymbol3DPropertiestyp]
  }
  
  extension [Self <: LineSymbol3DPropertiestyp](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setStyleOrigin(value: StyleOriginProperties): Self = StObject.set(x, "styleOrigin", value.asInstanceOf[js.Any])
    
    inline def setStyleOriginUndefined: Self = StObject.set(x, "styleOrigin", js.undefined)
    
    inline def setSymbolLayers(value: CollectionProperties[LineSymbol3DLayerProperti | PathSymbol3DLayerProperti]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(value: (LineSymbol3DLayerProperti | PathSymbol3DLayerProperti)*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
    
    inline def setType(value: `line-3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
