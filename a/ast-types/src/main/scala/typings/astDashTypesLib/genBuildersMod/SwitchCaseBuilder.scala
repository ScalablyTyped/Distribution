package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchCaseBuilder extends js.Object {
  def apply(
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    consequent: js.Array[astDashTypesLib.genKindsMod.StatementKind]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchCase = js.native
  def apply(test: scala.Null, consequent: js.Array[astDashTypesLib.genKindsMod.StatementKind]): astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchCase = js.native
  def from(params: astDashTypesLib.Anon_CommentsConsequent): astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchCase = js.native
}

