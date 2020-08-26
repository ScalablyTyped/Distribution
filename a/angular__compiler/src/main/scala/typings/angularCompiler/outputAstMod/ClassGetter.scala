package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ClassGetter")
@js.native
class ClassGetter protected () extends AbstractClassPart {
  def this(name: String, body: js.Array[Statement]) = this()
  def this(name: String, body: js.Array[Statement], `type`: Type) = this()
  def this(
    name: String,
    body: js.Array[Statement],
    `type`: js.UndefOr[scala.Nothing],
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(name: String, body: js.Array[Statement], `type`: Null, modifiers: js.Array[StmtModifier]) = this()
  def this(name: String, body: js.Array[Statement], `type`: Type, modifiers: js.Array[StmtModifier]) = this()
  var body: js.Array[Statement] = js.native
  var name: String = js.native
  def isEquivalent(m: ClassGetter): Boolean = js.native
}

