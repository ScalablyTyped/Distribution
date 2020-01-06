package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDatastoreRequest extends js.Object {
  /**
    * The name of the data store to be updated.
    */
  var datastoreName: DatastoreName = js.native
  /**
    * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.native
  /**
    * How long, in days, message data is kept for the data store. The retention period cannot be updated if the data store's S3 storage is customer-managed.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object UpdateDatastoreRequest {
  @scala.inline
  def apply(
    datastoreName: DatastoreName,
    datastoreStorage: DatastoreStorage = null,
    retentionPeriod: RetentionPeriod = null
  ): UpdateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    if (datastoreStorage != null) __obj.updateDynamic("datastoreStorage")(datastoreStorage.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatastoreRequest]
  }
}

