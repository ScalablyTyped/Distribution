package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionExpressionBuilder extends js.Object {
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.FunctionExpression = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    generator: scala.Boolean
  ): astDashTypesLib.genNodesMod.FunctionExpression = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    generator: scala.Boolean,
    expression: scala.Boolean
  ): astDashTypesLib.genNodesMod.FunctionExpression = js.native
  def apply(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.FunctionExpression = js.native
  def apply(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    generator: scala.Boolean
  ): astDashTypesLib.genNodesMod.FunctionExpression = js.native
  def apply(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    generator: scala.Boolean,
    expression: scala.Boolean
  ): astDashTypesLib.genNodesMod.FunctionExpression = js.native
  def apply(
    id: scala.Null,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.FunctionExpression = js.native
  def apply(
    id: scala.Null,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    generator: scala.Boolean
  ): astDashTypesLib.genNodesMod.FunctionExpression = js.native
  def apply(
    id: scala.Null,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    generator: scala.Boolean,
    expression: scala.Boolean
  ): astDashTypesLib.genNodesMod.FunctionExpression = js.native
  def from(params: astDashTypesLib.Anon_AsyncBody): astDashTypesLib.genNodesMod.FunctionExpression = js.native
}

