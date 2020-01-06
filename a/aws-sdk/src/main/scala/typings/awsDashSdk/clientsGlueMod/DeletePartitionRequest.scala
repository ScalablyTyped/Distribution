package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePartitionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partition to be deleted resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database in which the table in question resides.
    */
  var DatabaseName: NameString = js.native
  /**
    * The values that define the partition.
    */
  var PartitionValues: ValueStringList = js.native
  /**
    * The name of the table that contains the partition to be deleted.
    */
  var TableName: NameString = js.native
}

object DeletePartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionValues: ValueStringList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): DeletePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionValues = PartitionValues.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePartitionRequest]
  }
}

