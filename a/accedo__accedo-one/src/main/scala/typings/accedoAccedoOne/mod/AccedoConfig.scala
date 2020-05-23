package typings.accedoAccedoOne.mod

import typings.accedoAccedoOne.anon.DeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccedoConfig extends js.Object {
  /** The application Key */
  var appKey: String
  /**
    * A function that should return an object with deviceId and
    * sessionKey properties, saved from previous sessions (see
    * onDeviceIdGenerated, onSessionKeyChanged)
    */
  var browserInfoProvider: js.UndefOr[js.Function0[DeviceId]] = js.undefined
  /** The device identifier (if not provided, a uuid will be generated instead) */
  var deviceId: js.UndefOr[String] = js.undefined
  /** the user's IP, given to Accedo One for every request this client will trigger (for geolocation). */
  var ip: js.UndefOr[String] = js.undefined
  /** A function to use to see this SDK's logs */
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** Callback to obtain the new deviceId, if one gets generated */
  var onDeviceIdGenerated: js.UndefOr[js.Function1[/* deviceId */ String, Unit]] = js.undefined
  /** Callback to obtain the sessionKey, anytime a new one gets generated */
  var onSessionKeyChanged: js.UndefOr[js.Function1[/* sessionKey */ String, Unit]] = js.undefined
  /** The sessionKey (note a new one may be created when not given or expired) */
  var sessionKey: js.UndefOr[String] = js.undefined
  /** All APIs calls will use this as the base API URL (defaults to the Accedo One API URL) */
  var target: js.UndefOr[String] = js.undefined
}

object AccedoConfig {
  @scala.inline
  def apply(
    appKey: String,
    browserInfoProvider: () => DeviceId = null,
    deviceId: String = null,
    ip: String = null,
    log: /* repeated */ js.Any => Unit = null,
    onDeviceIdGenerated: /* deviceId */ String => Unit = null,
    onSessionKeyChanged: /* sessionKey */ String => Unit = null,
    sessionKey: String = null,
    target: String = null
  ): AccedoConfig = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    if (browserInfoProvider != null) __obj.updateDynamic("browserInfoProvider")(js.Any.fromFunction0(browserInfoProvider))
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (onDeviceIdGenerated != null) __obj.updateDynamic("onDeviceIdGenerated")(js.Any.fromFunction1(onDeviceIdGenerated))
    if (onSessionKeyChanged != null) __obj.updateDynamic("onSessionKeyChanged")(js.Any.fromFunction1(onSessionKeyChanged))
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccedoConfig]
  }
}

