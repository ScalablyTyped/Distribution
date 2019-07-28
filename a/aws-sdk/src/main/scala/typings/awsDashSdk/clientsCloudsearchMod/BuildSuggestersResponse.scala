package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildSuggestersResponse extends js.Object {
  var FieldNames: js.UndefOr[FieldNameList] = js.undefined
}

object BuildSuggestersResponse {
  @scala.inline
  def apply(FieldNames: FieldNameList = null): BuildSuggestersResponse = {
    val __obj = js.Dynamic.literal()
    if (FieldNames != null) __obj.updateDynamic("FieldNames")(FieldNames)
    __obj.asInstanceOf[BuildSuggestersResponse]
  }
}

