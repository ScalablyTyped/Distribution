package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetContentSummary extends js.Object {
  /**
    * The actual time the creation of the data set contents was started.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The time the creation of the data set contents was scheduled to start.
    */
  var scheduleTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the data set contents.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.undefined
  /**
    * The version of the data set contents.
    */
  var version: js.UndefOr[DatasetContentVersion] = js.undefined
}

object DatasetContentSummary {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    scheduleTime: Timestamp = null,
    status: DatasetContentStatus = null,
    version: DatasetContentVersion = null
  ): DatasetContentSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DatasetContentSummary]
  }
}

