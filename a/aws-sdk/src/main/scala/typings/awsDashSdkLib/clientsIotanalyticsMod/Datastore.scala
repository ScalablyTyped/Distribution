package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datastore extends js.Object {
  /**
    * The ARN of the data store.
    */
  var arn: js.UndefOr[DatastoreArn] = js.undefined
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the data store.
    */
  var name: js.UndefOr[DatastoreName] = js.undefined
  /**
    * How long, in days, message data is kept for the data store.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  /**
    * The status of a data store:  CREATING  The data store is being created.  ACTIVE  The data store has been created and can be used.  DELETING  The data store is being deleted.  
    */
  var status: js.UndefOr[DatastoreStatus] = js.undefined
  /**
    * Where data store data is stored.
    */
  var storage: js.UndefOr[DatastoreStorage] = js.undefined
}

object Datastore {
  @scala.inline
  def apply(
    arn: DatastoreArn = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    name: DatastoreName = null,
    retentionPeriod: RetentionPeriod = null,
    status: DatastoreStatus = null,
    storage: DatastoreStorage = null
  ): Datastore = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[Datastore]
  }
}

