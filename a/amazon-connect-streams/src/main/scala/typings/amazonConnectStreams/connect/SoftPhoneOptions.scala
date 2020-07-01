package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftPhoneOptions extends js.Object {
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
  @scala.inline
  def apply(
    allowFramedSoftphone: js.UndefOr[Boolean] = js.undefined,
    disableRingtone: js.UndefOr[Boolean] = js.undefined,
    ringtoneUrl: String = null
  ): SoftPhoneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFramedSoftphone)) __obj.updateDynamic("allowFramedSoftphone")(allowFramedSoftphone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRingtone)) __obj.updateDynamic("disableRingtone")(disableRingtone.get.asInstanceOf[js.Any])
    if (ringtoneUrl != null) __obj.updateDynamic("ringtoneUrl")(ringtoneUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftPhoneOptions]
  }
}

