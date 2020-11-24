package typings.astTypes.buildersMod

import typings.astTypes.anon.Operator
import typings.astTypes.astTypesStrings.Exclamationmark
import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.Tilde
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.astTypesStrings.delete
import typings.astTypes.astTypesStrings.typeof
import typings.astTypes.astTypesStrings.void
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.UnaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def from(params: Operator): UnaryExpression = js.native
}
