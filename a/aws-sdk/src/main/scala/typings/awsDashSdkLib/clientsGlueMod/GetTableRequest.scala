package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  /**
    * The name of the table for which to retrieve the definition. For Hive compatibility, this name is entirely lowercase.
    */
  var Name: NameString
}

object GetTableRequest {
  @scala.inline
  def apply(DatabaseName: NameString, Name: NameString, CatalogId: CatalogIdString = null): GetTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, Name = Name)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[GetTableRequest]
  }
}

