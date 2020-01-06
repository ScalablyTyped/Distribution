package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleActionSettings extends js.Object {
  /**
    * Action to insert HLS ID3 segment tagging
    */
  var HlsId3SegmentTaggingSettings: js.UndefOr[HlsId3SegmentTaggingScheduleActionSettings] = js.native
  /**
    * Action to insert HLS metadata
    */
  var HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings] = js.native
  /**
    * Action to switch the input
    */
  var InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings] = js.native
  /**
    * Action to pause or unpause one or both channel pipelines
    */
  var PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings] = js.native
  /**
    * Action to insert SCTE-35 return_to_network message
    */
  var Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings] = js.native
  /**
    * Action to insert SCTE-35 splice_insert message
    */
  var Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings] = js.native
  /**
    * Action to insert SCTE-35 time_signal message
    */
  var Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings] = js.native
  /**
    * Action to activate a static image overlay
    */
  var StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings] = js.native
  /**
    * Action to deactivate a static image overlay
    */
  var StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings] = js.native
}

object ScheduleActionSettings {
  @scala.inline
  def apply(
    HlsId3SegmentTaggingSettings: HlsId3SegmentTaggingScheduleActionSettings = null,
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
    if (HlsId3SegmentTaggingSettings != null) __obj.updateDynamic("HlsId3SegmentTaggingSettings")(HlsId3SegmentTaggingSettings.asInstanceOf[js.Any])
    if (HlsTimedMetadataSettings != null) __obj.updateDynamic("HlsTimedMetadataSettings")(HlsTimedMetadataSettings.asInstanceOf[js.Any])
    if (InputSwitchSettings != null) __obj.updateDynamic("InputSwitchSettings")(InputSwitchSettings.asInstanceOf[js.Any])
    if (PauseStateSettings != null) __obj.updateDynamic("PauseStateSettings")(PauseStateSettings.asInstanceOf[js.Any])
    if (Scte35ReturnToNetworkSettings != null) __obj.updateDynamic("Scte35ReturnToNetworkSettings")(Scte35ReturnToNetworkSettings.asInstanceOf[js.Any])
    if (Scte35SpliceInsertSettings != null) __obj.updateDynamic("Scte35SpliceInsertSettings")(Scte35SpliceInsertSettings.asInstanceOf[js.Any])
    if (Scte35TimeSignalSettings != null) __obj.updateDynamic("Scte35TimeSignalSettings")(Scte35TimeSignalSettings.asInstanceOf[js.Any])
    if (StaticImageActivateSettings != null) __obj.updateDynamic("StaticImageActivateSettings")(StaticImageActivateSettings.asInstanceOf[js.Any])
    if (StaticImageDeactivateSettings != null) __obj.updateDynamic("StaticImageDeactivateSettings")(StaticImageDeactivateSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleActionSettings]
  }
}

