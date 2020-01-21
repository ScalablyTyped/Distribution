package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocQuasi
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TemplateLiteralKind
import typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedTemplateExpressionBuilder extends js.Object {
  def apply(tag: ExpressionKind, quasi: TemplateLiteralKind): TaggedTemplateExpression = js.native
  def from(params: AnonCommentsLocQuasi): TaggedTemplateExpression = js.native
}

