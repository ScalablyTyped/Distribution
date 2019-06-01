package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftPhoneOptions extends js.Object {
  /*
    * Whether to display the softphone in a frame.
    */
  var allowFramedSoftphone: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Whether to disable the ringtone.
    */
  var disableRingtone: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * A URL for a custom ringtone.
    */
  var ringtoneUrl: js.UndefOr[java.lang.String] = js.undefined
}

object SoftPhoneOptions {
  @scala.inline
  def apply(
    allowFramedSoftphone: js.UndefOr[scala.Boolean] = js.undefined,
    disableRingtone: js.UndefOr[scala.Boolean] = js.undefined,
    ringtoneUrl: java.lang.String = null
  ): SoftPhoneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFramedSoftphone)) __obj.updateDynamic("allowFramedSoftphone")(allowFramedSoftphone)
    if (!js.isUndefined(disableRingtone)) __obj.updateDynamic("disableRingtone")(disableRingtone)
    if (ringtoneUrl != null) __obj.updateDynamic("ringtoneUrl")(ringtoneUrl)
    __obj.asInstanceOf[SoftPhoneOptions]
  }
}

