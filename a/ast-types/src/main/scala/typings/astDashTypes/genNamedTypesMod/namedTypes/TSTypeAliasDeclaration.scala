package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TSHasOptionalTypeParametersKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSTypeAliasDeclaration
  extends TSHasOptionalTypeParameters
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeParametersKind {
  var declare: js.UndefOr[Boolean] = js.undefined
  var id: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeAliasDeclaration
  var typeAnnotation: TSTypeKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeAliasDeclaration")
@js.native
object TSTypeAliasDeclaration extends TopLevel[Type[TSTypeAliasDeclaration]]

