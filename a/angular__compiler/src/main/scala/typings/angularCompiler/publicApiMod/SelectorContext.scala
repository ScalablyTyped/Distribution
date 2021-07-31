package typings.angularCompiler.publicApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typings.angularCompiler.srcCompilerMod.SelectorContext[T] {
  def this(
    selector: typings.angularCompiler.selectorMod.CssSelector,
    cbContext: T,
    listContext: typings.angularCompiler.selectorMod.SelectorListContext
  ) = this()
}
