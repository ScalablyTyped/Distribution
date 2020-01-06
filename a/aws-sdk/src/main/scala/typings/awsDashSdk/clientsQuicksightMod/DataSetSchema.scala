package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetSchema extends js.Object {
  /**
    * A structure containing the list of column schemas.
    */
  var ColumnSchemaList: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.ColumnSchemaList] = js.native
}

object DataSetSchema {
  @scala.inline
  def apply(ColumnSchemaList: ColumnSchemaList = null): DataSetSchema = {
    val __obj = js.Dynamic.literal()
    if (ColumnSchemaList != null) __obj.updateDynamic("ColumnSchemaList")(ColumnSchemaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetSchema]
  }
}

