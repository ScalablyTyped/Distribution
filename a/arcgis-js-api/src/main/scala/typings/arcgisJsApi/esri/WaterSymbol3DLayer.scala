package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.calm
import typings.arcgisJsApi.arcgisJsApiStrings.large
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import typings.arcgisJsApi.arcgisJsApiStrings.moderate
import typings.arcgisJsApi.arcgisJsApiStrings.rippled
import typings.arcgisJsApi.arcgisJsApiStrings.slight
import typings.arcgisJsApi.arcgisJsApiStrings.small
import typings.arcgisJsApi.arcgisJsApiStrings.water
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterSymbol3DLayer
  extends StObject
     with Symbol3DLayer
     with typings.arcgisJsApi.esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  
  /**
  		 * The dominant color used to shade the water.
  		 *
  		 * @default #0077BE
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * The symbol type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#type)
  		 */
  @JSName("type")
  val type_WaterSymbol3DLayer: water = js.native
  
  /**
  		 * Indicates the size of the waterbody which is represented by the symbol layer.
  		 *
  		 * @default medium
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waterbodySize)
  		 */
  var waterbodySize: small | medium | large = js.native
  
  /**
  		 * Indicates the direction in which the waves travel.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveDirection)
  		 */
  var waveDirection: Double = js.native
  
  /**
  		 * Indicates the shape and intensity of the waves.
  		 *
  		 * @default moderate
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveStrength)
  		 */
  var waveStrength: calm | rippled | slight | moderate = js.native
}
