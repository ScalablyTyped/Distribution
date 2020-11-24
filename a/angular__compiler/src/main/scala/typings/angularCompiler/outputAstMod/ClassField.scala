package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ClassField")
@js.native
class ClassField protected () extends AbstractClassPart {
  def this(name: String) = this()
  def this(name: String, `type`: Type) = this()
  def this(name: String, `type`: js.UndefOr[scala.Nothing], modifiers: js.Array[StmtModifier]) = this()
  def this(name: String, `type`: Null, modifiers: js.Array[StmtModifier]) = this()
  def this(name: String, `type`: Type, modifiers: js.Array[StmtModifier]) = this()
  def this(
    name: String,
    `type`: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    initializer: Expression
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[scala.Nothing],
    modifiers: js.Array[StmtModifier],
    initializer: Expression
  ) = this()
  def this(name: String, `type`: Null, modifiers: js.UndefOr[scala.Nothing], initializer: Expression) = this()
  def this(name: String, `type`: Null, modifiers: js.Array[StmtModifier], initializer: Expression) = this()
  def this(name: String, `type`: Type, modifiers: js.UndefOr[scala.Nothing], initializer: Expression) = this()
  def this(name: String, `type`: Type, modifiers: js.Array[StmtModifier], initializer: Expression) = this()
  
  var initializer: js.UndefOr[Expression] = js.native
  
  def isEquivalent(f: ClassField): Boolean = js.native
  
  var name: String = js.native
}
