package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Blocks
import typings.astDashTypes.genKindsMod.ComprehensionBlockKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ComprehensionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehensionExpressionBuilder extends js.Object {
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): ComprehensionExpression = js.native
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): ComprehensionExpression = js.native
  def from(params: Anon_Blocks): ComprehensionExpression = js.native
}

