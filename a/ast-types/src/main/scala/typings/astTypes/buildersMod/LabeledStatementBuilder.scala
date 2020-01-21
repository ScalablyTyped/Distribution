package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsLabel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.LabeledStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabeledStatementBuilder extends js.Object {
  def apply(label: IdentifierKind, body: StatementKind): LabeledStatement = js.native
  def from(params: AnonBodyCommentsLabel): LabeledStatement = js.native
}

