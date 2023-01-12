package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.bevel_
import typings.arcgisJsApi.arcgisJsApiStrings.butt_
import typings.arcgisJsApi.arcgisJsApiStrings.line
import typings.arcgisJsApi.arcgisJsApiStrings.miter_
import typings.arcgisJsApi.arcgisJsApiStrings.round_
import typings.arcgisJsApi.arcgisJsApiStrings.square_
import typings.arcgisJsApi.esri.LineStyleMarker3DProperties
import typings.arcgisJsApi.esri.LineStylePattern3DProperties
import typings.arcgisJsApi.esri.LineSymbol3DLayerMaterialProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.LineSymbol3DLayerProperties & {  type :'line'} */
trait LineSymbol3DLayerProperti extends StObject {
  
  /**
    * The style used to draw the endpoint of a line.
    *
    * @default butt
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#cap)
    */
  var cap: js.UndefOr[butt_ | round_ | square_] = js.undefined
  
  /**
    * The style used to draw the intersection of two line segments within a line geometry.
    *
    * @default miter
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#join)
    */
  var join: js.UndefOr[miter_ | round_ | bevel_] = js.undefined
  
  /**
    * Optional markers to be placed at the start and/or end of each line geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#marker)
    */
  var marker: js.UndefOr[LineStyleMarker3DProperties] = js.undefined
  
  /**
    * The material used to shade the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[LineSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
    * The pattern used to render the line stroke.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#pattern)
    */
  var pattern: js.UndefOr[LineStylePattern3DProperties] = js.undefined
  
  /**
    * The width of the line in points.
    *
    * @default "1px"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double | String] = js.undefined
  
  var `type`: line
}
object LineSymbol3DLayerProperti {
  
  inline def apply(): LineSymbol3DLayerProperti = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[LineSymbol3DLayerProperti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineSymbol3DLayerProperti] (val x: Self) extends AnyVal {
    
    inline def setCap(value: butt_ | round_ | square_): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setJoin(value: miter_ | round_ | bevel_): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setMarker(value: LineStyleMarker3DProperties): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMaterial(value: LineSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setPattern(value: LineStylePattern3DProperties): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
