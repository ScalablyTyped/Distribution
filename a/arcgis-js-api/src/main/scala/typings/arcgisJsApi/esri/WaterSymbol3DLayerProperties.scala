package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.calm
import typings.arcgisJsApi.arcgisJsApiStrings.large
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import typings.arcgisJsApi.arcgisJsApiStrings.moderate
import typings.arcgisJsApi.arcgisJsApiStrings.rippled
import typings.arcgisJsApi.arcgisJsApiStrings.slight
import typings.arcgisJsApi.arcgisJsApiStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterSymbol3DLayerProperties
  extends StObject
     with Symbol3DLayerProperties {
  
  /**
  		 * The dominant color used to shade the water.
  		 *
  		 * @default #0077BE
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#color)
  		 */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
  		 * Indicates the size of the waterbody which is represented by the symbol layer.
  		 *
  		 * @default medium
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waterbodySize)
  		 */
  var waterbodySize: js.UndefOr[small | medium | large] = js.undefined
  
  /**
  		 * Indicates the direction in which the waves travel.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveDirection)
  		 */
  var waveDirection: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates the shape and intensity of the waves.
  		 *
  		 * @default moderate
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveStrength)
  		 */
  var waveStrength: js.UndefOr[calm | rippled | slight | moderate] = js.undefined
}
object WaterSymbol3DLayerProperties {
  
  inline def apply(): WaterSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterSymbol3DLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaterSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setWaterbodySize(value: small | medium | large): Self = StObject.set(x, "waterbodySize", value.asInstanceOf[js.Any])
    
    inline def setWaterbodySizeUndefined: Self = StObject.set(x, "waterbodySize", js.undefined)
    
    inline def setWaveDirection(value: Double): Self = StObject.set(x, "waveDirection", value.asInstanceOf[js.Any])
    
    inline def setWaveDirectionUndefined: Self = StObject.set(x, "waveDirection", js.undefined)
    
    inline def setWaveStrength(value: calm | rippled | slight | moderate): Self = StObject.set(x, "waveStrength", value.asInstanceOf[js.Any])
    
    inline def setWaveStrengthUndefined: Self = StObject.set(x, "waveStrength", js.undefined)
  }
}
