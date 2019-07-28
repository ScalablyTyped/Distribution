package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteTableVersionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  /**
    * The name of the table. For Hive compatibility, this name is entirely lowercase.
    */
  var TableName: NameString
  /**
    * A list of the IDs of versions to be deleted. A VersionId is a string representation of an integer. Each version is incremented by 1.
    */
  var VersionIds: BatchDeleteTableVersionList
}

object BatchDeleteTableVersionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    TableName: NameString,
    VersionIds: BatchDeleteTableVersionList,
    CatalogId: CatalogIdString = null
  ): BatchDeleteTableVersionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, TableName = TableName, VersionIds = VersionIds)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[BatchDeleteTableVersionRequest]
  }
}

