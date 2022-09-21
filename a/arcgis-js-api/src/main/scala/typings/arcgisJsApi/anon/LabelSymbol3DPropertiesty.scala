package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`label-3d`
import typings.arcgisJsApi.esri.Callout3DProperties
import typings.arcgisJsApi.esri.CollectionProperties
import typings.arcgisJsApi.esri.Color_
import typings.arcgisJsApi.esri.LabelSymbol3DVerticalOffsetProperties
import typings.arcgisJsApi.esri.Symbol3DStyleOrigin
import typings.arcgisJsApi.esri.TextSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.LabelSymbol3DProperties & {  type :'label-3d'} */
trait LabelSymbol3DPropertiesty extends StObject {
  
  /**
    * Settings for adding a callout visualization to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#callout)
    */
  var callout: js.UndefOr[Callout3DProperties] = js.undefined
  
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#symbolLayers)
    */
  var symbolLayers: js.UndefOr[CollectionProperties[TextSymbol3DLayerProperties]] = js.undefined
  
  var `type`: `label-3d`
  
  /**
    * Shifts the symbol along the vertical world axis by a given height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var verticalOffset: js.UndefOr[LabelSymbol3DVerticalOffsetProperties] = js.undefined
}
object LabelSymbol3DPropertiesty {
  
  inline def apply(): LabelSymbol3DPropertiesty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("label-3d")
    __obj.asInstanceOf[LabelSymbol3DPropertiesty]
  }
  
  extension [Self <: LabelSymbol3DPropertiesty](x: Self) {
    
    inline def setCallout(value: Callout3DProperties): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setStyleOrigin(value: Symbol3DStyleOrigin): Self = StObject.set(x, "styleOrigin", value.asInstanceOf[js.Any])
    
    inline def setStyleOriginUndefined: Self = StObject.set(x, "styleOrigin", js.undefined)
    
    inline def setSymbolLayers(value: CollectionProperties[TextSymbol3DLayerProperties]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(value: TextSymbol3DLayerProperties*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
    
    inline def setType(value: `label-3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffset(value: LabelSymbol3DVerticalOffsetProperties): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
  }
}
