package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var Catalog: js.UndefOr[CatalogResource] = js.undefined
  /**
    * The location of an Amazon S3 path where permissions are granted or revoked. 
    */
  var DataLocation: js.UndefOr[DataLocationResource] = js.undefined
  /**
    * The database for the resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database permissions to a principal. 
    */
  var Database: js.UndefOr[DatabaseResource] = js.undefined
  /**
    * The table for the resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. 
    */
  var Table: js.UndefOr[TableResource] = js.undefined
  /**
    * The table with columns for the resource. A principal with permissions to this resource can select metadata from the columns of a table in the Data Catalog and the underlying data in Amazon S3.
    */
  var TableWithColumns: js.UndefOr[TableWithColumnsResource] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    Catalog: CatalogResource = null,
    DataLocation: DataLocationResource = null,
    Database: DatabaseResource = null,
    Table: TableResource = null,
    TableWithColumns: TableWithColumnsResource = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (Catalog != null) __obj.updateDynamic("Catalog")(Catalog)
    if (DataLocation != null) __obj.updateDynamic("DataLocation")(DataLocation)
    if (Database != null) __obj.updateDynamic("Database")(Database)
    if (Table != null) __obj.updateDynamic("Table")(Table)
    if (TableWithColumns != null) __obj.updateDynamic("TableWithColumns")(TableWithColumns)
    __obj.asInstanceOf[Resource]
  }
}

