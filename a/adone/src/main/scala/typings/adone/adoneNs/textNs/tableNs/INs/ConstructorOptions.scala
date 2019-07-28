package typings.adone.adoneNs.textNs.tableNs.INs

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof adone.adone.text.table.I.CommonOptions ]:? adone.adone.text.table.I.CommonOptions[P]} */ trait ConstructorOptions extends js.Object {
  var chars: js.UndefOr[Partial[CharsOptions]] = js.undefined
  var style: js.UndefOr[Partial[StyleOptions]] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(chars: Partial[CharsOptions] = null, style: Partial[StyleOptions] = null): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

