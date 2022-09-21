package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`point-3d`
import typings.arcgisJsApi.esri.CollectionProperties
import typings.arcgisJsApi.esri.Color_
import typings.arcgisJsApi.esri.LineCallout3DProperties
import typings.arcgisJsApi.esri.PointSymbol3DVerticalOffsetProperties
import typings.arcgisJsApi.esri.Symbol3DStyleOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PointSymbol3DProperties & {  type :'point-3d'} */
trait PointSymbol3DPropertiesty extends StObject {
  
  /**
    * Settings for adding a callout visualization to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#callout)
    */
  var callout: js.UndefOr[LineCallout3DProperties] = js.undefined
  
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#symbolLayers)
    */
  var symbolLayers: js.UndefOr[
    CollectionProperties[
      IconSymbol3DLayerProperti | ObjectSymbol3DLayerProper | TextSymbol3DLayerProperti
    ]
  ] = js.undefined
  
  var `type`: `point-3d`
  
  /**
    * Shifts the symbol along the vertical world axis by a given height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var verticalOffset: js.UndefOr[PointSymbol3DVerticalOffsetProperties] = js.undefined
}
object PointSymbol3DPropertiesty {
  
  inline def apply(): PointSymbol3DPropertiesty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("point-3d")
    __obj.asInstanceOf[PointSymbol3DPropertiesty]
  }
  
  extension [Self <: PointSymbol3DPropertiesty](x: Self) {
    
    inline def setCallout(value: LineCallout3DProperties): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setStyleOrigin(value: Symbol3DStyleOrigin): Self = StObject.set(x, "styleOrigin", value.asInstanceOf[js.Any])
    
    inline def setStyleOriginUndefined: Self = StObject.set(x, "styleOrigin", js.undefined)
    
    inline def setSymbolLayers(
      value: CollectionProperties[
          IconSymbol3DLayerProperti | ObjectSymbol3DLayerProper | TextSymbol3DLayerProperti
        ]
    ): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(value: (IconSymbol3DLayerProperti | ObjectSymbol3DLayerProper | TextSymbol3DLayerProperti)*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
    
    inline def setType(value: `point-3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffset(value: PointSymbol3DVerticalOffsetProperties): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
  }
}
