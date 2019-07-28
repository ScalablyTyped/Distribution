package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "Type")
@js.native
abstract class Type () extends js.Object {
  def this(modifiers: js.Array[TypeModifier]) = this()
  var modifiers: js.Array[TypeModifier] | Null = js.native
  def hasModifier(modifier: TypeModifier): Boolean = js.native
  def visitType(visitor: TypeVisitor, context: js.Any): js.Any = js.native
}

