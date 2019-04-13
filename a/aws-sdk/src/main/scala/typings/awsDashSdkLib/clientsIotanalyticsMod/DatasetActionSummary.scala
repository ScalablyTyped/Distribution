package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetActionSummary extends js.Object {
  /**
    * The name of the action which automatically creates the data set's contents.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.undefined
  /**
    * The type of action by which the data set's contents are automatically created.
    */
  var actionType: js.UndefOr[DatasetActionType] = js.undefined
}

object DatasetActionSummary {
  @scala.inline
  def apply(actionName: DatasetActionName = null, actionType: DatasetActionType = null): DatasetActionSummary = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetActionSummary]
  }
}

