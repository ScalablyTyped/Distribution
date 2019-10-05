package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSImportTypeKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTypeQuery
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeQuery
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeQuery")
@js.native
object TSTypeQuery extends TopLevel[Type[TSTypeQuery]]

