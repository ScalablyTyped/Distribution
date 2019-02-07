package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatchClauseBuilder extends js.Object {
  def apply(
    param: astDashTypesLib.genKindsMod.PatternKind,
    guard: astDashTypesLib.genKindsMod.ExpressionKind,
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.CatchClause = js.native
  def apply(
    param: astDashTypesLib.genKindsMod.PatternKind,
    guard: js.UndefOr[scala.Nothing],
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.CatchClause = js.native
  def apply(
    param: astDashTypesLib.genKindsMod.PatternKind,
    guard: scala.Null,
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.CatchClause = js.native
  def apply(
    param: js.UndefOr[scala.Nothing],
    guard: astDashTypesLib.genKindsMod.ExpressionKind,
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.CatchClause = js.native
  def apply(
    param: js.UndefOr[scala.Nothing],
    guard: js.UndefOr[scala.Nothing],
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.CatchClause = js.native
  def apply(
    param: js.UndefOr[scala.Nothing],
    guard: scala.Null,
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.CatchClause = js.native
  def apply(
    param: scala.Null,
    guard: astDashTypesLib.genKindsMod.ExpressionKind,
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.CatchClause = js.native
  def apply(
    param: scala.Null,
    guard: js.UndefOr[scala.Nothing],
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.CatchClause = js.native
  def apply(param: scala.Null, guard: scala.Null, body: astDashTypesLib.genKindsMod.BlockStatementKind): astDashTypesLib.genNodesMod.CatchClause = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsGuard): astDashTypesLib.genNodesMod.CatchClause = js.native
}

