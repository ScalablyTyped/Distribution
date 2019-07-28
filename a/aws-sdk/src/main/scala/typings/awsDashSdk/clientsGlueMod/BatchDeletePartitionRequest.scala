package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeletePartitionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database in which the table in question resides.
    */
  var DatabaseName: NameString
  /**
    * A list of PartitionInput structures that define the partitions to be deleted.
    */
  var PartitionsToDelete: BatchDeletePartitionValueList
  /**
    * The name of the table where the partitions to be deleted is located.
    */
  var TableName: NameString
}

object BatchDeletePartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionsToDelete: BatchDeletePartitionValueList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): BatchDeletePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, PartitionsToDelete = PartitionsToDelete, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[BatchDeletePartitionRequest]
  }
}

