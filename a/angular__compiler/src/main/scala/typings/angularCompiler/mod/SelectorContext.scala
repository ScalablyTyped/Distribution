package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typings.angularCompiler.compilerMod.SelectorContext[T] {
  def this(
    selector: typings.angularCompiler.selectorMod.CssSelector,
    cbContext: T,
    listContext: typings.angularCompiler.selectorMod.SelectorListContext
  ) = this()
}

