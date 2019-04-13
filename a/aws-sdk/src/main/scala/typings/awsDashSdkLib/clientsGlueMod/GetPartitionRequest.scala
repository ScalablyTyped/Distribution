package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPartitionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partition in question resides. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database where the partition resides.
    */
  var DatabaseName: NameString
  /**
    * The values that define the partition.
    */
  var PartitionValues: ValueStringList
  /**
    * The name of the partition's table.
    */
  var TableName: NameString
}

object GetPartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionValues: ValueStringList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): GetPartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, PartitionValues = PartitionValues, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[GetPartitionRequest]
  }
}

