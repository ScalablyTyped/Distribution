package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetConfiguration extends js.Object {
  /**
    * A structure containing the list of column group schemas.
    */
  var ColumnGroupSchemaList: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.ColumnGroupSchemaList] = js.native
  /**
    * Dataset schema.
    */
  var DataSetSchema: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.DataSetSchema] = js.native
  /**
    * Placeholder.
    */
  var Placeholder: js.UndefOr[String] = js.native
}

object DataSetConfiguration {
  @scala.inline
  def apply(
    ColumnGroupSchemaList: ColumnGroupSchemaList = null,
    DataSetSchema: DataSetSchema = null,
    Placeholder: String = null
  ): DataSetConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ColumnGroupSchemaList != null) __obj.updateDynamic("ColumnGroupSchemaList")(ColumnGroupSchemaList.asInstanceOf[js.Any])
    if (DataSetSchema != null) __obj.updateDynamic("DataSetSchema")(DataSetSchema.asInstanceOf[js.Any])
    if (Placeholder != null) __obj.updateDynamic("Placeholder")(Placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetConfiguration]
  }
}

