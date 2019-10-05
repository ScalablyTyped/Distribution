package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsLeftLoc
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.VariableDeclarationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ForOfStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForOfStatementBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def from(params: Anon_BodyCommentsLeftLoc): ForOfStatement = js.native
}

