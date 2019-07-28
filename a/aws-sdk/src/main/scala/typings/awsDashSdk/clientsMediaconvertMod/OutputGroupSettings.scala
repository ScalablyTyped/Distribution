package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputGroupSettings extends js.Object {
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a single video, audio, or caption output.
    */
  var CmafGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.CmafGroupSettings] = js.undefined
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
    */
  var DashIsoGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.DashIsoGroupSettings] = js.undefined
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
    */
  var FileGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.FileGroupSettings] = js.undefined
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to HLS_GROUP_SETTINGS.
    */
  var HlsGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.HlsGroupSettings] = js.undefined
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
    */
  var MsSmoothGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.MsSmoothGroupSettings] = js.undefined
  /**
    * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
    */
  var Type: js.UndefOr[OutputGroupType] = js.undefined
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
    if (CmafGroupSettings != null) __obj.updateDynamic("CmafGroupSettings")(CmafGroupSettings)
    if (DashIsoGroupSettings != null) __obj.updateDynamic("DashIsoGroupSettings")(DashIsoGroupSettings)
    if (FileGroupSettings != null) __obj.updateDynamic("FileGroupSettings")(FileGroupSettings)
    if (HlsGroupSettings != null) __obj.updateDynamic("HlsGroupSettings")(HlsGroupSettings)
    if (MsSmoothGroupSettings != null) __obj.updateDynamic("MsSmoothGroupSettings")(MsSmoothGroupSettings)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroupSettings]
  }
}

