package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_
import typings.astDashTypes.astDashTypesStrings.Exclamationmark
import typings.astDashTypes.astDashTypesStrings.Plussign
import typings.astDashTypes.astDashTypesStrings.Tilde
import typings.astDashTypes.astDashTypesStrings.`-_`
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
  def apply(operator: Exclamationmark, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: Exclamationmark, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: Plussign, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: Plussign, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: Tilde, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: Tilde, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `-_`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `-_`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def from(params: Anon_): UnaryExpression = js.native
}

