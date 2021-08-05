package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundId extends StObject {
  
  var soundId: String
}
object SoundId {
  
  inline def apply(soundId: String): SoundId = {
    val __obj = js.Dynamic.literal(soundId = soundId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundId]
  }
  
  extension [Self <: SoundId](x: Self) {
    
    inline def setSoundId(value: String): Self = StObject.set(x, "soundId", value.asInstanceOf[js.Any])
  }
}
