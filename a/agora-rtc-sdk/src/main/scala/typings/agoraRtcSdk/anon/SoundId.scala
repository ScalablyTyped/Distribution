package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundId extends StObject {
  
  var soundId: Double
  
  var volume: Double
}
object SoundId {
  
  @scala.inline
  def apply(soundId: Double, volume: Double): SoundId = {
    val __obj = js.Dynamic.literal(soundId = soundId.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundId]
  }
  
  @scala.inline
  implicit class SoundIdMutableBuilder[Self <: SoundId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSoundId(value: Double): Self = StObject.set(x, "soundId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
