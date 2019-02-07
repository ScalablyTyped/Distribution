package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowFunctionExpressionBuilder extends js.Object {
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.ArrowFunctionExpression = js.native
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    expression: scala.Boolean
  ): astDashTypesLib.genNodesMod.ArrowFunctionExpression = js.native
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.ArrowFunctionExpression = js.native
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.ExpressionKind,
    expression: scala.Boolean
  ): astDashTypesLib.genNodesMod.ArrowFunctionExpression = js.native
  def from(params: astDashTypesLib.Anon_AsyncBodyComments): astDashTypesLib.genNodesMod.ArrowFunctionExpression = js.native
}

