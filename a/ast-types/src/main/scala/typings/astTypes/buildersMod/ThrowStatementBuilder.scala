package typings.astTypes.buildersMod

import typings.astTypes.AnonArgumentComments
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ThrowStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowStatementBuilder extends js.Object {
  def apply(argument: ExpressionKind): ThrowStatement = js.native
  def from(params: AnonArgumentComments): ThrowStatement = js.native
}

