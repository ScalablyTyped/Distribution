package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetContentStatus extends js.Object {
  /**
    * The reason the data set contents are in this state.
    */
  var reason: js.UndefOr[Reason] = js.undefined
  /**
    * The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
    */
  var state: js.UndefOr[DatasetContentState] = js.undefined
}

object DatasetContentStatus {
  @scala.inline
  def apply(reason: Reason = null, state: DatasetContentState = null): DatasetContentStatus = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetContentStatus]
  }
}

