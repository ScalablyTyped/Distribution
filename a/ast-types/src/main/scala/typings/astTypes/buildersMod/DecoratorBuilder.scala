package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExpression
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.Decorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorBuilder extends js.Object {
  def apply(expression: ExpressionKind): Decorator = js.native
  def from(params: AnonCommentsExpression): Decorator = js.native
}

