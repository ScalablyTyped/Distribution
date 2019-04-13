package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePartitionRequest extends js.Object {
  /**
    * The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the metadata database in which the partition is to be created.
    */
  var DatabaseName: NameString
  /**
    * A PartitionInput structure defining the partition to be created.
    */
  var PartitionInput: awsDashSdkLib.clientsGlueMod.PartitionInput
  /**
    * The name of the metadata table in which the partition is to be created.
    */
  var TableName: NameString
}

object CreatePartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionInput: PartitionInput,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): CreatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, PartitionInput = PartitionInput, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[CreatePartitionRequest]
  }
}

