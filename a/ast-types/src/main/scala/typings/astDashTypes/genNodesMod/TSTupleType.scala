package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSTupleType extends ASTNode {
  var elementTypes: js.Array[TSTypeKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTupleType
}

object TSTupleType {
  @scala.inline
  def apply(elementTypes: js.Array[TSTypeKind], `type`: typings.astDashTypes.astDashTypesStrings.TSTupleType): TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTupleType]
  }
}

