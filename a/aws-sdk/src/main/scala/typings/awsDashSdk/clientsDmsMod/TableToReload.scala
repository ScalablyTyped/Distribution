package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableToReload extends js.Object {
  /**
    * The schema name of the table to be reloaded.
    */
  var SchemaName: js.UndefOr[String] = js.native
  /**
    * The table name of the table to be reloaded.
    */
  var TableName: js.UndefOr[String] = js.native
}

object TableToReload {
  @scala.inline
  def apply(SchemaName: String = null, TableName: String = null): TableToReload = {
    val __obj = js.Dynamic.literal()
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToReload]
  }
}

