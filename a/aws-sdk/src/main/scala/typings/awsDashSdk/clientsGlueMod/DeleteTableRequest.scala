package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  /**
    * The name of the table to be deleted. For Hive compatibility, this name is entirely lowercase.
    */
  var Name: NameString
}

object DeleteTableRequest {
  @scala.inline
  def apply(DatabaseName: NameString, Name: NameString, CatalogId: CatalogIdString = null): DeleteTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, Name = Name)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[DeleteTableRequest]
  }
}

