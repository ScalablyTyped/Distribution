package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForInStatementBuilder extends js.Object {
  def apply(
    left: astDashTypesLib.genKindsMod.ExpressionKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    body: astDashTypesLib.genKindsMod.StatementKind
  ): astDashTypesLib.genNodesMod.ForInStatement = js.native
  def apply(
    left: astDashTypesLib.genKindsMod.VariableDeclarationKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    body: astDashTypesLib.genKindsMod.StatementKind
  ): astDashTypesLib.genNodesMod.ForInStatement = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsLeft): astDashTypesLib.genNodesMod.ForInStatement = js.native
}

