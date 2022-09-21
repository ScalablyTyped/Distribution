package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.bevel_
import typings.arcgisJsApi.arcgisJsApiStrings.bottom_
import typings.arcgisJsApi.arcgisJsApiStrings.butt_
import typings.arcgisJsApi.arcgisJsApiStrings.center_
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.heading
import typings.arcgisJsApi.arcgisJsApiStrings.miter_
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.path
import typings.arcgisJsApi.arcgisJsApiStrings.quad
import typings.arcgisJsApi.arcgisJsApiStrings.round_
import typings.arcgisJsApi.arcgisJsApiStrings.square_
import typings.arcgisJsApi.arcgisJsApiStrings.top_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathSymbol3DLayer
  extends StObject
     with Symbol3DLayer
     with typings.arcgisJsApi.esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  
  /**
    * Defines offset of the path cross section relative to the [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry.
    *
    * @default "center"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#anchor)
    */
  var anchor: center_ | bottom_ | top_ = js.native
  
  /**
    * Controls the shape at the start and end point of the path.
    *
    * @default "butt"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#cap)
    */
  var cap: none_ | butt_ | square_ | round_ = js.native
  
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#castShadows)
    */
  var castShadows: Boolean = js.native
  
  /**
    * The vertical dimension of the cross-section of the path in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height)
    */
  var height: Double = js.native
  
  /**
    * Controls the shape of the connection between two segments of the path.
    *
    * @default "miter"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#join)
    */
  var join: miter_ | bevel_ | round_ = js.native
  
  /**
    * The material used to shade the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#material)
    */
  var material: PathSymbol3DLayerMaterial = js.native
  
  /**
    * Cross-section profile of the path geometry.
    *
    * @default "circle"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile)
    */
  var profile: circle | quad = js.native
  
  /**
    * Defines how the [profile](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile) is rotated as it is extruded along the [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry.
    *
    * @default "all"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profileRotation)
    */
  var profileRotation: heading | all = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_PathSymbol3DLayer: path = js.native
  
  /**
    * The horizontal dimension of the cross-section of the path in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width)
    */
  var width: Double = js.native
}
