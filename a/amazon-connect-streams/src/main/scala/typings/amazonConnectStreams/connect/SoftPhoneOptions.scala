package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftPhoneOptions extends js.Object {
  
  /**
    * Normally, the softphone microphone and speaker components are not allowed to be hosted in an iframe.
    * This is because the softphone must be hosted in a single window or tab.
    * The window hosting the softphone session must not be closed during the course of a softphone call or the call will be disconnected.
    * If `allowFramedSoftphone` is `true`, the softphone components will be allowed to be hosted in this window or tab.
    */
  val allowFramedSoftphone: js.UndefOr[Boolean] = js.native
  
  /** This option allows you to completely disable the built-in ringtone audio that is played when a call is incoming. */
  val disableRingtone: js.UndefOr[Boolean] = js.native
  
  /** If the ringtone is not disabled, this allows for overriding the ringtone with any browser-supported audio file accessible by the user. */
  val ringtoneUrl: js.UndefOr[String] = js.native
}
object SoftPhoneOptions {
  
  @scala.inline
  def apply(): SoftPhoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftPhoneOptions]
  }
  
  @scala.inline
  implicit class SoftPhoneOptionsOps[Self <: SoftPhoneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowFramedSoftphone(value: Boolean): Self = this.set("allowFramedSoftphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFramedSoftphone: Self = this.set("allowFramedSoftphone", js.undefined)
    
    @scala.inline
    def setDisableRingtone(value: Boolean): Self = this.set("disableRingtone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRingtone: Self = this.set("disableRingtone", js.undefined)
    
    @scala.inline
    def setRingtoneUrl(value: String): Self = this.set("ringtoneUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRingtoneUrl: Self = this.set("ringtoneUrl", js.undefined)
  }
}
