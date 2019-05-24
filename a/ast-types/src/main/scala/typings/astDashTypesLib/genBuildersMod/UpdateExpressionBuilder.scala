package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExpressionBuilder extends js.Object {
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`++`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    prefix: scala.Boolean
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.UpdateExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`--`,
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    prefix: scala.Boolean
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.UpdateExpression = js.native
  def from(params: astDashTypesLib.Anon_ArgumentCommentsLoc): astDashTypesLib.genNamedTypesMod.namedTypesNs.UpdateExpression = js.native
}

