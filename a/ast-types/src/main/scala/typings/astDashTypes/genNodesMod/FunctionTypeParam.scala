package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait FunctionTypeParam extends ASTNode {
  var name: IdentifierKind
  var optional: Boolean
  var `type`: typings.astDashTypes.astDashTypesStrings.FunctionTypeParam
  var typeAnnotation: FlowTypeKind
}

object FunctionTypeParam {
  @scala.inline
  def apply(
    name: IdentifierKind,
    optional: Boolean,
    `type`: typings.astDashTypes.astDashTypesStrings.FunctionTypeParam,
    typeAnnotation: FlowTypeKind
  ): FunctionTypeParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeParam]
  }
}

