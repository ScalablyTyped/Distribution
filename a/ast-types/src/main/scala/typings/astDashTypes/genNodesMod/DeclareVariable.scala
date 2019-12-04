package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait DeclareVariable extends ASTNode {
  var id: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.DeclareVariable
}

object DeclareVariable {
  @scala.inline
  def apply(id: IdentifierKind, `type`: typings.astDashTypes.astDashTypesStrings.DeclareVariable): DeclareVariable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareVariable]
  }
}

