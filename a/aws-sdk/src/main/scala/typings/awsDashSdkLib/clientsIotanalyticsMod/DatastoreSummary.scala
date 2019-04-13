package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreSummary extends js.Object {
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.undefined
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the data store.
    */
  var status: js.UndefOr[DatastoreStatus] = js.undefined
}

object DatastoreSummary {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    datastoreName: DatastoreName = null,
    lastUpdateTime: Timestamp = null,
    status: DatastoreStatus = null
  ): DatastoreSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (datastoreName != null) __obj.updateDynamic("datastoreName")(datastoreName)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreSummary]
  }
}

