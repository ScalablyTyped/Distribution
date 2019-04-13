package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetPartitionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString
  /**
    * A list of partition values identifying the partitions to retrieve.
    */
  var PartitionsToGet: BatchGetPartitionValueList
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString
}

object BatchGetPartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionsToGet: BatchGetPartitionValueList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): BatchGetPartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, PartitionsToGet = PartitionsToGet, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[BatchGetPartitionRequest]
  }
}

