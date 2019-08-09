package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableWithColumnsResource extends js.Object {
  /**
    * The list of column names for the table. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnNames: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.ColumnNames] = js.undefined
  /**
    * A wildcard specified by a ColumnWildcard object. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnWildcard: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.ColumnWildcard] = js.undefined
  /**
    * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a principal. 
    */
  var DatabaseName: js.UndefOr[NameString] = js.undefined
  /**
    * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. 
    */
  var Name: js.UndefOr[NameString] = js.undefined
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
    if (ColumnNames != null) __obj.updateDynamic("ColumnNames")(ColumnNames)
    if (ColumnWildcard != null) __obj.updateDynamic("ColumnWildcard")(ColumnWildcard)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[TableWithColumnsResource]
  }
}

