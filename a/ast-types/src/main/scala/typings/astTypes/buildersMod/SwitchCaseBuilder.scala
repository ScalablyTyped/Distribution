package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsConsequent
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.SwitchCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchCaseBuilder extends js.Object {
  def apply(test: Null, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def apply(test: ExpressionKind, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def from(params: AnonCommentsConsequent): SwitchCase = js.native
}

