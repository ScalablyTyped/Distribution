package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaColumn extends js.Object {
  /**
    * The type of data in the column.
    */
  var DataType: js.UndefOr[ColumnTypeString] = js.undefined
  /**
    * The name of the column.
    */
  var Name: js.UndefOr[ColumnNameString] = js.undefined
}

object SchemaColumn {
  @scala.inline
  def apply(DataType: ColumnTypeString = null, Name: ColumnNameString = null): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    if (DataType != null) __obj.updateDynamic("DataType")(DataType)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[SchemaColumn]
  }
}

