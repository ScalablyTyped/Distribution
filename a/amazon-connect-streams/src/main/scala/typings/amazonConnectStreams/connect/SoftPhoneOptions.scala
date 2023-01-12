package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftPhoneOptions extends StObject {
  
  /**
    * Normally, the softphone microphone and speaker components are not allowed to be hosted in an iframe.
    * This is because the softphone must be hosted in a single window or tab.
    * The window hosting the softphone session must not be closed during the course of a softphone call or the call will be disconnected.
    * If `allowFramedSoftphone` is `true`, the softphone components will be allowed to be hosted in this window or tab.
    */
  val allowFramedSoftphone: js.UndefOr[Boolean] = js.undefined
  
  /** This option allows you to completely disable the built-in ringtone audio that is played when a call is incoming. */
  val disableRingtone: js.UndefOr[Boolean] = js.undefined
  
  /** If the ringtone is not disabled, this allows for overriding the ringtone with any browser-supported audio file accessible by the user. */
  val ringtoneUrl: js.UndefOr[String] = js.undefined
}
object SoftPhoneOptions {
  
  inline def apply(): SoftPhoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftPhoneOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoftPhoneOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowFramedSoftphone(value: Boolean): Self = StObject.set(x, "allowFramedSoftphone", value.asInstanceOf[js.Any])
    
    inline def setAllowFramedSoftphoneUndefined: Self = StObject.set(x, "allowFramedSoftphone", js.undefined)
    
    inline def setDisableRingtone(value: Boolean): Self = StObject.set(x, "disableRingtone", value.asInstanceOf[js.Any])
    
    inline def setDisableRingtoneUndefined: Self = StObject.set(x, "disableRingtone", js.undefined)
    
    inline def setRingtoneUrl(value: String): Self = StObject.set(x, "ringtoneUrl", value.asInstanceOf[js.Any])
    
    inline def setRingtoneUrlUndefined: Self = StObject.set(x, "ringtoneUrl", js.undefined)
  }
}
