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
@js.native
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
  val deviceId: String = js.native
  /**
    * Device Type
    *
    * Returns an enumerated value that is "videoinput", "audioinput" or "audiooutput".
    */
  val kind: String = js.native
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
  val label: String = js.native
}

object MediaDeviceInfo {
  @scala.inline
  def apply(deviceId: String, kind: String, label: String): MediaDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDeviceInfo]
  }
  @scala.inline
  implicit class MediaDeviceInfoOps[Self <: MediaDeviceInfo] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

