package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableToReload extends js.Object {
  /**
    * The schema name of the table to be reloaded.
    */
  var SchemaName: js.UndefOr[String] = js.undefined
  /**
    * The table name of the table to be reloaded.
    */
  var TableName: js.UndefOr[String] = js.undefined
}

object TableToReload {
  @scala.inline
  def apply(SchemaName: String = null, TableName: String = null): TableToReload = {
    val __obj = js.Dynamic.literal()
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    __obj.asInstanceOf[TableToReload]
  }
}

