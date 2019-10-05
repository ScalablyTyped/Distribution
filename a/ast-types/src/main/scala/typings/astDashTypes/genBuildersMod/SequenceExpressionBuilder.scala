package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsExpressions
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.SequenceExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceExpressionBuilder extends js.Object {
  def apply(expressions: js.Array[ExpressionKind]): SequenceExpression = js.native
  def from(params: Anon_CommentsExpressions): SequenceExpression = js.native
}

