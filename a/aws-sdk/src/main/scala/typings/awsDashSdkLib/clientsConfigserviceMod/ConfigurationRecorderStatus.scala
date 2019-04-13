package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationRecorderStatus extends js.Object {
  /**
    * The error code indicating that the recording failed.
    */
  var lastErrorCode: js.UndefOr[String] = js.undefined
  /**
    * The message indicating that the recording failed due to an error.
    */
  var lastErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The time the recorder was last started.
    */
  var lastStartTime: js.UndefOr[_Date] = js.undefined
  /**
    * The last (previous) status of the recorder.
    */
  var lastStatus: js.UndefOr[RecorderStatus] = js.undefined
  /**
    * The time when the status was last changed.
    */
  var lastStatusChangeTime: js.UndefOr[_Date] = js.undefined
  /**
    * The time the recorder was last stopped.
    */
  var lastStopTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the configuration recorder.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether or not the recorder is currently recording.
    */
  var recording: js.UndefOr[Boolean] = js.undefined
}

object ConfigurationRecorderStatus {
  @scala.inline
  def apply(
    lastErrorCode: String = null,
    lastErrorMessage: String = null,
    lastStartTime: _Date = null,
    lastStatus: RecorderStatus = null,
    lastStatusChangeTime: _Date = null,
    lastStopTime: _Date = null,
    name: String = null,
    recording: js.UndefOr[Boolean] = js.undefined
  ): ConfigurationRecorderStatus = {
    val __obj = js.Dynamic.literal()
    if (lastErrorCode != null) __obj.updateDynamic("lastErrorCode")(lastErrorCode)
    if (lastErrorMessage != null) __obj.updateDynamic("lastErrorMessage")(lastErrorMessage)
    if (lastStartTime != null) __obj.updateDynamic("lastStartTime")(lastStartTime)
    if (lastStatus != null) __obj.updateDynamic("lastStatus")(lastStatus.asInstanceOf[js.Any])
    if (lastStatusChangeTime != null) __obj.updateDynamic("lastStatusChangeTime")(lastStatusChangeTime)
    if (lastStopTime != null) __obj.updateDynamic("lastStopTime")(lastStopTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(recording)) __obj.updateDynamic("recording")(recording)
    __obj.asInstanceOf[ConfigurationRecorderStatus]
  }
}

