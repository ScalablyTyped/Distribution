package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyOptionGroupResult extends js.Object {
  var OptionGroup: js.UndefOr[typings.awsDashSdk.clientsRdsMod.OptionGroup] = js.undefined
}

object ModifyOptionGroupResult {
  @scala.inline
  def apply(OptionGroup: OptionGroup = null): ModifyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    if (OptionGroup != null) __obj.updateDynamic("OptionGroup")(OptionGroup)
    __obj.asInstanceOf[ModifyOptionGroupResult]
  }
}

