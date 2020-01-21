package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.TSTypeParameterKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSTypeParameterDeclaration extends ASTNode {
  var params: js.Array[TSTypeParameterKind]
  var `type`: typings.astTypes.astTypesStrings.TSTypeParameterDeclaration
}

object TSTypeParameterDeclaration {
  @scala.inline
  def apply(
    params: js.Array[TSTypeParameterKind],
    `type`: typings.astTypes.astTypesStrings.TSTypeParameterDeclaration
  ): TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterDeclaration]
  }
}

