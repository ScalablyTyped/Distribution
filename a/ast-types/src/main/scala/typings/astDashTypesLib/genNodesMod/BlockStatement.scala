package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait BlockStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: js.Array[astDashTypesLib.genKindsMod.StatementKind]
  var directives: js.Array[astDashTypesLib.genKindsMod.DirectiveKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.BlockStatement
}

object BlockStatement {
  @scala.inline
  def apply(
    body: js.Array[astDashTypesLib.genKindsMod.StatementKind],
    directives: js.Array[astDashTypesLib.genKindsMod.DirectiveKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.BlockStatement
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("directives")(directives)
    __obj.asInstanceOf[BlockStatement]
  }
}

