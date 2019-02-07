package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForOfStatementBuilder extends js.Object {
  def apply(
    left: astDashTypesLib.genKindsMod.PatternKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    body: astDashTypesLib.genKindsMod.StatementKind
  ): astDashTypesLib.genNodesMod.ForOfStatement = js.native
  def apply(
    left: astDashTypesLib.genKindsMod.VariableDeclarationKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    body: astDashTypesLib.genKindsMod.StatementKind
  ): astDashTypesLib.genNodesMod.ForOfStatement = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsLeftLoc): astDashTypesLib.genNodesMod.ForOfStatement = js.native
}

