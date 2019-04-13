package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatabaseRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the Database to delete. For Hive compatibility, this must be all lowercase.
    */
  var Name: NameString
}

object DeleteDatabaseRequest {
  @scala.inline
  def apply(Name: NameString, CatalogId: CatalogIdString = null): DeleteDatabaseRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[DeleteDatabaseRequest]
  }
}

