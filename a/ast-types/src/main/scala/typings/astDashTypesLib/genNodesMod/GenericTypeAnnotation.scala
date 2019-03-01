package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait GenericTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.GenericTypeAnnotation
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | scala.Null
}

object GenericTypeAnnotation {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.GenericTypeAnnotation,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind = null
  ): GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[GenericTypeAnnotation]
  }
}

