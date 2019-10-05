package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ClassBodyKind
import typings.astDashTypes.genKindsMod.ClassImplementsKind
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TSExpressionWithTypeArgumentsKind
import typings.astDashTypes.genKindsMod.TSTypeParameterDeclarationKind
import typings.astDashTypes.genKindsMod.TSTypeParameterInstantiationKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ClassDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: ClassBodyKind
  var id: IdentifierKind | Null
  var implements: js.UndefOr[js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]] = js.undefined
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  var superTypeParameters: js.UndefOr[TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ClassDeclaration
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassDeclaration")
@js.native
object ClassDeclaration extends TopLevel[Type[ClassDeclaration]]

