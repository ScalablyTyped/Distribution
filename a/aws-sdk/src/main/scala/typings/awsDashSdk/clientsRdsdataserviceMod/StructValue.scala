package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructValue extends js.Object {
  /**
    * The attributes returned in the record.
    */
  var attributes: js.UndefOr[ArrayValueList] = js.undefined
}

object StructValue {
  @scala.inline
  def apply(attributes: ArrayValueList = null): StructValue = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[StructValue]
  }
}

