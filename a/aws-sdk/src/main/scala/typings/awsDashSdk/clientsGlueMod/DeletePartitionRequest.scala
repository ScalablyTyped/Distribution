package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePartitionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partition to be deleted resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database in which the table in question resides.
    */
  var DatabaseName: NameString
  /**
    * The values that define the partition.
    */
  var PartitionValues: ValueStringList
  /**
    * The name of the table that contains the partition to be deleted.
    */
  var TableName: NameString
}

object DeletePartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionValues: ValueStringList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): DeletePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, PartitionValues = PartitionValues, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[DeletePartitionRequest]
  }
}

