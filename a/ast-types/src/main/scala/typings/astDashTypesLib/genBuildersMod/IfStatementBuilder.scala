package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatementBuilder extends js.Object {
  def apply(
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    consequent: astDashTypesLib.genKindsMod.StatementKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.IfStatement = js.native
  def apply(
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    consequent: astDashTypesLib.genKindsMod.StatementKind,
    alternate: astDashTypesLib.genKindsMod.StatementKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.IfStatement = js.native
  def from(params: astDashTypesLib.Anon_Alternate): astDashTypesLib.genNamedTypesMod.namedTypesNs.IfStatement = js.native
}

