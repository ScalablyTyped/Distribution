package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UdpOutputSettings extends js.Object {
  /**
    * UDP output buffering in milliseconds. Larger values increase latency through the transcoder but simultaneously assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery, input switching, input disruptions, picture reordering, etc.
    */
  var BufferMsec: js.UndefOr[__integerMin0Max10000] = js.undefined
  var ContainerSettings: UdpContainerSettings
  /**
    * Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
    */
  var Destination: OutputLocationRef
  /**
    * Settings for enabling and adjusting Forward Error Correction on UDP outputs.
    */
  var FecOutputSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.FecOutputSettings] = js.undefined
}

object UdpOutputSettings {
  @scala.inline
  def apply(
    ContainerSettings: UdpContainerSettings,
    Destination: OutputLocationRef,
    BufferMsec: Int | Double = null,
    FecOutputSettings: FecOutputSettings = null
  ): UdpOutputSettings = {
    val __obj = js.Dynamic.literal(ContainerSettings = ContainerSettings, Destination = Destination)
    if (BufferMsec != null) __obj.updateDynamic("BufferMsec")(BufferMsec.asInstanceOf[js.Any])
    if (FecOutputSettings != null) __obj.updateDynamic("FecOutputSettings")(FecOutputSettings)
    __obj.asInstanceOf[UdpOutputSettings]
  }
}

