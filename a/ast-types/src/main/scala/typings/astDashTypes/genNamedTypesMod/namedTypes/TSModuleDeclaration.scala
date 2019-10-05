package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TSModuleBlockKind
import typings.astDashTypes.genKindsMod.TSModuleDeclarationKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSModuleDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: js.UndefOr[TSModuleBlockKind | TSModuleDeclarationKind | Null] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSModuleDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSModuleDeclaration")
@js.native
object TSModuleDeclaration extends TopLevel[Type[TSModuleDeclaration]]

