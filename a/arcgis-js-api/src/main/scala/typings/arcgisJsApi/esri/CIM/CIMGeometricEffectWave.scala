package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectWave
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
  			 * The distance perpendicular to a feature to display the curves for the symbol.
  			 */
  var amplitude: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The distance along the line or polygon to display the curves for the symbol.
  			 */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The staring value for generating a random number. This is only used when the Waveform is set to Random.
  			 */
  var seed: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectWave: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectWave
  
  /**
  			 * The shape of the curves to be displayed along the symbol.
  			 */
  var waveform: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectWaveform * / any */ String
  ] = js.undefined
}
object CIMGeometricEffectWave {
  
  inline def apply(): CIMGeometricEffectWave = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectWave")
    __obj.asInstanceOf[CIMGeometricEffectWave]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectWave] (val x: Self) extends AnyVal {
    
    inline def setAmplitude(value: Double): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
    
    inline def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectWave): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWaveform(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectWaveform * / any */ String
    ): Self = StObject.set(x, "waveform", value.asInstanceOf[js.Any])
    
    inline def setWaveformUndefined: Self = StObject.set(x, "waveform", js.undefined)
  }
}
