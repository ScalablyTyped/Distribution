package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsComputedLocObject
import typings.astDashTypes.genKindsMod.JSXIdentifierKind
import typings.astDashTypes.genKindsMod.JSXMemberExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXMemberExpressionBuilder extends js.Object {
  def apply(`object`: JSXIdentifierKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def apply(`object`: JSXMemberExpressionKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def from(params: Anon_CommentsComputedLocObject): JSXMemberExpression = js.native
}

