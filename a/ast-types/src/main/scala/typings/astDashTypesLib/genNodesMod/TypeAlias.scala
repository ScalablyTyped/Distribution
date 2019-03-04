package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TypeAlias
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind
     with astDashTypesLib.genKindsMod.TypeAliasKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var right: astDashTypesLib.genKindsMod.FlowTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TypeAlias
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null
}

object TypeAlias {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    right: astDashTypesLib.genKindsMod.FlowTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TypeAlias,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind = null
  ): TypeAlias = {
    val __obj = js.Dynamic.literal(id = id, right = right)
    __obj.updateDynamic("type")(`type`)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TypeAlias]
  }
}

