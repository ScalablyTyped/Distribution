package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDatastoreRequest extends js.Object {
  /**
    * The name of the data store to be updated.
    */
  var datastoreName: DatastoreName
  /**
    * Where data store data is stored.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.undefined
  /**
    * How long, in days, message data is kept for the data store.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}

object UpdateDatastoreRequest {
  @scala.inline
  def apply(
    datastoreName: DatastoreName,
    datastoreStorage: DatastoreStorage = null,
    retentionPeriod: RetentionPeriod = null
  ): UpdateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName)
    if (datastoreStorage != null) __obj.updateDynamic("datastoreStorage")(datastoreStorage)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    __obj.asInstanceOf[UpdateDatastoreRequest]
  }
}

