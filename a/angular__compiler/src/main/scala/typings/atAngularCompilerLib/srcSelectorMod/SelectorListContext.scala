package typings
package atAngularCompilerLib.srcSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/selector", "SelectorListContext")
@js.native
class SelectorListContext protected () extends js.Object {
  def this(selectors: js.Array[CssSelector]) = this()
  var alreadyMatched: scala.Boolean = js.native
  var selectors: js.Array[CssSelector] = js.native
}

