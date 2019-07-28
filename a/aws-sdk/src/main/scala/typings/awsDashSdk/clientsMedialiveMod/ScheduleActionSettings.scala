package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleActionSettings extends js.Object {
  /**
    * Action to insert HLS metadata
    */
  var HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings] = js.undefined
  /**
    * Action to switch the input
    */
  var InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings] = js.undefined
  /**
    * Action to pause or unpause one or both channel pipelines
    */
  var PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings] = js.undefined
  /**
    * Action to insert SCTE-35 return_to_network message
    */
  var Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings] = js.undefined
  /**
    * Action to insert SCTE-35 splice_insert message
    */
  var Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings] = js.undefined
  /**
    * Action to insert SCTE-35 time_signal message
    */
  var Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings] = js.undefined
  /**
    * Action to activate a static image overlay
    */
  var StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings] = js.undefined
  /**
    * Action to deactivate a static image overlay
    */
  var StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings] = js.undefined
}

object ScheduleActionSettings {
  @scala.inline
  def apply(
    HlsTimedMetadataSettings: HlsTimedMetadataScheduleActionSettings = null,
    InputSwitchSettings: InputSwitchScheduleActionSettings = null,
    PauseStateSettings: PauseStateScheduleActionSettings = null,
    Scte35ReturnToNetworkSettings: Scte35ReturnToNetworkScheduleActionSettings = null,
    Scte35SpliceInsertSettings: Scte35SpliceInsertScheduleActionSettings = null,
    Scte35TimeSignalSettings: Scte35TimeSignalScheduleActionSettings = null,
    StaticImageActivateSettings: StaticImageActivateScheduleActionSettings = null,
    StaticImageDeactivateSettings: StaticImageDeactivateScheduleActionSettings = null
  ): ScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    if (HlsTimedMetadataSettings != null) __obj.updateDynamic("HlsTimedMetadataSettings")(HlsTimedMetadataSettings)
    if (InputSwitchSettings != null) __obj.updateDynamic("InputSwitchSettings")(InputSwitchSettings)
    if (PauseStateSettings != null) __obj.updateDynamic("PauseStateSettings")(PauseStateSettings)
    if (Scte35ReturnToNetworkSettings != null) __obj.updateDynamic("Scte35ReturnToNetworkSettings")(Scte35ReturnToNetworkSettings)
    if (Scte35SpliceInsertSettings != null) __obj.updateDynamic("Scte35SpliceInsertSettings")(Scte35SpliceInsertSettings)
    if (Scte35TimeSignalSettings != null) __obj.updateDynamic("Scte35TimeSignalSettings")(Scte35TimeSignalSettings)
    if (StaticImageActivateSettings != null) __obj.updateDynamic("StaticImageActivateSettings")(StaticImageActivateSettings)
    if (StaticImageDeactivateSettings != null) __obj.updateDynamic("StaticImageDeactivateSettings")(StaticImageDeactivateSettings)
    __obj.asInstanceOf[ScheduleActionSettings]
  }
}

