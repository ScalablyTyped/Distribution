package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimecodeConfig extends js.Object {
  /**
    * Identifies the source for the timecode that will be associated with the events outputs.
  -Embedded (embedded): Initialize the output timecode with timecode from the the source.  If no embedded timecode is detected in the source, the system falls back to using "Start at 0" (zerobased).
  -System Clock (systemclock): Use the UTC time.
  -Start at 0 (zerobased): The time of the first frame of the event will be 00:00:00:00.
    */
  var Source: TimecodeConfigSource
  /**
    * Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies below this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No timecode sync when this is not specified.
    */
  var SyncThreshold: js.UndefOr[__integerMin1Max1000000] = js.undefined
}

object TimecodeConfig {
  @scala.inline
  def apply(Source: TimecodeConfigSource, SyncThreshold: Int | Double = null): TimecodeConfig = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    if (SyncThreshold != null) __obj.updateDynamic("SyncThreshold")(SyncThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimecodeConfig]
  }
}

