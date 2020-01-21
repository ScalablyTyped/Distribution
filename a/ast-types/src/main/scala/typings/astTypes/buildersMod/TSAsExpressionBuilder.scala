package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExpressionExtra
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSAsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSAsExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind, typeAnnotation: TSTypeKind): TSAsExpression = js.native
  def from(params: AnonCommentsExpressionExtra): TSAsExpression = js.native
}

