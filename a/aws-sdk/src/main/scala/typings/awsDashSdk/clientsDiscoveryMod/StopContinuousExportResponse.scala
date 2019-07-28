package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopContinuousExportResponse extends js.Object {
  /**
    * Timestamp that represents when this continuous export started collecting data.
    */
  var startTime: js.UndefOr[TimeStamp] = js.undefined
  /**
    * Timestamp that represents when this continuous export was stopped.
    */
  var stopTime: js.UndefOr[TimeStamp] = js.undefined
}

object StopContinuousExportResponse {
  @scala.inline
  def apply(startTime: TimeStamp = null, stopTime: TimeStamp = null): StopContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime)
    __obj.asInstanceOf[StopContinuousExportResponse]
  }
}

