package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSIndexSignature
  extends TSHasOptionalTypeAnnotation
     with ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind {
  var parameters: js.Array[astDashTypesLib.genKindsMod.IdentifierKind]
  var readonly: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSIndexSignature
}

object TSIndexSignature {
  @scala.inline
  def apply(
    parameters: js.Array[astDashTypesLib.genKindsMod.IdentifierKind],
    readonly: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSIndexSignature,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null
  ): TSIndexSignature = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("readonly")(readonly)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSIndexSignature]
  }
}

