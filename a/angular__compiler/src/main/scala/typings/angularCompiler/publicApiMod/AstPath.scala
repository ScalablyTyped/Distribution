package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "AstPath")
@js.native
class AstPath[T] protected ()
  extends typings.angularCompiler.srcCompilerMod.AstPath[T] {
  def this(path: js.Array[T]) = this()
  def this(path: js.Array[T], position: Double) = this()
}

