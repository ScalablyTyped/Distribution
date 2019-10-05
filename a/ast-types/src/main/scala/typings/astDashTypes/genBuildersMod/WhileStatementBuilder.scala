package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsLocTest
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.WhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhileStatementBuilder extends js.Object {
  def apply(test: ExpressionKind, body: StatementKind): WhileStatement = js.native
  def from(params: Anon_BodyCommentsLocTest): WhileStatement = js.native
}

