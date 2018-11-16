package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ClassField")
@js.native
class ClassField protected () extends AbstractClassPart {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, `type`: Type) = this()
  def this(name: java.lang.String, `type`: Type, modifiers: js.Array[StmtModifier]) = this()
  def this(name: java.lang.String, `type`: scala.Null, modifiers: js.Array[StmtModifier]) = this()
  def this(name: java.lang.String, `type`: Type, modifiers: js.Array[StmtModifier], initializer: Expression) = this()
  def this(name: java.lang.String, `type`: Type, modifiers: scala.Null, initializer: Expression) = this()
  def this(name: java.lang.String, `type`: scala.Null, modifiers: js.Array[StmtModifier], initializer: Expression) = this()
  def this(name: java.lang.String, `type`: scala.Null, modifiers: scala.Null, initializer: Expression) = this()
  var initializer: js.UndefOr[Expression] = js.native
  var name: java.lang.String = js.native
  def isEquivalent(f: ClassField): scala.Boolean = js.native
}

