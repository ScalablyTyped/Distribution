package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorExpressionBuilder extends js.Object {
  def apply(
    body: astDashTypesLib.genKindsMod.ExpressionKind,
    blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.GeneratorExpression = js.native
  def apply(
    body: astDashTypesLib.genKindsMod.ExpressionKind,
    blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind],
    filter: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.GeneratorExpression = js.native
  def from(params: astDashTypesLib.Anon_Blocks): astDashTypesLib.genNamedTypesMod.namedTypesNs.GeneratorExpression = js.native
}

