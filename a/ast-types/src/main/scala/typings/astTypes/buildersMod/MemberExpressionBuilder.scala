package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsComputedLoc
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.MemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberExpressionBuilder extends js.Object {
  def apply(`object`: ExpressionKind, property: ExpressionKind): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): MemberExpression = js.native
  def from(params: AnonCommentsComputedLoc): MemberExpression = js.native
}

