package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Cases
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SwitchCaseKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.SwitchStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchStatementBuilder extends js.Object {
  def apply(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind]): SwitchStatement = js.native
  def apply(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind], lexical: Boolean): SwitchStatement = js.native
  def from(params: Anon_Cases): SwitchStatement = js.native
}

