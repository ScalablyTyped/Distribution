package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLabel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.BreakStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakStatementBuilder extends js.Object {
  def apply(): BreakStatement = js.native
  def apply(label: IdentifierKind): BreakStatement = js.native
  def from(params: AnonCommentsLabel): BreakStatement = js.native
}

