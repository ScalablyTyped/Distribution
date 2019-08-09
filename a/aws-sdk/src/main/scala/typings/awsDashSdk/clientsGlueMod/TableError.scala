package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableError extends js.Object {
  /**
    * The details about the error.
    */
  var ErrorDetail: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ErrorDetail] = js.undefined
  /**
    * The name of the table. For Hive compatibility, this must be entirely lowercase.
    */
  var TableName: js.UndefOr[NameString] = js.undefined
}

object TableError {
  @scala.inline
  def apply(ErrorDetail: ErrorDetail = null, TableName: NameString = null): TableError = {
    val __obj = js.Dynamic.literal()
    if (ErrorDetail != null) __obj.updateDynamic("ErrorDetail")(ErrorDetail)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    __obj.asInstanceOf[TableError]
  }
}

