package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreatePartitionRequest extends js.Object {
  /**
    * The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the metadata database in which the partition is to be created.
    */
  var DatabaseName: NameString
  /**
    * A list of PartitionInput structures that define the partitions to be created.
    */
  var PartitionInputList: awsDashSdkLib.clientsGlueMod.PartitionInputList
  /**
    * The name of the metadata table in which the partition is to be created.
    */
  var TableName: NameString
}

object BatchCreatePartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionInputList: PartitionInputList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): BatchCreatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, PartitionInputList = PartitionInputList, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[BatchCreatePartitionRequest]
  }
}

