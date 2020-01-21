package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsComputedLocObject
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXMemberExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXMemberExpressionBuilder extends js.Object {
  def apply(`object`: JSXIdentifierKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def apply(`object`: JSXMemberExpressionKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def from(params: AnonCommentsComputedLocObject): JSXMemberExpression = js.native
}

