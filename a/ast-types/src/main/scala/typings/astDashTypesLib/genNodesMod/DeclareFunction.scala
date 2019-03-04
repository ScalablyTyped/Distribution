package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait DeclareFunction
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareFunction
}

object DeclareFunction {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.DeclareFunction
  ): DeclareFunction = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeclareFunction]
  }
}

