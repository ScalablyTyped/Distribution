package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSIndexSignature
  extends TSHasOptionalTypeAnnotation
     with ASTNode {
  var parameters: js.Array[IdentifierKind]
  var readonly: Boolean
  var `type`: typings.astDashTypes.astDashTypesStrings.TSIndexSignature
}

object TSIndexSignature {
  @scala.inline
  def apply(
    parameters: js.Array[IdentifierKind],
    readonly: Boolean,
    `type`: typings.astDashTypes.astDashTypesStrings.TSIndexSignature,
    typeAnnotation: TSTypeAnnotationKind = null
  ): TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSIndexSignature]
  }
}

