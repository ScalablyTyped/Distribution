package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchStatementBuilder extends js.Object {
  def apply(
    discriminant: astDashTypesLib.genKindsMod.ExpressionKind,
    cases: js.Array[astDashTypesLib.genKindsMod.SwitchCaseKind]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchStatement = js.native
  def apply(
    discriminant: astDashTypesLib.genKindsMod.ExpressionKind,
    cases: js.Array[astDashTypesLib.genKindsMod.SwitchCaseKind],
    lexical: scala.Boolean
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchStatement = js.native
  def from(params: astDashTypesLib.Anon_Cases): astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchStatement = js.native
}

