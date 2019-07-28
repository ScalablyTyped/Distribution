package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsLoc
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStatementBuilder extends js.Object {
  def apply(`object`: ExpressionKind, body: StatementKind): WithStatement = js.native
  def from(params: Anon_BodyCommentsLoc): WithStatement = js.native
}

