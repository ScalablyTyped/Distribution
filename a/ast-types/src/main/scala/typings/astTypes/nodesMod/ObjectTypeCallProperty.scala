package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.FunctionTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectTypeCallProperty extends ASTNode {
  var static: Boolean
  var `type`: typings.astTypes.astTypesStrings.ObjectTypeCallProperty
  var value: FunctionTypeAnnotationKind
}

object ObjectTypeCallProperty {
  @scala.inline
  def apply(
    static: Boolean,
    `type`: typings.astTypes.astTypesStrings.ObjectTypeCallProperty,
    value: FunctionTypeAnnotationKind
  ): ObjectTypeCallProperty = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeCallProperty]
  }
}

