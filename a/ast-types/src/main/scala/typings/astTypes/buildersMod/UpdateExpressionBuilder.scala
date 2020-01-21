package typings.astTypes.buildersMod

import typings.astTypes.AnonArgumentCommentsLoc
import typings.astTypes.astTypesStrings.PlussignPlussign
import typings.astTypes.astTypesStrings.`--`
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.UpdateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExpressionBuilder extends js.Object {
  def apply(operator: PlussignPlussign, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def apply(operator: `--`, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def from(params: AnonArgumentCommentsLoc): UpdateExpression = js.native
}

