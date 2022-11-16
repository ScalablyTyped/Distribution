package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`dash-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-dash`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dash`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import typings.arcgisJsApi.arcgisJsApiStrings.bevel_
import typings.arcgisJsApi.arcgisJsApiStrings.butt_
import typings.arcgisJsApi.arcgisJsApiStrings.dash
import typings.arcgisJsApi.arcgisJsApiStrings.dot
import typings.arcgisJsApi.arcgisJsApiStrings.miter_
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.round_
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.square_
import typings.arcgisJsApi.esri.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.SimpleLineSymbolProperties & {  type :'simple-line'} */
trait SimpleLineSymbolPropertie extends StObject {
  
  /**
    * Specifies the cap style.
    *
    * @default round
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#cap)
    */
  var cap: js.UndefOr[butt_ | round_ | square_] = js.undefined
  
  /**
    * The color of the symbol.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * Specifies the join style.
    *
    * @default round
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#join)
    */
  var join: js.UndefOr[miter_ | round_ | bevel_] = js.undefined
  
  /**
    * Specifies the color, style, and placement of a symbol marker on the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#marker)
    */
  var marker: js.UndefOr[LineSymbolMarkerPropertie | Null] = js.undefined
  
  /**
    * Maximum allowed ratio of the width of a miter join to the line width.
    *
    * @default 2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#miterLimit)
    */
  var miterLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the line style.
    *
    * @default solid
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#style)
    */
  var style: js.UndefOr[
    dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none_ | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid
  ] = js.undefined
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-line`] & `simple-line`
  
  /**
    * The width of the symbol in points.
    *
    * @default 0.75
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#width)
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object SimpleLineSymbolPropertie {
  
  inline def apply(`type`: js.UndefOr[`simple-line`] & `simple-line`): SimpleLineSymbolPropertie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleLineSymbolPropertie]
  }
  
  extension [Self <: SimpleLineSymbolPropertie](x: Self) {
    
    inline def setCap(value: butt_ | round_ | square_): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setJoin(value: miter_ | round_ | bevel_): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setMarker(value: LineSymbolMarkerPropertie): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerNull: Self = StObject.set(x, "marker", null)
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    inline def setStyle(
      value: dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none_ | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: js.UndefOr[`simple-line`] & `simple-line`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
