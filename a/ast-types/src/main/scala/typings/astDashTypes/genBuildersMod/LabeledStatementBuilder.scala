package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsLabel
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.LabeledStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabeledStatementBuilder extends js.Object {
  def apply(label: IdentifierKind, body: StatementKind): LabeledStatement = js.native
  def from(params: Anon_BodyCommentsLabel): LabeledStatement = js.native
}

