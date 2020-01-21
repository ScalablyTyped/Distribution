package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typings.angularCompiler.selectorMod.SelectorContext[T] {
  def this(
    selector: typings.angularCompiler.selectorMod.CssSelector,
    cbContext: T,
    listContext: typings.angularCompiler.selectorMod.SelectorListContext
  ) = this()
}

