package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetPartitionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString = js.native
  /**
    * A list of partition values identifying the partitions to retrieve.
    */
  var PartitionsToGet: BatchGetPartitionValueList = js.native
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString = js.native
}

object BatchGetPartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionsToGet: BatchGetPartitionValueList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): BatchGetPartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionsToGet = PartitionsToGet.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetPartitionRequest]
  }
}

