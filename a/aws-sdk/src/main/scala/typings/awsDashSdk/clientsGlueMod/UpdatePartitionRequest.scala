package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePartitionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partition to be updated resides. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database in which the table in question resides.
    */
  var DatabaseName: NameString
  /**
    * The new partition object to which to update the partition.
    */
  var PartitionInput: typings.awsDashSdk.clientsGlueMod.PartitionInput
  /**
    * A list of the values defining the partition.
    */
  var PartitionValueList: BoundedPartitionValueList
  /**
    * The name of the table where the partition to be updated is located.
    */
  var TableName: NameString
}

object UpdatePartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionInput: PartitionInput,
    PartitionValueList: BoundedPartitionValueList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): UpdatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, PartitionInput = PartitionInput, PartitionValueList = PartitionValueList, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[UpdatePartitionRequest]
  }
}

