package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_ArgumentsCallee
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.OptionalCallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalCallExpressionBuilder extends js.Object {
  def apply(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): OptionalCallExpression = js.native
  def apply(
    callee: ExpressionKind,
    argumentsParam: js.Array[ExpressionKind | SpreadElementKind],
    optional: Boolean
  ): OptionalCallExpression = js.native
  def from(params: Anon_ArgumentsCallee): OptionalCallExpression = js.native
}

