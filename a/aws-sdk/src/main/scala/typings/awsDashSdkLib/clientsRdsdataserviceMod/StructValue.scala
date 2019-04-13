package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructValue extends js.Object {
  /**
    * Struct or UDT
    */
  var attributes: js.UndefOr[ArrayValues] = js.undefined
}

object StructValue {
  @scala.inline
  def apply(attributes: ArrayValues = null): StructValue = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[StructValue]
  }
}

