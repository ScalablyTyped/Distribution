package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableVersionError extends js.Object {
  /**
    * Detail about the error.
    */
  var ErrorDetail: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ErrorDetail] = js.undefined
  /**
    * The name of the table in question.
    */
  var TableName: js.UndefOr[NameString] = js.undefined
  /**
    * The ID value of the version in question. A VersionID is a string representation of an integer. Each version is incremented by 1.
    */
  var VersionId: js.UndefOr[VersionString] = js.undefined
}

object TableVersionError {
  @scala.inline
  def apply(ErrorDetail: ErrorDetail = null, TableName: NameString = null, VersionId: VersionString = null): TableVersionError = {
    val __obj = js.Dynamic.literal()
    if (ErrorDetail != null) __obj.updateDynamic("ErrorDetail")(ErrorDetail)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[TableVersionError]
  }
}

