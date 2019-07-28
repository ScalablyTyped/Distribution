package typings.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.SelectorContext[T] {
  def this(
    selector: typings.atAngularCompiler.srcSelectorMod.CssSelector,
    cbContext: T,
    listContext: typings.atAngularCompiler.srcSelectorMod.SelectorListContext
  ) = this()
}

