package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Callee
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.BindExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindExpressionBuilder extends js.Object {
  def apply(`object`: Null, callee: ExpressionKind): BindExpression = js.native
  def apply(`object`: ExpressionKind, callee: ExpressionKind): BindExpression = js.native
  def from(params: Anon_Callee): BindExpression = js.native
}

