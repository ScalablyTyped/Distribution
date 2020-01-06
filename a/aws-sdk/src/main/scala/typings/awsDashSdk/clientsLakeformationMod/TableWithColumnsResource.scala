package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableWithColumnsResource extends js.Object {
  /**
    * The list of column names for the table. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnNames: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.ColumnNames] = js.native
  /**
    * A wildcard specified by a ColumnWildcard object. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnWildcard: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.ColumnWildcard] = js.native
  /**
    * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a principal. 
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  /**
    * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. 
    */
  var Name: js.UndefOr[NameString] = js.native
}

object TableWithColumnsResource {
  @scala.inline
  def apply(
    ColumnNames: ColumnNames = null,
    ColumnWildcard: ColumnWildcard = null,
    DatabaseName: NameString = null,
    Name: NameString = null
  ): TableWithColumnsResource = {
    val __obj = js.Dynamic.literal()
    if (ColumnNames != null) __obj.updateDynamic("ColumnNames")(ColumnNames.asInstanceOf[js.Any])
    if (ColumnWildcard != null) __obj.updateDynamic("ColumnWildcard")(ColumnWildcard.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableWithColumnsResource]
  }
}

