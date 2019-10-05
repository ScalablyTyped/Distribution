package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Blocks
import typings.astDashTypes.genKindsMod.ComprehensionBlockKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.GeneratorExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorExpressionBuilder extends js.Object {
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): GeneratorExpression = js.native
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): GeneratorExpression = js.native
  def from(params: Anon_Blocks): GeneratorExpression = js.native
}

