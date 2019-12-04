package typings.antd

import typings.antd.libDateDashPickerInterfaceMod.RangePickerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpenValue extends js.Object {
  var open: js.UndefOr[Boolean] = js.undefined
  var value: RangePickerValue
}

object Anon_OpenValue {
  @scala.inline
  def apply(value: RangePickerValue, open: js.UndefOr[Boolean] = js.undefined): Anon_OpenValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OpenValue]
  }
}

