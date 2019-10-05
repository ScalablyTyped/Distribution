package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsExpressionsLoc
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.TemplateElementKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLiteralBuilder extends js.Object {
  def apply(quasis: js.Array[TemplateElementKind], expressions: js.Array[ExpressionKind]): TemplateLiteral = js.native
  def from(params: Anon_CommentsExpressionsLoc): TemplateLiteral = js.native
}

