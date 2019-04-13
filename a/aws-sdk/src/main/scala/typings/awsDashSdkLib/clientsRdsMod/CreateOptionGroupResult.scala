package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptionGroupResult extends js.Object {
  var OptionGroup: js.UndefOr[OptionGroup] = js.undefined
}

object CreateOptionGroupResult {
  @scala.inline
  def apply(OptionGroup: OptionGroup = null): CreateOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    if (OptionGroup != null) __obj.updateDynamic("OptionGroup")(OptionGroup)
    __obj.asInstanceOf[CreateOptionGroupResult]
  }
}

