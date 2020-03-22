package typings.antd.selectMod

import typings.antd.antdStrings.multiple
import typings.antd.antdStrings.tags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/select.InternalSelectProps<VT>, 'inputIcon' | 'mode' | 'getInputElement' | 'backfill'> ]: antd.antd/lib/select.InternalSelectProps<VT>[P]} */ trait SelectProps[VT] extends js.Object {
  var mode: js.UndefOr[multiple | tags] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply[VT](mode: multiple | tags = null): SelectProps[VT] = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps[VT]]
  }
}

