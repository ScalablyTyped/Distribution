package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`begin-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-marker`
import typings.arcgisJsApi.arcgisJsApiStrings.arrow
import typings.arcgisJsApi.arcgisJsApiStrings.begin
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.diamond
import typings.arcgisJsApi.arcgisJsApiStrings.end
import typings.arcgisJsApi.arcgisJsApiStrings.square_
import typings.arcgisJsApi.arcgisJsApiStrings.x
import typings.arcgisJsApi.esri.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.LineSymbolMarkerProperties & {  type :'line-marker'} */
trait LineSymbolMarkerPropertie extends StObject {
  
  /**
  		 * The color of the marker.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#color)
  		 */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
  		 * The placement of the marker(s) on the line.
  		 *
  		 * @default "begin-end"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#placement)
  		 */
  var placement: js.UndefOr[begin | end | `begin-end`] = js.undefined
  
  /**
  		 * The marker style.
  		 *
  		 * @default "arrow"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#style)
  		 */
  var style: js.UndefOr[arrow | circle | square_ | diamond | cross | x] = js.undefined
  
  var `type`: `line-marker`
}
object LineSymbolMarkerPropertie {
  
  inline def apply(): LineSymbolMarkerPropertie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line-marker")
    __obj.asInstanceOf[LineSymbolMarkerPropertie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineSymbolMarkerPropertie] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setPlacement(value: begin | end | `begin-end`): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setStyle(value: arrow | circle | square_ | diamond | cross | typings.arcgisJsApi.arcgisJsApiStrings.x): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: `line-marker`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
