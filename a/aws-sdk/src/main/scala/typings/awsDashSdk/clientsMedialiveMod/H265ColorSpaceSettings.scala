package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait H265ColorSpaceSettings extends js.Object {
  var ColorSpacePassthroughSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.ColorSpacePassthroughSettings] = js.undefined
  var Hdr10Settings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Hdr10Settings] = js.undefined
  var Rec601Settings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Rec601Settings] = js.undefined
  var Rec709Settings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Rec709Settings] = js.undefined
}

object H265ColorSpaceSettings {
  @scala.inline
  def apply(
    ColorSpacePassthroughSettings: ColorSpacePassthroughSettings = null,
    Hdr10Settings: Hdr10Settings = null,
    Rec601Settings: Rec601Settings = null,
    Rec709Settings: Rec709Settings = null
  ): H265ColorSpaceSettings = {
    val __obj = js.Dynamic.literal()
    if (ColorSpacePassthroughSettings != null) __obj.updateDynamic("ColorSpacePassthroughSettings")(ColorSpacePassthroughSettings)
    if (Hdr10Settings != null) __obj.updateDynamic("Hdr10Settings")(Hdr10Settings)
    if (Rec601Settings != null) __obj.updateDynamic("Rec601Settings")(Rec601Settings)
    if (Rec709Settings != null) __obj.updateDynamic("Rec709Settings")(Rec709Settings)
    __obj.asInstanceOf[H265ColorSpaceSettings]
  }
}

