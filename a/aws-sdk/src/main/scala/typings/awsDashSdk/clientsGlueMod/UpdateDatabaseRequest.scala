package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDatabaseRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the metadata database resides. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * A DatabaseInput object specifying the new definition of the metadata database in the catalog.
    */
  var DatabaseInput: typings.awsDashSdk.clientsGlueMod.DatabaseInput
  /**
    * The name of the database to update in the catalog. For Hive compatibility, this is folded to lowercase.
    */
  var Name: NameString
}

object UpdateDatabaseRequest {
  @scala.inline
  def apply(DatabaseInput: DatabaseInput, Name: NameString, CatalogId: CatalogIdString = null): UpdateDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseInput = DatabaseInput, Name = Name)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[UpdateDatabaseRequest]
  }
}

