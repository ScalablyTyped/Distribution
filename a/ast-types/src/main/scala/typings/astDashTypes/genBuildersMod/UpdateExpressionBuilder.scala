package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_ArgumentCommentsLoc
import typings.astDashTypes.astDashTypesStrings.PlussignPlussign
import typings.astDashTypes.astDashTypesStrings.`--`
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.UpdateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExpressionBuilder extends js.Object {
  def apply(operator: PlussignPlussign, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def apply(operator: `--`, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def from(params: Anon_ArgumentCommentsLoc): UpdateExpression = js.native
}

