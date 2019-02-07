package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnaryExpressionBuilder extends js.Object {
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`!`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`!`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    prefix: scala.Boolean
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`+`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`+`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    prefix: scala.Boolean
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`-`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`-`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    prefix: scala.Boolean
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`~`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`~`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    prefix: scala.Boolean
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.delete,
    argument: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.delete,
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    prefix: scala.Boolean
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.typeof,
    argument: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.typeof,
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    prefix: scala.Boolean
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.void,
    argument: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.void,
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    prefix: scala.Boolean
  ): astDashTypesLib.genNodesMod.UnaryExpression = js.native
  def from(params: astDashTypesLib.`Anon_`): astDashTypesLib.genNodesMod.UnaryExpression = js.native
}

