package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartitionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partition in question resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database where the partition resides.
    */
  var DatabaseName: NameString = js.native
  /**
    * The values that define the partition.
    */
  var PartitionValues: ValueStringList = js.native
  /**
    * The name of the partition's table.
    */
  var TableName: NameString = js.native
}

object GetPartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionValues: ValueStringList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): GetPartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionValues = PartitionValues.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartitionRequest]
  }
}

