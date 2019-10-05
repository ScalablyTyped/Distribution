package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_AlternateComments
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ConditionalExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalExpressionBuilder extends js.Object {
  def apply(test: ExpressionKind, consequent: ExpressionKind, alternate: ExpressionKind): ConditionalExpression = js.native
  def from(params: Anon_AlternateComments): ConditionalExpression = js.native
}

