package typings.arcgisJsApi.esri

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSymbolMarker
  extends StObject
     with Accessor {
  
  /**
  		 * The color of the marker.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * The placement of the marker(s) on the line.
  		 *
  		 * @default "begin-end"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#placement)
  		 */
  var placement: begin | end | `begin-end` = js.native
  
  /**
  		 * The marker style.
  		 *
  		 * @default "arrow"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#style)
  		 */
  var style: arrow | circle | square_ | diamond | cross | x = js.native
  
  /**
  		 * The symbol type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#type)
  		 */
  val `type`: `line-marker` = js.native
}
