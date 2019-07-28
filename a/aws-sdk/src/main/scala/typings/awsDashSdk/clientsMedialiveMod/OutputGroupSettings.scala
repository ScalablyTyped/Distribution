package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputGroupSettings extends js.Object {
  var ArchiveGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.ArchiveGroupSettings] = js.undefined
  var FrameCaptureGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.FrameCaptureGroupSettings] = js.undefined
  var HlsGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.HlsGroupSettings] = js.undefined
  var MediaPackageGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MediaPackageGroupSettings] = js.undefined
  var MsSmoothGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MsSmoothGroupSettings] = js.undefined
  var RtmpGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.RtmpGroupSettings] = js.undefined
  var UdpGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.UdpGroupSettings] = js.undefined
}

object OutputGroupSettings {
  @scala.inline
  def apply(
    ArchiveGroupSettings: ArchiveGroupSettings = null,
    FrameCaptureGroupSettings: FrameCaptureGroupSettings = null,
    HlsGroupSettings: HlsGroupSettings = null,
    MediaPackageGroupSettings: MediaPackageGroupSettings = null,
    MsSmoothGroupSettings: MsSmoothGroupSettings = null,
    RtmpGroupSettings: RtmpGroupSettings = null,
    UdpGroupSettings: UdpGroupSettings = null
  ): OutputGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (ArchiveGroupSettings != null) __obj.updateDynamic("ArchiveGroupSettings")(ArchiveGroupSettings)
    if (FrameCaptureGroupSettings != null) __obj.updateDynamic("FrameCaptureGroupSettings")(FrameCaptureGroupSettings)
    if (HlsGroupSettings != null) __obj.updateDynamic("HlsGroupSettings")(HlsGroupSettings)
    if (MediaPackageGroupSettings != null) __obj.updateDynamic("MediaPackageGroupSettings")(MediaPackageGroupSettings)
    if (MsSmoothGroupSettings != null) __obj.updateDynamic("MsSmoothGroupSettings")(MsSmoothGroupSettings)
    if (RtmpGroupSettings != null) __obj.updateDynamic("RtmpGroupSettings")(RtmpGroupSettings)
    if (UdpGroupSettings != null) __obj.updateDynamic("UdpGroupSettings")(UdpGroupSettings)
    __obj.asInstanceOf[OutputGroupSettings]
  }
}

