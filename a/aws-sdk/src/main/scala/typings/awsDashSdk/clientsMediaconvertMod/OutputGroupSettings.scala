package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroupSettings extends js.Object {
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a single video, audio, or caption output.
    */
  var CmafGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.CmafGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
    */
  var DashIsoGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.DashIsoGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
    */
  var FileGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.FileGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to HLS_GROUP_SETTINGS.
    */
  var HlsGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.HlsGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
    */
  var MsSmoothGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.MsSmoothGroupSettings] = js.native
  /**
    * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
    */
  var Type: js.UndefOr[OutputGroupType] = js.native
}

object OutputGroupSettings {
  @scala.inline
  def apply(
    CmafGroupSettings: CmafGroupSettings = null,
    DashIsoGroupSettings: DashIsoGroupSettings = null,
    FileGroupSettings: FileGroupSettings = null,
    HlsGroupSettings: HlsGroupSettings = null,
    MsSmoothGroupSettings: MsSmoothGroupSettings = null,
    Type: OutputGroupType = null
  ): OutputGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (CmafGroupSettings != null) __obj.updateDynamic("CmafGroupSettings")(CmafGroupSettings.asInstanceOf[js.Any])
    if (DashIsoGroupSettings != null) __obj.updateDynamic("DashIsoGroupSettings")(DashIsoGroupSettings.asInstanceOf[js.Any])
    if (FileGroupSettings != null) __obj.updateDynamic("FileGroupSettings")(FileGroupSettings.asInstanceOf[js.Any])
    if (HlsGroupSettings != null) __obj.updateDynamic("HlsGroupSettings")(HlsGroupSettings.asInstanceOf[js.Any])
    if (MsSmoothGroupSettings != null) __obj.updateDynamic("MsSmoothGroupSettings")(MsSmoothGroupSettings.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroupSettings]
  }
}

