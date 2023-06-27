package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Random
import typings.arcgisJsApi.arcgisJsApiStrings.Sinus
import typings.arcgisJsApi.arcgisJsApiStrings.Square
import typings.arcgisJsApi.arcgisJsApiStrings.Triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectWave
  extends StObject
     with CIMGeometricEffect {
  
  /**
  		 * The distance perpendicular to a feature to display the curves for the symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectWave)
  		 */
  var amplitude: Double
  
  /**
  		 * The distance along the line or polygon to display the curves for the symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectWave)
  		 */
  var period: Double
  
  /**
  		 * The primitive name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectWave)
  		 */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
  		 * The starting value for generating a random number.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectWave)
  		 */
  var seed: js.UndefOr[Double] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectWave
  
  /**
  		 * The shape of the curves to be displayed along the symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectWave)
  		 */
  var waveform: Sinus | Square | Triangle | Random
}
object CIMGeometricEffectWave {
  
  inline def apply(amplitude: Double, period: Double, waveform: Sinus | Square | Triangle | Random): CIMGeometricEffectWave = {
    val __obj = js.Dynamic.literal(amplitude = amplitude.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], waveform = waveform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectWave")
    __obj.asInstanceOf[CIMGeometricEffectWave]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectWave] (val x: Self) extends AnyVal {
    
    inline def setAmplitude(value: Double): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectWave): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWaveform(value: Sinus | Square | Triangle | Random): Self = StObject.set(x, "waveform", value.asInstanceOf[js.Any])
  }
}
