package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait DeclareModule
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.BlockStatementKind
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareModule
}

object DeclareModule {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.DeclareModule
  ): DeclareModule = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModule]
  }
}

