package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Program
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var body: js.Array[astDashTypesLib.genKindsMod.StatementKind]
  var directives: js.Array[astDashTypesLib.genKindsMod.DirectiveKind]
  var interpreter: astDashTypesLib.genKindsMod.InterpreterDirectiveKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.Program
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[astDashTypesLib.genKindsMod.StatementKind],
    directives: js.Array[astDashTypesLib.genKindsMod.DirectiveKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.Program,
    interpreter: astDashTypesLib.genKindsMod.InterpreterDirectiveKind = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body, directives = directives)
    __obj.updateDynamic("type")(`type`)
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter)
    __obj.asInstanceOf[Program]
  }
}

