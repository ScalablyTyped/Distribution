package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalExpressionBuilder extends js.Object {
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`&&`,
    left: astDashTypesLib.genKindsMod.ExpressionKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.LogicalExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`??`,
    left: astDashTypesLib.genKindsMod.ExpressionKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.LogicalExpression = js.native
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`||`,
    left: astDashTypesLib.genKindsMod.ExpressionKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.LogicalExpression = js.native
  def from(params: astDashTypesLib.Anon_CommentsLeftLoc): astDashTypesLib.genNamedTypesMod.namedTypesNs.LogicalExpression = js.native
}

