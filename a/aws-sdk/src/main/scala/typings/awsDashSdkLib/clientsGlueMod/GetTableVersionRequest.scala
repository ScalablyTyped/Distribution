package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableVersionRequest extends js.Object {
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
    * The ID value of the table version to be retrieved. A VersionID is a string representation of an integer. Each version is incremented by 1. 
    */
  var VersionId: js.UndefOr[VersionString] = js.undefined
}

object GetTableVersionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    TableName: NameString,
    CatalogId: CatalogIdString = null,
    VersionId: VersionString = null
  ): GetTableVersionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[GetTableVersionRequest]
  }
}

