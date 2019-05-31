package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatastoreRequest extends js.Object {
  /**
    * The name of the data store.
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
  /**
    * Metadata which can be used to manage the data store.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateDatastoreRequest {
  @scala.inline
  def apply(
    datastoreName: DatastoreName,
    datastoreStorage: DatastoreStorage = null,
    retentionPeriod: RetentionPeriod = null,
    tags: TagList = null
  ): CreateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName)
    if (datastoreStorage != null) __obj.updateDynamic("datastoreStorage")(datastoreStorage)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateDatastoreRequest]
  }
}

