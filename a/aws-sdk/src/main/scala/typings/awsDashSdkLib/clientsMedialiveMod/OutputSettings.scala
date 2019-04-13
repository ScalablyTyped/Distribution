package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSettings extends js.Object {
  var ArchiveOutputSettings: js.UndefOr[ArchiveOutputSettings] = js.undefined
  var FrameCaptureOutputSettings: js.UndefOr[FrameCaptureOutputSettings] = js.undefined
  var HlsOutputSettings: js.UndefOr[HlsOutputSettings] = js.undefined
  var MediaPackageOutputSettings: js.UndefOr[MediaPackageOutputSettings] = js.undefined
  var MsSmoothOutputSettings: js.UndefOr[MsSmoothOutputSettings] = js.undefined
  var RtmpOutputSettings: js.UndefOr[RtmpOutputSettings] = js.undefined
  var UdpOutputSettings: js.UndefOr[UdpOutputSettings] = js.undefined
}

object OutputSettings {
  @scala.inline
  def apply(
    ArchiveOutputSettings: ArchiveOutputSettings = null,
    FrameCaptureOutputSettings: FrameCaptureOutputSettings = null,
    HlsOutputSettings: HlsOutputSettings = null,
    MediaPackageOutputSettings: MediaPackageOutputSettings = null,
    MsSmoothOutputSettings: MsSmoothOutputSettings = null,
    RtmpOutputSettings: RtmpOutputSettings = null,
    UdpOutputSettings: UdpOutputSettings = null
  ): OutputSettings = {
    val __obj = js.Dynamic.literal()
    if (ArchiveOutputSettings != null) __obj.updateDynamic("ArchiveOutputSettings")(ArchiveOutputSettings)
    if (FrameCaptureOutputSettings != null) __obj.updateDynamic("FrameCaptureOutputSettings")(FrameCaptureOutputSettings)
    if (HlsOutputSettings != null) __obj.updateDynamic("HlsOutputSettings")(HlsOutputSettings)
    if (MediaPackageOutputSettings != null) __obj.updateDynamic("MediaPackageOutputSettings")(MediaPackageOutputSettings)
    if (MsSmoothOutputSettings != null) __obj.updateDynamic("MsSmoothOutputSettings")(MsSmoothOutputSettings)
    if (RtmpOutputSettings != null) __obj.updateDynamic("RtmpOutputSettings")(RtmpOutputSettings)
    if (UdpOutputSettings != null) __obj.updateDynamic("UdpOutputSettings")(UdpOutputSettings)
    __obj.asInstanceOf[OutputSettings]
  }
}

