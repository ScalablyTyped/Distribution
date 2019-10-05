package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsExpressionExtra
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSAsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSAsExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind, typeAnnotation: TSTypeKind): TSAsExpression = js.native
  def from(params: Anon_CommentsExpressionExtra): TSAsExpression = js.native
}

