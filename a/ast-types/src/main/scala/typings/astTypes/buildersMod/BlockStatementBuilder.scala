package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyComments
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.BlockStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockStatementBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): BlockStatement = js.native
  def from(params: AnonBodyComments): BlockStatement = js.native
}

