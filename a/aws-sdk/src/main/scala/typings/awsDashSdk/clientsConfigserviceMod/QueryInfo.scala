package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryInfo extends js.Object {
  /**
    * Returns a FieldInfo object.
    */
  var SelectFields: js.UndefOr[FieldInfoList] = js.native
}

object QueryInfo {
  @scala.inline
  def apply(SelectFields: FieldInfoList = null): QueryInfo = {
    val __obj = js.Dynamic.literal()
    if (SelectFields != null) __obj.updateDynamic("SelectFields")(SelectFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
}

