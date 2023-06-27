package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bevel_
import typings.arcgisJsApi.arcgisJsApiStrings.butt_
import typings.arcgisJsApi.arcgisJsApiStrings.line
import typings.arcgisJsApi.arcgisJsApiStrings.miter_
import typings.arcgisJsApi.arcgisJsApiStrings.round_
import typings.arcgisJsApi.arcgisJsApiStrings.square_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSymbol3DLayer
  extends StObject
     with Symbol3DLayer
     with typings.arcgisJsApi.esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  
  /**
  		 * The style used to draw the endpoint of a line.
  		 *
  		 * @default butt
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#cap)
  		 */
  var cap: butt_ | round_ | square_ = js.native
  
  /**
  		 * The style used to draw the intersection of two line segments within a line geometry.
  		 *
  		 * @default miter
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#join)
  		 */
  var join: miter_ | round_ | bevel_ = js.native
  
  /**
  		 * Optional markers to be placed at the start and/or end of each line geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#marker)
  		 */
  var marker: LineStyleMarker3D = js.native
  
  /**
  		 * The material used to shade the line.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#material)
  		 */
  var material: LineSymbol3DLayerMaterial = js.native
  
  /**
  		 * The pattern used to render the line stroke.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#pattern)
  		 */
  var pattern: LineStylePattern3D = js.native
  
  /**
  		 * The width of the line in points.
  		 *
  		 * @default "1px"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#size)
  		 */
  var size: Double = js.native
  
  /**
  		 * The symbol type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#type)
  		 */
  @JSName("type")
  val type_LineSymbol3DLayer: line = js.native
}
