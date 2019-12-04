package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSRestType extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.TSRestType
  var typeAnnotation: TSTypeKind
}

object TSRestType {
  @scala.inline
  def apply(`type`: typings.astDashTypes.astDashTypesStrings.TSRestType, typeAnnotation: TSTypeKind): TSRestType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSRestType]
  }
}

