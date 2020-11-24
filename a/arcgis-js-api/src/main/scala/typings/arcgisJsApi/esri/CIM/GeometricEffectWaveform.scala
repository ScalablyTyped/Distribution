package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectWaveform extends js.Object
@JSGlobal("__esri.CIM.GeometricEffectWaveform")
@js.native
object GeometricEffectWaveform extends js.Object {
  
  /**
    * Random - displays a sine curve with random variations in the period and amplitude
    */
  @js.native
  sealed trait Random extends GeometricEffectWaveform
  
  /**
    * Sinus - displays a sinusoidal curve.
    */
  @js.native
  sealed trait Sinus extends GeometricEffectWaveform
  
  /**
    * Square - displays a three-sided rectangular shape.
    */
  @js.native
  sealed trait Square extends GeometricEffectWaveform
  
  /**
    * Triangle - displays a two-sided triangular shape.
    */
  @js.native
  sealed trait Triangle extends GeometricEffectWaveform
}
