package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.MemberExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait MemberExpression
  extends ASTNode
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  var computed: js.UndefOr[Boolean] = js.undefined
  var `object`: ExpressionKind
  var property: IdentifierKind | ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.MemberExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.MemberExpression")
@js.native
object MemberExpression extends TopLevel[Type[MemberExpression]]

