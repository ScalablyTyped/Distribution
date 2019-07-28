package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsComputedLocObjectOptional
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.OptionalMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalMemberExpressionBuilder extends js.Object {
  def apply(`object`: ExpressionKind, property: ExpressionKind): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  def from(params: Anon_CommentsComputedLocObjectOptional): OptionalMemberExpression = js.native
}

