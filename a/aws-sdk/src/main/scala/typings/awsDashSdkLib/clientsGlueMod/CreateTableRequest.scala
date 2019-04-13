package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the Table. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The catalog database in which to create the new table. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  /**
    * The TableInput object that defines the metadata table to create in the catalog.
    */
  var TableInput: awsDashSdkLib.clientsGlueMod.TableInput
}

object CreateTableRequest {
  @scala.inline
  def apply(DatabaseName: NameString, TableInput: TableInput, CatalogId: CatalogIdString = null): CreateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, TableInput = TableInput)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[CreateTableRequest]
  }
}

