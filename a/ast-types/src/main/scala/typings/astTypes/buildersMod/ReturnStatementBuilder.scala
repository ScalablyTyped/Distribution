package typings.astTypes.buildersMod

import typings.astTypes.AnonArgument
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ReturnStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnStatementBuilder extends js.Object {
  def apply(): ReturnStatement = js.native
  def apply(argument: ExpressionKind): ReturnStatement = js.native
  def from(params: AnonArgument): ReturnStatement = js.native
}

