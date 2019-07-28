package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSelectorSettings extends js.Object {
  var AribSourceSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.AribSourceSettings] = js.undefined
  var DvbSubSourceSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.DvbSubSourceSettings] = js.undefined
  var EmbeddedSourceSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.EmbeddedSourceSettings] = js.undefined
  var Scte20SourceSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Scte20SourceSettings] = js.undefined
  var Scte27SourceSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Scte27SourceSettings] = js.undefined
  var TeletextSourceSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.TeletextSourceSettings] = js.undefined
}

object CaptionSelectorSettings {
  @scala.inline
  def apply(
    AribSourceSettings: AribSourceSettings = null,
    DvbSubSourceSettings: DvbSubSourceSettings = null,
    EmbeddedSourceSettings: EmbeddedSourceSettings = null,
    Scte20SourceSettings: Scte20SourceSettings = null,
    Scte27SourceSettings: Scte27SourceSettings = null,
    TeletextSourceSettings: TeletextSourceSettings = null
  ): CaptionSelectorSettings = {
    val __obj = js.Dynamic.literal()
    if (AribSourceSettings != null) __obj.updateDynamic("AribSourceSettings")(AribSourceSettings)
    if (DvbSubSourceSettings != null) __obj.updateDynamic("DvbSubSourceSettings")(DvbSubSourceSettings)
    if (EmbeddedSourceSettings != null) __obj.updateDynamic("EmbeddedSourceSettings")(EmbeddedSourceSettings)
    if (Scte20SourceSettings != null) __obj.updateDynamic("Scte20SourceSettings")(Scte20SourceSettings)
    if (Scte27SourceSettings != null) __obj.updateDynamic("Scte27SourceSettings")(Scte27SourceSettings)
    if (TeletextSourceSettings != null) __obj.updateDynamic("TeletextSourceSettings")(TeletextSourceSettings)
    __obj.asInstanceOf[CaptionSelectorSettings]
  }
}

