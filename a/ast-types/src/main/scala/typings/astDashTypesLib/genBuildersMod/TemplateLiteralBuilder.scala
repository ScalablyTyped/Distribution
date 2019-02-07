package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLiteralBuilder extends js.Object {
  def apply(
    quasis: js.Array[astDashTypesLib.genKindsMod.TemplateElementKind],
    expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind]
  ): astDashTypesLib.genNodesMod.TemplateLiteral = js.native
  def from(params: astDashTypesLib.Anon_CommentsExpressionsLoc): astDashTypesLib.genNodesMod.TemplateLiteral = js.native
}

