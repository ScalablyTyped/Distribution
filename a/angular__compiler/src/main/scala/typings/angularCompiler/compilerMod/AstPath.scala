package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "AstPath")
@js.native
class AstPath[T] protected ()
  extends typings.angularCompiler.publicApiMod.AstPath[T] {
  def this(path: js.Array[T]) = this()
  def this(path: js.Array[T], position: Double) = this()
}
