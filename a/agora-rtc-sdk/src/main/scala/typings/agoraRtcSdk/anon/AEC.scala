package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AEC extends StObject {
  
  /**
    * Marks whether to enable acoustic echo cancellation.
    *
    * The default value is `true` (enable). If you wish not to enable the  acoustic echo cancellation, set `AEC` as `false`.
    *
    * **Note**
    *
    * Safari does not support this setting.
    */
  var AEC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Marks whether to enable audio gain control.
    *
    * The default value is `true` (enable). If you wish not to enable the audio gain control, set `AGC` as `false`.
    *
    * **Note**
    *
    * Safari does not support this setting.
    */
  var AGC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Marks whether to enable automatic noise suppression.
    *
    * The default value is `true` (enable). If you wish not to enable automatic noise suppression, set `ANS` as `false`.
    *
    * **Note**
    *
    * - Safari does not support this setting.
    * - Noise suppression is always enabled on Firefox. Setting `ANS` as `false` does not take effect on Firefox.
    */
  var ANS: js.UndefOr[Boolean] = js.undefined
}
object AEC {
  
  inline def apply(): AEC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AEC]
  }
  
  extension [Self <: AEC](x: Self) {
    
    inline def setAEC(value: Boolean): Self = StObject.set(x, "AEC", value.asInstanceOf[js.Any])
    
    inline def setAECUndefined: Self = StObject.set(x, "AEC", js.undefined)
    
    inline def setAGC(value: Boolean): Self = StObject.set(x, "AGC", value.asInstanceOf[js.Any])
    
    inline def setAGCUndefined: Self = StObject.set(x, "AGC", js.undefined)
    
    inline def setANS(value: Boolean): Self = StObject.set(x, "ANS", value.asInstanceOf[js.Any])
    
    inline def setANSUndefined: Self = StObject.set(x, "ANS", js.undefined)
  }
}
