package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database in which the tables to delete reside. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  /**
    * A list of the table to delete.
    */
  var TablesToDelete: BatchDeleteTableNameList
}

object BatchDeleteTableRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    TablesToDelete: BatchDeleteTableNameList,
    CatalogId: CatalogIdString = null
  ): BatchDeleteTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, TablesToDelete = TablesToDelete)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[BatchDeleteTableRequest]
  }
}

