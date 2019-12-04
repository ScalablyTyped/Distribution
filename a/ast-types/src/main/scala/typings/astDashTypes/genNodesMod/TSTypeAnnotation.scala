package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TSTypeAnnotation extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeAnnotation
  var typeAnnotation: TSTypeKind | TSTypeAnnotationKind
}

object TSTypeAnnotation {
  @scala.inline
  def apply(
    `type`: typings.astDashTypes.astDashTypesStrings.TSTypeAnnotation,
    typeAnnotation: TSTypeKind | TSTypeAnnotationKind
  ): TSTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeAnnotation]
  }
}

