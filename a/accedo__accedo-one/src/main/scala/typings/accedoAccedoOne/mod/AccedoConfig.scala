package typings.accedoAccedoOne.mod

import typings.accedoAccedoOne.anon.DeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccedoConfig extends js.Object {
  /** The application Key */
  var appKey: String = js.native
  /**
    * A function that should return an object with deviceId and
    * sessionKey properties, saved from previous sessions (see
    * onDeviceIdGenerated, onSessionKeyChanged)
    */
  var browserInfoProvider: js.UndefOr[js.Function0[DeviceId]] = js.native
  /** The device identifier (if not provided, a uuid will be generated instead) */
  var deviceId: js.UndefOr[String] = js.native
  /** the user's IP, given to Accedo One for every request this client will trigger (for geolocation). */
  var ip: js.UndefOr[String] = js.native
  /** A function to use to see this SDK's logs */
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** Callback to obtain the new deviceId, if one gets generated */
  var onDeviceIdGenerated: js.UndefOr[js.Function1[/* deviceId */ String, Unit]] = js.native
  /** Callback to obtain the sessionKey, anytime a new one gets generated */
  var onSessionKeyChanged: js.UndefOr[js.Function1[/* sessionKey */ String, Unit]] = js.native
  /** The sessionKey (note a new one may be created when not given or expired) */
  var sessionKey: js.UndefOr[String] = js.native
  /** All APIs calls will use this as the base API URL (defaults to the Accedo One API URL) */
  var target: js.UndefOr[String] = js.native
}

object AccedoConfig {
  @scala.inline
  def apply(appKey: String): AccedoConfig = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccedoConfig]
  }
  @scala.inline
  implicit class AccedoConfigOps[Self <: AccedoConfig] (val x: Self) extends AnyVal {
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
    def setAppKey(value: String): Self = this.set("appKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserInfoProvider(value: () => DeviceId): Self = this.set("browserInfoProvider", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBrowserInfoProvider: Self = this.set("browserInfoProvider", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setOnDeviceIdGenerated(value: /* deviceId */ String => Unit): Self = this.set("onDeviceIdGenerated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeviceIdGenerated: Self = this.set("onDeviceIdGenerated", js.undefined)
    @scala.inline
    def setOnSessionKeyChanged(value: /* sessionKey */ String => Unit): Self = this.set("onSessionKeyChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSessionKeyChanged: Self = this.set("onSessionKeyChanged", js.undefined)
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

