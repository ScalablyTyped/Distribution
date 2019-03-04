package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSTypeQuery
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var exprName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind | astDashTypesLib.genKindsMod.TSImportTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeQuery
}

object TSTypeQuery {
  @scala.inline
  def apply(
    exprName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind | astDashTypesLib.genKindsMod.TSImportTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeQuery
  ): TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TSTypeQuery]
  }
}

