package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`object`
import typings.arcgisJsApi.arcgisJsApiStrings.bottom_
import typings.arcgisJsApi.arcgisJsApiStrings.center_
import typings.arcgisJsApi.arcgisJsApiStrings.origin
import typings.arcgisJsApi.arcgisJsApiStrings.relative_
import typings.arcgisJsApi.arcgisJsApiStrings.top_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSymbol3DLayer
  extends StObject
     with Symbol3DLayer
     with typings.arcgisJsApi.esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  
  /**
  		 * The positioning of the symbol relative to the geometry.
  		 *
  		 * @default origin
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor)
  		 */
  var anchor: center_ | top_ | bottom_ | origin | relative_ = js.native
  
  /**
  		 * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) relative to the center of the [symbol layer resource](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
  		 */
  var anchorPosition: ObjectSymbol3DLayerAnchorPosition = js.native
  
  /**
  		 * Indicates whether the symbol layer geometry casts shadows in the scene.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows)
  		 */
  var castShadows: Boolean = js.native
  
  /**
  		 * The depth, or diameter from north to south, of the object in meters.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth)
  		 */
  var depth: Double = js.native
  
  /**
  		 * The clockwise rotation of the symbol in the horizontal plane (i.e., around the z axis).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#heading)
  		 */
  var heading: Double = js.native
  
  /**
  		 * The height of the object in meters.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height)
  		 */
  var height: Double = js.native
  
  /**
  		 * The material used to shade the object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
  		 */
  var material: ObjectSymbol3DLayerMaterial = js.native
  
  /**
  		 * The primitive shape (`primitive`) or external 3D model (`href`) used to visualize the points.
  		 *
  		 * @default { primitive: "sphere" }
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
  		 */
  var resource: ObjectSymbol3DLayerResource = js.native
  
  /**
  		 * The rotation of the symbol in the lateral vertical plane (i.e., around the y axis).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#roll)
  		 */
  var roll: Double = js.native
  
  /**
  		 * The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#tilt)
  		 */
  var tilt: Double = js.native
  
  /**
  		 * The object type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#type)
  		 */
  @JSName("type")
  val type_ObjectSymbol3DLayer: `object` = js.native
  
  /**
  		 * The width, or diameter from east to west, of the object in meters.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width)
  		 */
  var width: Double = js.native
}
