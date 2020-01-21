package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXMemberExpressionKind
import typings.astTypes.kindsMod.MemberExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression, 'type' | 'object' | 'property' | 'computed'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression[P]} */ trait JSXMemberExpression
  extends ASTNode
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  var computed: js.UndefOr[Boolean] = js.undefined
  var `object`: JSXIdentifierKind | JSXMemberExpressionKind
  var property: JSXIdentifierKind
  var `type`: typings.astTypes.astTypesStrings.JSXMemberExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXMemberExpression")
@js.native
object JSXMemberExpression extends TopLevel[Type[JSXMemberExpression]]

