package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`begin-end`
import typings.arcgisJsApi.arcgisJsApiStrings.arrow
import typings.arcgisJsApi.arcgisJsApiStrings.begin
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.diamond
import typings.arcgisJsApi.arcgisJsApiStrings.end
import typings.arcgisJsApi.arcgisJsApiStrings.square_
import typings.arcgisJsApi.arcgisJsApiStrings.style
import typings.arcgisJsApi.arcgisJsApiStrings.x
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineStyleMarker3DProperties extends StObject {
  
  /**
    * The color of the marker.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * Indicates where the marker is placed.
    *
    * @default "begin-end"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html#placement)
    */
  var placement: js.UndefOr[begin | end | `begin-end`] = js.undefined
  
  /**
    * Style of the marker.
    *
    * @default "arrow"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html#style)
    */
  var style: js.UndefOr[arrow | circle | square_ | diamond | cross | x] = js.undefined
  
  /**
    * The type of marker applied to a line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html#type)
    */
  var `type`: js.UndefOr[style] = js.undefined
}
object LineStyleMarker3DProperties {
  
  inline def apply(): LineStyleMarker3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyleMarker3DProperties]
  }
  
  extension [Self <: LineStyleMarker3DProperties](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setPlacement(value: begin | end | `begin-end`): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setStyle(value: arrow | circle | square_ | diamond | cross | typings.arcgisJsApi.arcgisJsApiStrings.x): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: style): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
