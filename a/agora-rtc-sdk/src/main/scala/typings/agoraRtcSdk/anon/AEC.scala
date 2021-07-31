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
  
  @scala.inline
  def apply(): AEC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AEC]
  }
  
  @scala.inline
  implicit class AECMutableBuilder[Self <: AEC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAEC(value: Boolean): Self = StObject.set(x, "AEC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAECUndefined: Self = StObject.set(x, "AEC", js.undefined)
    
    @scala.inline
    def setAGC(value: Boolean): Self = StObject.set(x, "AGC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAGCUndefined: Self = StObject.set(x, "AGC", js.undefined)
    
    @scala.inline
    def setANS(value: Boolean): Self = StObject.set(x, "ANS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANSUndefined: Self = StObject.set(x, "ANS", js.undefined)
  }
}
