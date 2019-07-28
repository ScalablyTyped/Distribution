package typings.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typings.atAngularCompiler.srcCompilerMod.SelectorContext[T] {
  def this(
    selector: typings.atAngularCompiler.srcSelectorMod.CssSelector,
    cbContext: T,
    listContext: typings.atAngularCompiler.srcSelectorMod.SelectorListContext
  ) = this()
}

