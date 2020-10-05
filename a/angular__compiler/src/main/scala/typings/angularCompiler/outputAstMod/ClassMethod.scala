package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ClassMethod")
@js.native
class ClassMethod protected () extends AbstractClassPart {
  def this(name: String, params: js.Array[FnParam], body: js.Array[Statement]) = this()
  def this(name: Null, params: js.Array[FnParam], body: js.Array[Statement]) = this()
  def this(name: String, params: js.Array[FnParam], body: js.Array[Statement], `type`: Type) = this()
  def this(name: Null, params: js.Array[FnParam], body: js.Array[Statement], `type`: Type) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: js.UndefOr[scala.Nothing],
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Null,
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Type,
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: Null,
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: js.UndefOr[scala.Nothing],
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: Null,
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Null,
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: Null,
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Type,
    modifiers: js.Array[StmtModifier]
  ) = this()
  var body: js.Array[Statement] = js.native
  var name: String | Null = js.native
  var params: js.Array[FnParam] = js.native
  def isEquivalent(m: ClassMethod): Boolean = js.native
}

