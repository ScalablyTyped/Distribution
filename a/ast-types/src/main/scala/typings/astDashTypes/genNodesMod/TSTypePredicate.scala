package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSThisTypeKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSTypeAnnotation, 'type' | 'typeAnnotation'> ]: ast-types.ast-types/gen/nodes.TSTypeAnnotation[P]} */ trait TSTypePredicate extends ASTNode {
  var parameterName: IdentifierKind | TSThisTypeKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypePredicate
  var typeAnnotation: TSTypeAnnotationKind
}

object TSTypePredicate {
  @scala.inline
  def apply(
    parameterName: IdentifierKind | TSThisTypeKind,
    `type`: typings.astDashTypes.astDashTypesStrings.TSTypePredicate,
    typeAnnotation: TSTypeAnnotationKind
  ): TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypePredicate]
  }
}

