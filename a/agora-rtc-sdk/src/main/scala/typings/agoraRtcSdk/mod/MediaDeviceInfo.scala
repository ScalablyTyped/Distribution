package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media Device Information
  *
  * This interface contains information that describes a single media input or output device.
  *
  * The list of devices obtained by calling {@link AgoraRTC.getDevices} is an array of `MediaDeviceInfo` objects, one per media device.
  */
trait MediaDeviceInfo extends js.Object {
  /**
    * Device ID
    *
    * The unique ID of the device.
    *
    * **Note**
    *
    * On Chrome 81 or later, the device ID is only available after the user has granted permission to use the media device.
    */
  val deviceId: String
  /**
    * Device Type
    *
    * Returns an enumerated value that is "videoinput", "audioinput" or "audiooutput".
    */
  val kind: String
  /**
    * Device Label
    *
    * Returns a `DOMString` that is a label describing this device (for example "External USB Webcam").
    *
    * **Note**
    *
    * For security reasons, the label field is always blank unless an active media stream exists or the user has granted persistent permission for media device access.
    *
    */
  val label: String
}

object MediaDeviceInfo {
  @scala.inline
  def apply(deviceId: String, kind: String, label: String): MediaDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDeviceInfo]
  }
}

