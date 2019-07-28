package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfiguration extends js.Object {
  /**
    * Value to set the initial audio gain for the Live Event.
    */
  var InitialAudioGain: js.UndefOr[__integerMinNegative60Max60] = js.undefined
  /**
    * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is configured the encoder will restart at the beginning of the first input.  When "none" is configured the encoder will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior" configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
    */
  var InputEndAction: js.UndefOr[GlobalConfigurationInputEndAction] = js.undefined
  /**
    * Settings for system actions when input is lost.
    */
  var InputLossBehavior: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.InputLossBehavior] = js.undefined
  /**
    * Indicates how MediaLive pipelines are synchronized.
  PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other.
  EPOCHLOCKING - MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
    */
  var OutputLockingMode: js.UndefOr[GlobalConfigurationOutputLockingMode] = js.undefined
  /**
    * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which optionally may be locked to another source via NTP) or should be locked to the clock of the source that is providing the input stream.
    */
  var OutputTimingSource: js.UndefOr[GlobalConfigurationOutputTimingSource] = js.undefined
  /**
    * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music channels with less than one video frame per second.
    */
  var SupportLowFramerateInputs: js.UndefOr[GlobalConfigurationLowFramerateInputs] = js.undefined
}

object GlobalConfiguration {
  @scala.inline
  def apply(
    InitialAudioGain: js.UndefOr[__integerMinNegative60Max60] = js.undefined,
    InputEndAction: GlobalConfigurationInputEndAction = null,
    InputLossBehavior: InputLossBehavior = null,
    OutputLockingMode: GlobalConfigurationOutputLockingMode = null,
    OutputTimingSource: GlobalConfigurationOutputTimingSource = null,
    SupportLowFramerateInputs: GlobalConfigurationLowFramerateInputs = null
  ): GlobalConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InitialAudioGain)) __obj.updateDynamic("InitialAudioGain")(InitialAudioGain)
    if (InputEndAction != null) __obj.updateDynamic("InputEndAction")(InputEndAction.asInstanceOf[js.Any])
    if (InputLossBehavior != null) __obj.updateDynamic("InputLossBehavior")(InputLossBehavior)
    if (OutputLockingMode != null) __obj.updateDynamic("OutputLockingMode")(OutputLockingMode.asInstanceOf[js.Any])
    if (OutputTimingSource != null) __obj.updateDynamic("OutputTimingSource")(OutputTimingSource.asInstanceOf[js.Any])
    if (SupportLowFramerateInputs != null) __obj.updateDynamic("SupportLowFramerateInputs")(SupportLowFramerateInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfiguration]
  }
}

