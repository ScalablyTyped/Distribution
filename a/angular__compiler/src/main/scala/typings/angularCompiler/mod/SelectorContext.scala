package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typings.angularCompiler.publicApiMod.SelectorContext[T] {
  def this(
    selector: typings.angularCompiler.selectorMod.CssSelector,
    cbContext: T,
    listContext: typings.angularCompiler.selectorMod.SelectorListContext
  ) = this()
}

