package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehensionExpressionBuilder extends js.Object {
  def apply(
    body: astDashTypesLib.genKindsMod.ExpressionKind,
    blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind]
  ): astDashTypesLib.genNodesMod.ComprehensionExpression = js.native
  def apply(
    body: astDashTypesLib.genKindsMod.ExpressionKind,
    blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind],
    filter: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.ComprehensionExpression = js.native
  def from(params: astDashTypesLib.Anon_Blocks): astDashTypesLib.genNodesMod.ComprehensionExpression = js.native
}

