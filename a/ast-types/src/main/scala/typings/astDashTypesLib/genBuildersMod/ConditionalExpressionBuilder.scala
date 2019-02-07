package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalExpressionBuilder extends js.Object {
  def apply(
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    consequent: astDashTypesLib.genKindsMod.ExpressionKind,
    alternate: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.ConditionalExpression = js.native
  def from(params: astDashTypesLib.Anon_AlternateComments): astDashTypesLib.genNodesMod.ConditionalExpression = js.native
}

