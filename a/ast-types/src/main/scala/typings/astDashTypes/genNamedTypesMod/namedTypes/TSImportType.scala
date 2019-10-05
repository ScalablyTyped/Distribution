package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TSHasOptionalTypeParameterInstantiationKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSImportType
  extends TSHasOptionalTypeParameterInstantiation
     with ASTNode
     with NodeKind
     with PrintableKind
     with TSHasOptionalTypeParameterInstantiationKind
     with TSTypeKind {
  var argument: StringLiteralKind
  var qualifier: js.UndefOr[IdentifierKind | TSQualifiedNameKind] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.TSImportType
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSImportType")
@js.native
object TSImportType extends TopLevel[Type[TSImportType]]

