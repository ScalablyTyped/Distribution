package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agora-rtc-sdk", "getDevices")
@js.native
object getDevices extends js.Object {
  /**
    * Enumerates the Media Devices
    *
    * This method enumerates the available media input and output devices, such as microphones, cameras, headsets, and so on.
    *
    * If this method succeeds, the SDK returns a list of media devices in an array of {@link MediaDeviceInfo} objects.
    *
    * **Note:**
    *
    * On Safari 12.1 or later, call this method after calling {@link createStream} successfully.
    * @example
    * **Sample code**
    *
    * ``` javascript
    * AgoraRTC.getDevices (function(devices) {
    * var devCount = devices.length;
    *
    * var id = devices[0].deviceId;
    * });
    * ```
    */
  def apply(callback: js.Function1[/* devices */ js.Array[MediaDeviceInfo], Unit]): Unit = js.native
}

