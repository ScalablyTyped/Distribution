package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedTemplateExpressionBuilder extends js.Object {
  def apply(
    tag: astDashTypesLib.genKindsMod.ExpressionKind,
    quasi: astDashTypesLib.genKindsMod.TemplateLiteralKind
  ): astDashTypesLib.genNodesMod.TaggedTemplateExpression = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocQuasi): astDashTypesLib.genNodesMod.TaggedTemplateExpression = js.native
}

