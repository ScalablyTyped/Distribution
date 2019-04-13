package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptionGroupResult extends js.Object {
  var OptionGroup: js.UndefOr[OptionGroup] = js.undefined
}

object CopyOptionGroupResult {
  @scala.inline
  def apply(OptionGroup: OptionGroup = null): CopyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    if (OptionGroup != null) __obj.updateDynamic("OptionGroup")(OptionGroup)
    __obj.asInstanceOf[CopyOptionGroupResult]
  }
}

