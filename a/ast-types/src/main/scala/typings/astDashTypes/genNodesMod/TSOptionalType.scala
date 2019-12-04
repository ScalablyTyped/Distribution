package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSOptionalType extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.TSOptionalType
  var typeAnnotation: TSTypeKind
}

object TSOptionalType {
  @scala.inline
  def apply(`type`: typings.astDashTypes.astDashTypesStrings.TSOptionalType, typeAnnotation: TSTypeKind): TSOptionalType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSOptionalType]
  }
}

