package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.FlowTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TypeAnnotation extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.TypeAnnotation
  var typeAnnotation: FlowTypeKind
}

object TypeAnnotation {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.TypeAnnotation, typeAnnotation: FlowTypeKind): TypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAnnotation]
  }
}

