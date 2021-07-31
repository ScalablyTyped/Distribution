package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectWaveform extends StObject
@JSGlobal("__esri.CIM.GeometricEffectWaveform")
@js.native
object GeometricEffectWaveform extends StObject {
  
  /**
    * Random - displays a sine curve with random variations in the period and amplitude
    */
  @js.native
  sealed trait Random
    extends StObject
       with GeometricEffectWaveform
  
  /**
    * Sinus - displays a sinusoidal curve.
    */
  @js.native
  sealed trait Sinus
    extends StObject
       with GeometricEffectWaveform
  
  /**
    * Square - displays a three-sided rectangular shape.
    */
  @js.native
  sealed trait Square
    extends StObject
       with GeometricEffectWaveform
  
  /**
    * Triangle - displays a two-sided triangular shape.
    */
  @js.native
  sealed trait Triangle
    extends StObject
       with GeometricEffectWaveform
}
