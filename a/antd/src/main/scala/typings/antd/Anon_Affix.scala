package typings.antd

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Affix extends js.Object {
  var affix: Boolean
  var getContainer: js.Function0[
    Window with (/* import warning: ImportType.apply Failed type conversion: typeof globalThis */ js.Any)
  ]
  var showInkInFixed: Boolean
}

object Anon_Affix {
  @scala.inline
  def apply(
    affix: Boolean,
    getContainer: () => Window with (/* import warning: ImportType.apply Failed type conversion: typeof globalThis */ js.Any),
    showInkInFixed: Boolean
  ): Anon_Affix = {
    val __obj = js.Dynamic.literal(affix = affix, getContainer = js.Any.fromFunction0(getContainer), showInkInFixed = showInkInFixed)
  
    __obj.asInstanceOf[Anon_Affix]
  }
}

