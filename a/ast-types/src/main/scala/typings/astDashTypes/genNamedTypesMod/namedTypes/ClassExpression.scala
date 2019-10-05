package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ClassBodyKind
import typings.astDashTypes.genKindsMod.ClassImplementsKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ClassExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var body: ClassBodyKind
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  var implements: js.UndefOr[js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]] = js.undefined
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  var superTypeParameters: js.UndefOr[TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ClassExpression
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassExpression")
@js.native
object ClassExpression extends TopLevel[Type[ClassExpression]]

