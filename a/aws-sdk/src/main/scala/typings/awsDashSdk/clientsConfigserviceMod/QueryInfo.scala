package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  /**
    * Returns a FieldInfo object.
    */
  var SelectFields: js.UndefOr[FieldInfoList] = js.undefined
}

object QueryInfo {
  @scala.inline
  def apply(SelectFields: FieldInfoList = null): QueryInfo = {
    val __obj = js.Dynamic.literal()
    if (SelectFields != null) __obj.updateDynamic("SelectFields")(SelectFields)
    __obj.asInstanceOf[QueryInfo]
  }
}

