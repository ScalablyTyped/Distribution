package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TSExternalModuleReferenceKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSImportEqualsDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var id: IdentifierKind
  var isExport: js.UndefOr[Boolean] = js.undefined
  var moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSImportEqualsDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSImportEqualsDeclaration")
@js.native
object TSImportEqualsDeclaration extends TopLevel[Type[TSImportEqualsDeclaration]]

