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

@js.native
trait LineStyleMarker3D
  extends StObject
     with Accessor {
  
  /**
  		 * The color of the marker.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * Indicates where the marker is placed.
  		 *
  		 * @default "begin-end"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html#placement)
  		 */
  var placement: begin | end | `begin-end` = js.native
  
  /**
  		 * Style of the marker.
  		 *
  		 * @default "arrow"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html#style)
  		 */
  var style: arrow | circle | square_ | diamond | cross | x = js.native
  
  /**
  		 * The type of marker applied to a line.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html#type)
  		 */
  val `type`: style = js.native
}
