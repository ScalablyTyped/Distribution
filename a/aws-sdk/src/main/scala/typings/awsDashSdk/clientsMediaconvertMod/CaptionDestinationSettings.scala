package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionDestinationSettings extends js.Object {
  /**
    * Burn-In Destination Settings.
    */
  var BurninDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.BurninDestinationSettings] = js.undefined
  /**
    * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
    */
  var DestinationType: js.UndefOr[CaptionDestinationType] = js.undefined
  /**
    * DVB-Sub Destination Settings
    */
  var DvbSubDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.DvbSubDestinationSettings] = js.undefined
  /**
    * Settings specific to embedded/ancillary caption outputs, including 608/708 Channel destination number.
    */
  var EmbeddedDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.EmbeddedDestinationSettings] = js.undefined
  /**
    * Settings specific to IMSC caption outputs.
    */
  var ImscDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.ImscDestinationSettings] = js.undefined
  /**
    * Settings for SCC caption output.
    */
  var SccDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.SccDestinationSettings] = js.undefined
  /**
    * Settings for Teletext caption output
    */
  var TeletextDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.TeletextDestinationSettings] = js.undefined
  /**
    * Settings specific to TTML caption outputs, including Pass style information (TtmlStylePassthrough).
    */
  var TtmlDestinationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.TtmlDestinationSettings] = js.undefined
}

object CaptionDestinationSettings {
  @scala.inline
  def apply(
    BurninDestinationSettings: BurninDestinationSettings = null,
    DestinationType: CaptionDestinationType = null,
    DvbSubDestinationSettings: DvbSubDestinationSettings = null,
    EmbeddedDestinationSettings: EmbeddedDestinationSettings = null,
    ImscDestinationSettings: ImscDestinationSettings = null,
    SccDestinationSettings: SccDestinationSettings = null,
    TeletextDestinationSettings: TeletextDestinationSettings = null,
    TtmlDestinationSettings: TtmlDestinationSettings = null
  ): CaptionDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (BurninDestinationSettings != null) __obj.updateDynamic("BurninDestinationSettings")(BurninDestinationSettings)
    if (DestinationType != null) __obj.updateDynamic("DestinationType")(DestinationType.asInstanceOf[js.Any])
    if (DvbSubDestinationSettings != null) __obj.updateDynamic("DvbSubDestinationSettings")(DvbSubDestinationSettings)
    if (EmbeddedDestinationSettings != null) __obj.updateDynamic("EmbeddedDestinationSettings")(EmbeddedDestinationSettings)
    if (ImscDestinationSettings != null) __obj.updateDynamic("ImscDestinationSettings")(ImscDestinationSettings)
    if (SccDestinationSettings != null) __obj.updateDynamic("SccDestinationSettings")(SccDestinationSettings)
    if (TeletextDestinationSettings != null) __obj.updateDynamic("TeletextDestinationSettings")(TeletextDestinationSettings)
    if (TtmlDestinationSettings != null) __obj.updateDynamic("TtmlDestinationSettings")(TtmlDestinationSettings)
    __obj.asInstanceOf[CaptionDestinationSettings]
  }
}

