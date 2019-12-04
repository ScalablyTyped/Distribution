package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSArrayType extends ASTNode {
  var elementType: TSTypeKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSArrayType
}

object TSArrayType {
  @scala.inline
  def apply(elementType: TSTypeKind, `type`: typings.astDashTypes.astDashTypesStrings.TSArrayType): TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSArrayType]
  }
}

