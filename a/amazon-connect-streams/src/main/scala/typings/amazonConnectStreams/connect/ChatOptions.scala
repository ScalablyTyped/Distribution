package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatOptions extends StObject {
  
  /** This option allows you to completely disable the built-in ringtone audio that is played when a chat is incoming. */
  val disableRingtone: js.UndefOr[Boolean] = js.undefined
  
  /** If the ringtone is not disabled, this allows for overriding the ringtone with any browser-supported audio file accessible by the user. */
  val ringtoneUrl: js.UndefOr[String] = js.undefined
}
object ChatOptions {
  
  inline def apply(): ChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatOptions]
  }
  
  extension [Self <: ChatOptions](x: Self) {
    
    inline def setDisableRingtone(value: Boolean): Self = StObject.set(x, "disableRingtone", value.asInstanceOf[js.Any])
    
    inline def setDisableRingtoneUndefined: Self = StObject.set(x, "disableRingtone", js.undefined)
    
    inline def setRingtoneUrl(value: String): Self = StObject.set(x, "ringtoneUrl", value.asInstanceOf[js.Any])
    
    inline def setRingtoneUrlUndefined: Self = StObject.set(x, "ringtoneUrl", js.undefined)
  }
}
