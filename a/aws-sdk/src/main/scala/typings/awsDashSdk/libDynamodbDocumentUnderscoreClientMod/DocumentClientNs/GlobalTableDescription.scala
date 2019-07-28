package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableDescription extends js.Object {
  /**
    * The creation time of the global table.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The unique identifier of the global table.
    */
  var GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.undefined
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.undefined
  /**
    * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
    */
  var GlobalTableStatus: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableStatus
  ] = js.undefined
  /**
    * The regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.undefined
}

object GlobalTableDescription {
  @scala.inline
  def apply(
    CreationDateTime: _Date = null,
    GlobalTableArn: GlobalTableArnString = null,
    GlobalTableName: TableName = null,
    GlobalTableStatus: GlobalTableStatus = null,
    ReplicationGroup: ReplicaDescriptionList = null
  ): GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (GlobalTableArn != null) __obj.updateDynamic("GlobalTableArn")(GlobalTableArn)
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName)
    if (GlobalTableStatus != null) __obj.updateDynamic("GlobalTableStatus")(GlobalTableStatus.asInstanceOf[js.Any])
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup)
    __obj.asInstanceOf[GlobalTableDescription]
  }
}

