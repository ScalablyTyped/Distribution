package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "AbstractClassPart")
@js.native
class AbstractClassPart () extends js.Object {
  def this(`type`: js.UndefOr[Type]) = this()
  def this(`type`: js.UndefOr[Null | Type], modifiers: js.Array[StmtModifier]) = this()
  var modifiers: js.Array[StmtModifier] | Null = js.native
  var `type`: Type | Null = js.native
  def hasModifier(modifier: StmtModifier): Boolean = js.native
}

