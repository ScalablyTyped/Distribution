package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionDestinationSettings extends js.Object {
  var AribDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.AribDestinationSettings] = js.undefined
  var BurnInDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.BurnInDestinationSettings] = js.undefined
  var DvbSubDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.DvbSubDestinationSettings] = js.undefined
  var EmbeddedDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.EmbeddedDestinationSettings] = js.undefined
  var EmbeddedPlusScte20DestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.EmbeddedPlusScte20DestinationSettings] = js.undefined
  var RtmpCaptionInfoDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.RtmpCaptionInfoDestinationSettings] = js.undefined
  var Scte20PlusEmbeddedDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Scte20PlusEmbeddedDestinationSettings] = js.undefined
  var Scte27DestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Scte27DestinationSettings] = js.undefined
  var SmpteTtDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.SmpteTtDestinationSettings] = js.undefined
  var TeletextDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.TeletextDestinationSettings] = js.undefined
  var TtmlDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.TtmlDestinationSettings] = js.undefined
  var WebvttDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.WebvttDestinationSettings] = js.undefined
}

object CaptionDestinationSettings {
  @scala.inline
  def apply(
    AribDestinationSettings: AribDestinationSettings = null,
    BurnInDestinationSettings: BurnInDestinationSettings = null,
    DvbSubDestinationSettings: DvbSubDestinationSettings = null,
    EmbeddedDestinationSettings: EmbeddedDestinationSettings = null,
    EmbeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettings = null,
    RtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettings = null,
    Scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettings = null,
    Scte27DestinationSettings: Scte27DestinationSettings = null,
    SmpteTtDestinationSettings: SmpteTtDestinationSettings = null,
    TeletextDestinationSettings: TeletextDestinationSettings = null,
    TtmlDestinationSettings: TtmlDestinationSettings = null,
    WebvttDestinationSettings: WebvttDestinationSettings = null
  ): CaptionDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (AribDestinationSettings != null) __obj.updateDynamic("AribDestinationSettings")(AribDestinationSettings)
    if (BurnInDestinationSettings != null) __obj.updateDynamic("BurnInDestinationSettings")(BurnInDestinationSettings)
    if (DvbSubDestinationSettings != null) __obj.updateDynamic("DvbSubDestinationSettings")(DvbSubDestinationSettings)
    if (EmbeddedDestinationSettings != null) __obj.updateDynamic("EmbeddedDestinationSettings")(EmbeddedDestinationSettings)
    if (EmbeddedPlusScte20DestinationSettings != null) __obj.updateDynamic("EmbeddedPlusScte20DestinationSettings")(EmbeddedPlusScte20DestinationSettings)
    if (RtmpCaptionInfoDestinationSettings != null) __obj.updateDynamic("RtmpCaptionInfoDestinationSettings")(RtmpCaptionInfoDestinationSettings)
    if (Scte20PlusEmbeddedDestinationSettings != null) __obj.updateDynamic("Scte20PlusEmbeddedDestinationSettings")(Scte20PlusEmbeddedDestinationSettings)
    if (Scte27DestinationSettings != null) __obj.updateDynamic("Scte27DestinationSettings")(Scte27DestinationSettings)
    if (SmpteTtDestinationSettings != null) __obj.updateDynamic("SmpteTtDestinationSettings")(SmpteTtDestinationSettings)
    if (TeletextDestinationSettings != null) __obj.updateDynamic("TeletextDestinationSettings")(TeletextDestinationSettings)
    if (TtmlDestinationSettings != null) __obj.updateDynamic("TtmlDestinationSettings")(TtmlDestinationSettings)
    if (WebvttDestinationSettings != null) __obj.updateDynamic("WebvttDestinationSettings")(WebvttDestinationSettings)
    __obj.asInstanceOf[CaptionDestinationSettings]
  }
}

