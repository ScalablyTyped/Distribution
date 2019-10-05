package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExportBatchSpecifierKind
import typings.astDashTypes.genKindsMod.ExportSpecifierKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ExportDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var declaration: DeclarationKind | ExpressionKind | Null
  var default: Boolean
  var source: js.UndefOr[LiteralKind | Null] = js.undefined
  var specifiers: js.UndefOr[js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ExportDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ExportDeclaration")
@js.native
object ExportDeclaration extends TopLevel[Type[ExportDeclaration]]

