package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableAutoScalingDescription extends js.Object {
  /**
    * Represents replicas of the global table.
    */
  var Replicas: js.UndefOr[ReplicaAutoScalingDescriptionList] = js.native
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableName
  ] = js.native
  /**
    * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
    */
  var TableStatus: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableStatus
  ] = js.native
}

object TableAutoScalingDescription {
  @scala.inline
  def apply(
    Replicas: ReplicaAutoScalingDescriptionList = null,
    TableName: TableName = null,
    TableStatus: TableStatus = null
  ): TableAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    if (Replicas != null) __obj.updateDynamic("Replicas")(Replicas.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    if (TableStatus != null) __obj.updateDynamic("TableStatus")(TableStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableAutoScalingDescription]
  }
}

