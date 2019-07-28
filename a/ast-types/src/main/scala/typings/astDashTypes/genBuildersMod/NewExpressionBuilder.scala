package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Arguments
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.NewExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewExpressionBuilder extends js.Object {
  def apply(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): NewExpression = js.native
  def from(params: Anon_Arguments): NewExpression = js.native
}

