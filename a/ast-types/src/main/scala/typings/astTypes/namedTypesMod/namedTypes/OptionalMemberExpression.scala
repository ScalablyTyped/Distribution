package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.MemberExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression[P]} */ trait OptionalMemberExpression
  extends ASTNode
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astTypes.astTypesStrings.OptionalMemberExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.OptionalMemberExpression")
@js.native
object OptionalMemberExpression extends TopLevel[Type[OptionalMemberExpression]]

