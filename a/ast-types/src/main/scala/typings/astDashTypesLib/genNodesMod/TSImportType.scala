package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSImportType
  extends TSHasOptionalTypeParameterInstantiation
     with ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeParameterInstantiationKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var argument: astDashTypesLib.genKindsMod.StringLiteralKind
  var qualifier: js.UndefOr[
    astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSImportType
}

object TSImportType {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.StringLiteralKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSImportType,
    qualifier: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind = null
  ): TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument)
    __obj.updateDynamic("type")(`type`)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSImportType]
  }
}

