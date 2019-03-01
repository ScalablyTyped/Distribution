package typings
package adoneLib.adoneNs.textNs.tableNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof adone.adone.text.table.I.CommonOptions ]:? adone.adone.text.table.I.CommonOptions[P]} */ trait ConstructorOptions extends js.Object {
  var chars: js.UndefOr[stdLib.Partial[CharsOptions]] = js.undefined
  var style: js.UndefOr[stdLib.Partial[StyleOptions]] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(chars: stdLib.Partial[CharsOptions] = null, style: stdLib.Partial[StyleOptions] = null): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

