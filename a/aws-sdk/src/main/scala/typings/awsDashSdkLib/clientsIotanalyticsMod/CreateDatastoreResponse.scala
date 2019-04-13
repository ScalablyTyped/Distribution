package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatastoreResponse extends js.Object {
  /**
    * The ARN of the data store.
    */
  var datastoreArn: js.UndefOr[DatastoreArn] = js.undefined
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.undefined
  /**
    * How long, in days, message data is kept for the data store.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}

object CreateDatastoreResponse {
  @scala.inline
  def apply(
    datastoreArn: DatastoreArn = null,
    datastoreName: DatastoreName = null,
    retentionPeriod: RetentionPeriod = null
  ): CreateDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    if (datastoreArn != null) __obj.updateDynamic("datastoreArn")(datastoreArn)
    if (datastoreName != null) __obj.updateDynamic("datastoreName")(datastoreName)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    __obj.asInstanceOf[CreateDatastoreResponse]
  }
}

