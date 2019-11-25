package typings.amazonDashConnectDashStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftPhoneOptions extends js.Object {
  /*
    * Whether to display the softphone in a frame.
    */
  var allowFramedSoftphone: js.UndefOr[Boolean] = js.undefined
  /*
    * Whether to disable the ringtone.
    */
  var disableRingtone: js.UndefOr[Boolean] = js.undefined
  /*
    * A URL for a custom ringtone.
    */
  var ringtoneUrl: js.UndefOr[String] = js.undefined
}

object SoftPhoneOptions {
  @scala.inline
  def apply(
    allowFramedSoftphone: js.UndefOr[Boolean] = js.undefined,
    disableRingtone: js.UndefOr[Boolean] = js.undefined,
    ringtoneUrl: String = null
  ): SoftPhoneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFramedSoftphone)) __obj.updateDynamic("allowFramedSoftphone")(allowFramedSoftphone.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRingtone)) __obj.updateDynamic("disableRingtone")(disableRingtone.asInstanceOf[js.Any])
    if (ringtoneUrl != null) __obj.updateDynamic("ringtoneUrl")(ringtoneUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftPhoneOptions]
  }
}

