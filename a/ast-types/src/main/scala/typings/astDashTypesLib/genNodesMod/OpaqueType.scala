package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait OpaqueType
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var impltype: astDashTypesLib.genKindsMod.FlowTypeKind
  var supertype: astDashTypesLib.genKindsMod.FlowTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.OpaqueType
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null
}

object OpaqueType {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    impltype: astDashTypesLib.genKindsMod.FlowTypeKind,
    supertype: astDashTypesLib.genKindsMod.FlowTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.OpaqueType,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind = null
  ): OpaqueType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("impltype")(impltype)
    __obj.updateDynamic("supertype")(supertype)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[OpaqueType]
  }
}

