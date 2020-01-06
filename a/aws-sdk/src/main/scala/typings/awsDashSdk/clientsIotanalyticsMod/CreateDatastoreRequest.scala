package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatastoreRequest extends js.Object {
  /**
    * The name of the data store.
    */
  var datastoreName: DatastoreName = js.native
  /**
    * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.native
  /**
    * How long, in days, message data is kept for the data store. When "customerManagedS3" storage is selected, this parameter is ignored.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  /**
    * Metadata which can be used to manage the data store.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateDatastoreRequest {
  @scala.inline
  def apply(
    datastoreName: DatastoreName,
    datastoreStorage: DatastoreStorage = null,
    retentionPeriod: RetentionPeriod = null,
    tags: TagList = null
  ): CreateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    if (datastoreStorage != null) __obj.updateDynamic("datastoreStorage")(datastoreStorage.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatastoreRequest]
  }
}

