package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlueTable extends js.Object {
  /**
    * A unique identifier for the AWS Glue Data Catalog.
    */
  var CatalogId: js.UndefOr[NameString] = js.undefined
  /**
    * The name of the connection to the AWS Glue Data Catalog.
    */
  var ConnectionName: js.UndefOr[NameString] = js.undefined
  /**
    * A database name in the AWS Glue Data Catalog.
    */
  var DatabaseName: NameString
  /**
    * A table name in the AWS Glue Data Catalog.
    */
  var TableName: NameString
}

object GlueTable {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    TableName: NameString,
    CatalogId: NameString = null,
    ConnectionName: NameString = null
  ): GlueTable = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (ConnectionName != null) __obj.updateDynamic("ConnectionName")(ConnectionName)
    __obj.asInstanceOf[GlueTable]
  }
}

