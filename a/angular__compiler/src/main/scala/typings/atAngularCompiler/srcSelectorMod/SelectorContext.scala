package typings.atAngularCompiler.srcSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/selector", "SelectorContext")
@js.native
class SelectorContext[T] protected () extends js.Object {
  def this(selector: CssSelector, cbContext: T, listContext: SelectorListContext) = this()
  var cbContext: T = js.native
  var listContext: SelectorListContext = js.native
  var notSelectors: js.Array[CssSelector] = js.native
  var selector: CssSelector = js.native
  def finalize(cssSelector: CssSelector): Boolean = js.native
  def finalize(cssSelector: CssSelector, callback: js.Function2[/* c */ CssSelector, /* a */ T, Unit]): Boolean = js.native
}

