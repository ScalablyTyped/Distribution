package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.TypeParameterKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TypeParameterDeclaration extends ASTNode {
  var params: js.Array[TypeParameterKind]
  var `type`: typings.astTypes.astTypesStrings.TypeParameterDeclaration
}

object TypeParameterDeclaration {
  @scala.inline
  def apply(
    params: js.Array[TypeParameterKind],
    `type`: typings.astTypes.astTypesStrings.TypeParameterDeclaration
  ): TypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterDeclaration]
  }
}

