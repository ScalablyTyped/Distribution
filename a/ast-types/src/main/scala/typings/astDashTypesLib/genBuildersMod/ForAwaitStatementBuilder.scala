package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForAwaitStatementBuilder extends js.Object {
  def apply(
    left: astDashTypesLib.genKindsMod.ExpressionKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    body: astDashTypesLib.genKindsMod.StatementKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.ForAwaitStatement = js.native
  def apply(
    left: astDashTypesLib.genKindsMod.VariableDeclarationKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    body: astDashTypesLib.genKindsMod.StatementKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.ForAwaitStatement = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsLeft): astDashTypesLib.genNamedTypesMod.namedTypesNs.ForAwaitStatement = js.native
}

