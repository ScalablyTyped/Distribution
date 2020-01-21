package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Function, 'type' | 'id'> ]: ast-types.ast-types/gen/nodes.Function[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait FunctionDeclaration extends ASTNode {
  var id: IdentifierKind
  var `type`: typings.astTypes.astTypesStrings.FunctionDeclaration
}

object FunctionDeclaration {
  @scala.inline
  def apply(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.FunctionDeclaration): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

