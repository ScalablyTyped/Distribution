package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "Type")
@js.native
abstract class Type () extends js.Object {
  def this(modifiers: js.Array[TypeModifier]) = this()
  var modifiers: js.Array[TypeModifier] | scala.Null = js.native
  def hasModifier(modifier: TypeModifier): scala.Boolean = js.native
  def visitType(visitor: TypeVisitor, context: js.Any): js.Any = js.native
}

