package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait MemberTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `object`: astDashTypesLib.genKindsMod.IdentifierKind
  var property: astDashTypesLib.genKindsMod.MemberTypeAnnotationKind | astDashTypesLib.genKindsMod.GenericTypeAnnotationKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.MemberTypeAnnotation
}

object MemberTypeAnnotation {
  @scala.inline
  def apply(
    `object`: astDashTypesLib.genKindsMod.IdentifierKind,
    property: astDashTypesLib.genKindsMod.MemberTypeAnnotationKind | astDashTypesLib.genKindsMod.GenericTypeAnnotationKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.MemberTypeAnnotation
  ): MemberTypeAnnotation = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MemberTypeAnnotation]
  }
}

