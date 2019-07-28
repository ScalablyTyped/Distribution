package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexDocumentsResponse extends js.Object {
  /**
    * The names of the fields that are currently being indexed.
    */
  var FieldNames: js.UndefOr[FieldNameList] = js.undefined
}

object IndexDocumentsResponse {
  @scala.inline
  def apply(FieldNames: FieldNameList = null): IndexDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (FieldNames != null) __obj.updateDynamic("FieldNames")(FieldNames)
    __obj.asInstanceOf[IndexDocumentsResponse]
  }
}

