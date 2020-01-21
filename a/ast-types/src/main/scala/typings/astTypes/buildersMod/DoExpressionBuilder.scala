package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsLocArrayCommentKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.DoExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoExpressionBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): DoExpression = js.native
  def from(params: AnonBodyCommentsLocArrayCommentKind): DoExpression = js.native
}

