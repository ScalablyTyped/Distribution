package typings.antd

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAffix extends js.Object {
  var affix: Boolean
  var getContainer: js.Function0[
    Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)
  ]
  var showInkInFixed: Boolean
}

object AnonAffix {
  @scala.inline
  def apply(
    affix: Boolean,
    getContainer: () => Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any),
    showInkInFixed: Boolean
  ): AnonAffix = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = js.Any.fromFunction0(getContainer), showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAffix]
  }
}

