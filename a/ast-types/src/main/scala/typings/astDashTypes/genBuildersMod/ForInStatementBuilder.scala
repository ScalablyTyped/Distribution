package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsLeft
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.VariableDeclarationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ForInStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForInStatementBuilder extends js.Object {
  def apply(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  def from(params: Anon_BodyCommentsLeft): ForInStatement = js.native
}

