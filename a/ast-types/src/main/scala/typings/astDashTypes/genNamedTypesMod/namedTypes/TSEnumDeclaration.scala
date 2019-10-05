package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TSEnumMemberKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSEnumDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var const: js.UndefOr[Boolean] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var id: IdentifierKind
  var initializer: js.UndefOr[ExpressionKind | Null] = js.undefined
  var members: js.Array[TSEnumMemberKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TSEnumDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSEnumDeclaration")
@js.native
object TSEnumDeclaration extends TopLevel[Type[TSEnumDeclaration]]

