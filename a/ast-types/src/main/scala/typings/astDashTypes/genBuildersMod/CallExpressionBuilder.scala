package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Arguments
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.CallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallExpressionBuilder extends js.Object {
  def apply(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): CallExpression = js.native
  def from(params: Anon_Arguments): CallExpression = js.native
}

