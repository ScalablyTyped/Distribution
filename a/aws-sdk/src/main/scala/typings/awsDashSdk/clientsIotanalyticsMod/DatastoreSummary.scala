package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreSummary extends js.Object {
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.native
  /**
    * Where data store data is stored.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorageSummary] = js.native
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the data store.
    */
  var status: js.UndefOr[DatastoreStatus] = js.native
}

object DatastoreSummary {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    datastoreName: DatastoreName = null,
    datastoreStorage: DatastoreStorageSummary = null,
    lastUpdateTime: Timestamp = null,
    status: DatastoreStatus = null
  ): DatastoreSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (datastoreName != null) __obj.updateDynamic("datastoreName")(datastoreName.asInstanceOf[js.Any])
    if (datastoreStorage != null) __obj.updateDynamic("datastoreStorage")(datastoreStorage.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreSummary]
  }
}

