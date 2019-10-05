package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Alternate
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.IfStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatementBuilder extends js.Object {
  def apply(test: ExpressionKind, consequent: StatementKind): IfStatement = js.native
  def apply(test: ExpressionKind, consequent: StatementKind, alternate: StatementKind): IfStatement = js.native
  def from(params: Anon_Alternate): IfStatement = js.native
}

