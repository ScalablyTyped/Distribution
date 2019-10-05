package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_
import typings.astDashTypes.astDashTypesStrings.`!`
import typings.astDashTypes.astDashTypesStrings.`+`
import typings.astDashTypes.astDashTypesStrings.`-`
import typings.astDashTypes.astDashTypesStrings.`~`
import typings.astDashTypes.astDashTypesStrings.delete
import typings.astDashTypes.astDashTypesStrings.typeof
import typings.astDashTypes.astDashTypesStrings.void
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.UnaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnaryExpressionBuilder extends js.Object {
  def apply(operator: `!`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `!`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `+`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `+`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `-`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `-`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `~`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `~`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def from(params: Anon_): UnaryExpression = js.native
}

