package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsConsequent
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.SwitchCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchCaseBuilder extends js.Object {
  def apply(test: Null, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def apply(test: ExpressionKind, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def from(params: Anon_CommentsConsequent): SwitchCase = js.native
}

