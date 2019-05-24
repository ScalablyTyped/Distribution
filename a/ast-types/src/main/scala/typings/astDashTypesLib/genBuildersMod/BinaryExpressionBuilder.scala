package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryExpressionBuilder extends js.Object {
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`==` | astDashTypesLib.astDashTypesLibStrings.`!=` | astDashTypesLib.astDashTypesLibStrings.`===` | astDashTypesLib.astDashTypesLibStrings.`!==` | astDashTypesLib.astDashTypesLibStrings.`<` | astDashTypesLib.astDashTypesLibStrings.`<=` | astDashTypesLib.astDashTypesLibStrings.`>` | astDashTypesLib.astDashTypesLibStrings.`>=` | astDashTypesLib.astDashTypesLibStrings.`<<` | astDashTypesLib.astDashTypesLibStrings.`>>` | astDashTypesLib.astDashTypesLibStrings.`>>>` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`*` | astDashTypesLib.astDashTypesLibStrings.`/` | astDashTypesLib.astDashTypesLibStrings.`%` | astDashTypesLib.astDashTypesLibStrings.`**` | astDashTypesLib.astDashTypesLibStrings.`&` | astDashTypesLib.astDashTypesLibStrings.`|` | astDashTypesLib.astDashTypesLibStrings.`_backtick^_backtick` | astDashTypesLib.astDashTypesLibStrings.in | astDashTypesLib.astDashTypesLibStrings.instanceof,
    left: astDashTypesLib.genKindsMod.ExpressionKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.BinaryExpression = js.native
  def from(params: astDashTypesLib.Anon_CommentsIn): astDashTypesLib.genNamedTypesMod.namedTypesNs.BinaryExpression = js.native
}

